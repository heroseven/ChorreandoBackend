package pe.edu.ulima.chorreandobackend.models;

/**
 *
 * @author hquintana
 */
public class GestorUsuarios {
    private static GestorUsuarios singleton = null;
    
    public static GestorUsuarios getInstance(){
        if (singleton == null){
            singleton = new GestorUsuarios();
        }
        return singleton;
    }
    
    private GestorUsuarios(){}
    
    public boolean login(String usuario, String password){
        return usuario.equals("android") && password.equals("123");
    }
}
