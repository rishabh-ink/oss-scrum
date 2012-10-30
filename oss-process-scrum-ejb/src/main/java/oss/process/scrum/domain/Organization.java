/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oss.process.scrum.domain;

/**
 *
 * @author gpuliyar
 */
public class Organization {

    private String id;
    private String name;
    private String shortCode;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 29 * hash + (this.shortCode != null ? this.shortCode.hashCode() : 0);
        hash = 29 * hash + (this.description != null ? this.description.hashCode() : 0);
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
        final Organization other = (Organization) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.shortCode == null) ? (other.shortCode != null) : !this.shortCode.equals(other.shortCode)) {
            return false;
        }
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        return true;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Organization{" + "id=" + id + ", name=" + name + ", shortCode=" + shortCode + ", description=" + description + '}';
    }
}
