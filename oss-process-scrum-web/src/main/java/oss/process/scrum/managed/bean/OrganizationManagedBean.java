/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oss.process.scrum.managed.bean;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import oss.process.scrum.domain.Organization;
import oss.process.scrum.service.OrganizationServiceLocal;

/**
 *
 * @author gpuliyar
 */
@ManagedBean
@RequestScoped
public class OrganizationManagedBean {
    private Organization data;
    @EJB
    private OrganizationServiceLocal organizationService;

    public OrganizationServiceLocal getOrganizationService() {
        return organizationService;
    }

    public void setOrganizationService(OrganizationServiceLocal organizationService) {
        this.organizationService = organizationService;
    }

    public Organization getData() {
        return data;
    }

    public void setData(Organization data) {
        this.data = data;
    }

    /**
     * Creates a new instance of OrganizationManagedBean
     */
    public OrganizationManagedBean() {
    }

    public List<Organization> getOrganizations() {
        return organizationService.getOrganizations();
    }

    public void create() {
        organizationService.create(data);
    }
}
