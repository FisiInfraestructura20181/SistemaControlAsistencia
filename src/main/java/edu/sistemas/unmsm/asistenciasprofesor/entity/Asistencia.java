package edu.sistemas.unmsm.asistenciasprofesor.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
    @Basic(optional = false)
    @Column(name = "hora_llegada")
    @DateTimeFormat(iso=ISO.DATE_TIME)
    private LocalDateTime horaLlegada;
    @JoinColumn(name = "codigo", referencedColumnName = "codigo", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Alumno alumno;
    @JoinColumns({
        @JoinColumn(name = "id_sesion", referencedColumnName = "id_sesion", insertable = false, updatable = false),
        @JoinColumn(name = "nro_grupo", referencedColumnName = "nro_grupo", insertable = false, updatable = false),
        @JoinColumn(name = "id_curso", referencedColumnName = "id_curso", insertable = false, updatable = false),
        @JoinColumn(name = "id_profesor", referencedColumnName = "id_profesor", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Sesion sesion;
    
    public Asistencia() {
    }

    public Asistencia(AsistenciaPK asistenciaPK, LocalDateTime horaLlegada) {
        this.asistenciaPK = asistenciaPK;
        this.horaLlegada = horaLlegada;
    }

    public Asistencia(String idSesion, int nroGrupo, String idCurso, String idProfesor, String codigo) {
        this.asistenciaPK = new AsistenciaPK(idSesion, nroGrupo, idCurso, idProfesor, codigo);
    }

    public AsistenciaPK getAsistenciaPK() {
        return asistenciaPK;
    }

    public void setAsistenciaPK(AsistenciaPK asistenciaPK) {
        this.asistenciaPK = asistenciaPK;
    }
    
    public LocalDateTime getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(LocalDateTime horaLlegada) {
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