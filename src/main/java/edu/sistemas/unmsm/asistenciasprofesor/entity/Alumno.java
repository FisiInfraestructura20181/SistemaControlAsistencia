package edu.sistemas.unmsm.asistenciasprofesor.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "alumno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a"),
    @NamedQuery(name = "Alumno.findByCodigo", query = "SELECT a FROM Alumno a WHERE a.codigo = :codigo"),
    @NamedQuery(name = "Alumno.findByNombres", query = "SELECT a FROM Alumno a WHERE a.nombres = :nombres"),
    @NamedQuery(name = "Alumno.findByApeMaterno", query = "SELECT a FROM Alumno a WHERE a.apeMaterno = :apeMaterno"),
    @NamedQuery(name = "Alumno.findByApePaterno", query = "SELECT a FROM Alumno a WHERE a.apePaterno = :apePaterno"),
    @NamedQuery(name = "Alumno.findByCorreo", query = "SELECT a FROM Alumno a WHERE a.correo = :correo"),
    @NamedQuery(name = "Alumno.findByTelefono", query = "SELECT a FROM Alumno a WHERE a.telefono = :telefono"),
    @NamedQuery(name = "Alumno.findByMac", query = "SELECT a FROM Alumno a WHERE a.mac = :mac")})
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo", length = 10)
    private String codigo;
    @Basic(optional = false)
    @Column(name = "nombres", length = 30)
    private String nombres;
    @Basic(optional = false)
    @Column(name = "ape_materno", length = 20)
    private String apeMaterno;
    @Basic(optional = false)
    @Column(name = "ape_paterno", length = 20)
    private String apePaterno;
    @Basic(optional = false)
    @Column(name = "correo", unique = true)
    private String correo;
    @Column(name = "telefono", length = 12)
    private String telefono;
    @Column(name = "mac", length = 20, unique = true)
    private String mac;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumno")
    private List<Asistencia> asistenciaList;

    public Alumno() {
    }

    public Alumno(String codigo) {
        this.codigo = codigo;
    }

    public Alumno(String codigo, String nombres, String apeMaterno, String apePaterno, String correo) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apeMaterno = apeMaterno;
        this.apePaterno = apePaterno;
        this.correo = correo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
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
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Alumno[ codigo=" + codigo + " ]";
    }

}
