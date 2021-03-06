package edu.sistemas.unmsm.asistenciasprofesor.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SesionPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Basic(optional = false)
    @Column(name = "id_sesion", length = 10)
    private String idSesion;
    @Basic(optional = false)
    @Column(name = "nro_grupo", length = 2)
    private int nroGrupo;
    @Basic(optional = false)
    @Column(name = "id_curso", length = 10)
    private String idCurso;
    @Basic(optional = false)
    @Column(name = "id_profesor", length = 10)
    private String idProfesor;

    public SesionPK() {
    }

    public SesionPK(String idSesion, int nroGrupo, String idCurso, String idProfesor) {
        this.idSesion = idSesion;
        this.nroGrupo = nroGrupo;
        this.idCurso = idCurso;
        this.idProfesor = idProfesor;
    }

    public String getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(String idSesion) {
        this.idSesion = idSesion;
    }

    public int getNroGrupo() {
        return nroGrupo;
    }

    public void setNroGrupo(int nroGrupo) {
        this.nroGrupo = nroGrupo;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSesion != null ? idSesion.hashCode() : 0);
        hash += (int) nroGrupo;
        hash += (idCurso != null ? idCurso.hashCode() : 0);
        hash += (idProfesor != null ? idProfesor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SesionPK)) {
            return false;
        }
        SesionPK other = (SesionPK) object;
        if ((this.idSesion == null && other.idSesion != null) || (this.idSesion != null && !this.idSesion.equals(other.idSesion))) {
            return false;
        }
        if (this.nroGrupo != other.nroGrupo) {
            return false;
        }
        if ((this.idCurso == null && other.idCurso != null) || (this.idCurso != null && !this.idCurso.equals(other.idCurso))) {
            return false;
        }
        if ((this.idProfesor == null && other.idProfesor != null) || (this.idProfesor != null && !this.idProfesor.equals(other.idProfesor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "e.SesionPK[ idSesion=" + idSesion + ", nroGrupo=" + nroGrupo + ", idCurso=" + idCurso + ", idProfesor=" + idProfesor + " ]";
    }

}
