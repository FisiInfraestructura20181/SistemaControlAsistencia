package edu.sistemas.unmsm.asistenciasprofesor.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AsistenciaPK implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "codigo", length = 10)
    private String codigo;

    public AsistenciaPK() {
    }

    public AsistenciaPK(String idSesion, int nroGrupo, String idCurso, String idProfesor, String codigo) {
        this.idSesion = idSesion;
        this.nroGrupo = nroGrupo;
        this.idCurso = idCurso;
        this.idProfesor = idProfesor;
        this.codigo = codigo;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSesion != null ? idSesion.hashCode() : 0);
        hash += (int) nroGrupo;
        hash += (idCurso != null ? idCurso.hashCode() : 0);
        hash += (idProfesor != null ? idProfesor.hashCode() : 0);
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsistenciaPK)) {
            return false;
        }
        AsistenciaPK other = (AsistenciaPK) object;
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
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "e.AsistenciaPK[ idSesion=" + idSesion + ", nroGrupo=" + nroGrupo + ", idCurso=" + idCurso + ", idProfesor=" + idProfesor + ", codigo=" + codigo + " ]";
    }

}
