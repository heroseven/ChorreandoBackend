package pe.edu.ulima.chorreandobackend.dao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Amistad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAmistad;
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario amigo;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public Amistad() {
    }

    public Amistad(Usuario usuario, Usuario amigo, Date fecha) {
        this.usuario = usuario;
        this.amigo = amigo;
        this.fecha = fecha;
    }

    public Long getIdAmistad() {
        return idAmistad;
    }

    public void setIdAmistad(Long idAmistad) {
        this.idAmistad = idAmistad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getAmigo() {
        return amigo;
    }

    public void setAmigo(Usuario amigo) {
        this.amigo = amigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
