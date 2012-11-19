/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oss.process.scrum.model.vo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gpuliyar
 */
@Entity
@Table(name = "scr_organization")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScrOrganization.findAll", query = "SELECT s FROM ScrOrganization s"),
    @NamedQuery(name = "ScrOrganization.findByUuid", query = "SELECT s FROM ScrOrganization s WHERE s.uuid = :uuid"),
    @NamedQuery(name = "ScrOrganization.findByOrgName", query = "SELECT s FROM ScrOrganization s WHERE s.orgName = :orgName"),
    @NamedQuery(name = "ScrOrganization.findByOrgCode", query = "SELECT s FROM ScrOrganization s WHERE s.orgCode = :orgCode"),
    @NamedQuery(name = "ScrOrganization.findByOrgDesc", query = "SELECT s FROM ScrOrganization s WHERE s.orgDesc = :orgDesc")})
public class ScrOrganization implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "uuid")
    private String uuid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "org_name")
    private String orgName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "org_code")
    private String orgCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "org_desc")
    private String orgDesc;

    public ScrOrganization() {
    }

    public ScrOrganization(String uuid) {
        this.uuid = uuid;
    }

    public ScrOrganization(String uuid, String orgName, String orgCode, String orgDesc) {
        this.uuid = uuid;
        this.orgName = orgName;
        this.orgCode = orgCode;
        this.orgDesc = orgDesc;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgDesc() {
        return orgDesc;
    }

    public void setOrgDesc(String orgDesc) {
        this.orgDesc = orgDesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uuid != null ? uuid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ScrOrganization)) {
            return false;
        }
        ScrOrganization other = (ScrOrganization) object;
        if ((this.uuid == null && other.uuid != null) || (this.uuid != null && !this.uuid.equals(other.uuid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "oss.process.scrum.model.vo.ScrOrganization[ uuid=" + uuid + " ]";
    }
    
}
