package pe.edu.ulima.chorreandobackend.models;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import pe.edu.ulima.chorreandobackend.dao.Momento;

public class GestorMomentos {
    private static GestorMomentos singleton = null;
    
    public static GestorMomentos getInstance(){
        if (singleton == null){
            singleton = new GestorMomentos();
        }
        return singleton;
    }
    
    private GestorMomentos(){}
    
    public List<Momento> obtenerMomentos(long idUsuario){
        EntityManagerFactory emf = 
                Persistence.createEntityManagerFactory(
                        "pe.edu.ulima_ChorreandoBackend_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        
        TypedQuery<Momento> query = 
                em.createQuery(
                        "SELECT m FROM Momento m WHERE m.usuario.idUsuario = :idUsuario",
                        Momento.class);
        List<Momento> res = 
                query.setParameter("idUsuario", idUsuario).getResultList();
        
        em.close();
        emf.close();
        
        return res;
    }
}
