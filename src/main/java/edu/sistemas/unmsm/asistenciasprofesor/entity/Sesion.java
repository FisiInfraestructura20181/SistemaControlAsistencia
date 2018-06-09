package edu.sistemas.unmsm.asistenciasprofesor.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "Sesion")
@XmlRootElement
public class Sesion implements Serializable {

	private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SesionPK sesionPK;
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
    @Basic(optional = false)
    @Column(name = "token", length = 30)
    private String token;
    @JoinColumns({
        @JoinColumn(name = "nro_grupo", referencedColumnName = "nro_grupo", insertable = false, updatable = false),
        @JoinColumn(name = "id_curso", referencedColumnName = "id_curso", insertable = false, updatable = false),
        @JoinColumn(name = "id_profesor", referencedColumnName = "id_profesor", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Grupo grupo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sesion")
    private List<Asistencia> asistenciaList;

    public Sesion() {
    }

    public Sesion(SesionPK sesionPK) {
        this.sesionPK = sesionPK;
    }

    public Sesion(SesionPK sesionPK, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, LocalTime horaTolerancia, String token) {
        this.sesionPK = sesionPK;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.horaTolerancia = horaTolerancia;
        this.token = token;
    }

    public Sesion(String idSesion, int nroGrupo, String idCurso, String idProfesor) {
        this.sesionPK = new SesionPK(idSesion, nroGrupo, idCurso, idProfesor);
    }

    public SesionPK getSesionPK() {
        return sesionPK;
    }

    public void setSesionPK(SesionPK sesionPK) {
        this.sesionPK = sesionPK;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @XmlTransient
    public List<Asistencia> getAsistenciaList() {
        return asistenciaList;
    }

    public void setAsistenciaList(List<Asistencia> asistenciaList) {
        this.asistenciaList = asistenciaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sesionPK != null ? sesionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sesion)) {
            return false;
        }
        Sesion other = (Sesion) object;
        if ((this.sesionPK == null && other.sesionPK != null) || (this.sesionPK != null && !this.sesionPK.equals(other.sesionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "e.Sesion[ sesionPK=" + sesionPK + " ]";
    }

}