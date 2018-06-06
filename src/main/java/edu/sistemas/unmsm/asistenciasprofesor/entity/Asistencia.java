package edu.sistemas.unmsm.asistenciasprofesor.entity;

import java.io.Serializable;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "asistencia")
@XmlRootElement
public class Asistencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AsistenciaPK asistenciaPK;
    @Column(name = "hora_llegada")
    @DateTimeFormat(iso=ISO.TIME)
    private LocalTime horaLlegada;
    @JoinColumn(name = "codigo", referencedColumnName = "codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Alumno alumno;
    @JoinColumn(name = "id_sesion", referencedColumnName = "id_sesion", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sesion sesion;

    public Asistencia() {
    }

    public Asistencia(AsistenciaPK asistenciaPK) {
        this.asistenciaPK = asistenciaPK;
    }

    public Asistencia(String idSesion, String codigo) {
        this.asistenciaPK = new AsistenciaPK(idSesion, codigo);
    }

    public AsistenciaPK getAsistenciaPK() {
        return asistenciaPK;
    }

    public void setAsistenciaPK(AsistenciaPK asistenciaPK) {
        this.asistenciaPK = asistenciaPK;
    }
    
    public LocalTime getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(LocalTime horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Sesion getSesion() {
        return sesion;
    }

    public void setSesion(Sesion sesion) {
        this.sesion = sesion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (asistenciaPK != null ? asistenciaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asistencia)) {
            return false;
        }
        Asistencia other = (Asistencia) object;
        if ((this.asistenciaPK == null && other.asistenciaPK != null) || (this.asistenciaPK != null && !this.asistenciaPK.equals(other.asistenciaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Asistencia[ asistenciaPK=" + asistenciaPK + " ]";
    }

}