/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oss.process.scrum.domain;

import java.util.List;

/**
 *
 * @author gpuliyar
 */
public class User {

    private String id;
    private String firstName;
    private String lastName;
    private String emailId;
    private List<UserRole> userRoles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 29 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
        hash = 29 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
        hash = 29 * hash + (this.emailId != null ? this.emailId.hashCode() : 0);
        hash = 29 * hash + (this.userRoles != null ? this.userRoles.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if ((this.firstName == null) ? (other.firstName != null) : !this.firstName.equals(other.firstName)) {
            return false;
        }
        if ((this.lastName == null) ? (other.lastName != null) : !this.lastName.equals(other.lastName)) {
            return false;
        }
        if ((this.emailId == null) ? (other.emailId != null) : !this.emailId.equals(other.emailId)) {
            return false;
        }
        if (this.userRoles != other.userRoles && (this.userRoles == null || !this.userRoles.equals(other.userRoles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", userRoles=" + userRoles + '}';
    }
}
