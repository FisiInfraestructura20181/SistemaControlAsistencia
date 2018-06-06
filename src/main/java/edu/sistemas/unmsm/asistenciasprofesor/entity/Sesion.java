package edu.sistemas.unmsm.asistenciasprofesor.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "sesion")
@XmlRootElement
public class Sesion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_sesion", length = 10)
    private String idSesion;
    @Basic(optional = false)
    @Column(name = "fecha")
    @DateTimeFormat(iso=ISO.DATE)
    private LocalDate fecha;
    @Basic(optional = false)
    @Column(name = "hora_inicio")
    @DateTimeFormat(iso=ISO.TIME)
    private LocalTime horaInicio;
    @Basic(optional = false)
    @Column(name = "hora_fin")
    @DateTimeFormat(iso=ISO.TIME)
    private LocalTime horaFin;
    @Basic(optional = false)
    @Column(name = "hora_tolerancia")
    @DateTimeFormat(iso=ISO.TIME)
    private LocalTime horaTolerancia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sesion")
    private List<Asistencia> asistenciaList;
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso")
    @ManyToOne(optional = false)
    private Curso idCurso;

    public Sesion() {
    }

    public Sesion(String idSesion) {
        this.idSesion = idSesion;
    }

    public Sesion(String idSesion, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, LocalTime horaTolerancia) {
        this.idSesion = idSesion;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.horaTolerancia = horaTolerancia;
    }

    public String getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(String idSesion) {
        this.idSesion = idSesion;
    }

    public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}

	public LocalTime getHoraTolerancia() {
		return horaTolerancia;
	}

	public void setHoraTolerancia(LocalTime horaTolerancia) {
		this.horaTolerancia = horaTolerancia;
	}

	@XmlTransient
    public List<Asistencia> getAsistenciaList() {
        return asistenciaList;
    }

    public void setAsistenciaList(List<Asistencia> asistenciaList) {
        this.asistenciaList = asistenciaList;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSesion != null ? idSesion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sesion)) {
            return false;
        }
        Sesion other = (Sesion) object;
        if ((this.idSesion == null && other.idSesion != null) || (this.idSesion != null && !this.idSesion.equals(other.idSesion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Sesion[ idSesion=" + idSesion + " ]";
    }

}