package edu.sistemas.unmsm.asistenciasprofesor.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "user_roles", uniqueConstraints = @UniqueConstraint(
		columnNames = {"role", "username"}))
@XmlRootElement
public class UserRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "user_role_id")
    private Integer userRoleId;
    @Basic(optional = false)
    @Column(name = "role",  length = 40)
    private String role;
    @JoinColumn(name = "username", referencedColumnName = "username", nullable = false)
    @ManyToOne(optional = false)
    private Users username;

    public UserRoles() {
    }

    public UserRoles(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public UserRoles(Integer userRoleId, String role) {
        this.userRoleId = userRoleId;
        this.role = role;
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Users getUsername() {
        return username;
    }

    public void setUsername(Users username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userRoleId != null ? userRoleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserRoles)) {
            return false;
        }
        UserRoles other = (UserRoles) object;
        if ((this.userRoleId == null && other.userRoleId != null) || (this.userRoleId != null && !this.userRoleId.equals(other.userRoleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.UserRoles[ userRoleId=" + userRoleId + " ]";
    }

}