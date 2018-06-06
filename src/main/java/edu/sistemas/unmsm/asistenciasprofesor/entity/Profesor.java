package edu.sistemas.unmsm.asistenciasprofesor.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "profesor")
@XmlRootElement
public class Profesor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_profesor", length = 10)
    private String idProfesor;
    @Basic(optional = false)
    @Column(name = "nombres", length = 30)
    private String nombres;
    @Basic(optional = false)
    @Column(name = "ape_paterno", length = 20)
    private String apePaterno;
    @Basic(optional = false)
    @Column(name = "ape_materno", length = 20)
    private String apeMaterno;
    @OneToMany(mappedBy = "idProfesor")
    private List<Curso> cursoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProfesor")
    private List<Users> usersList;

    public Profesor() {
    }

    public Profesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Profesor(String idProfesor, String nombres, String apePaterno, String apeMaterno) {
        this.idProfesor = idProfesor;
        this.nombres = nombres;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    @XmlTransient
    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

    @XmlTransient
    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProfesor != null ? idProfesor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesor)) {
            return false;
        }
        Profesor other = (Profesor) object;
        if ((this.idProfesor == null && other.idProfesor != null) || (this.idProfesor != null && !this.idProfesor.equals(other.idProfesor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Profesor[ idProfesor=" + idProfesor + " ]";
    }

}
