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
public class Momento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMomento;
    private String lugar;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    private String urlImagen;
    private int latitud;
    private int longitud;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    public Momento() {
    }

    public Momento(String lugar, Date fecha, String urlImagen, int latitud, int longitud, Usuario usuario) {
        this.lugar = lugar;
        this.fecha = fecha;
        this.urlImagen = urlImagen;
        this.latitud = latitud;
        this.longitud = longitud;
        this.usuario = usuario;
    }

    public Long getIdMomento() {
        return idMomento;
    }

    public void setIdMomento(Long idMomento) {
        this.idMomento = idMomento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    } 

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
