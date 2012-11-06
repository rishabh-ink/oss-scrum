/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oss.process.scrum.managed.bean;

import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author rishabhr
 */
@ManagedBean
@SessionScoped
public class OrgManagedBean {
    private ArrayList<Organization> organizations;

    /**
     * Creates a new instance of OrgManagedBean
     */
    public OrgManagedBean() {
        organizations = new ArrayList<Organization>();
    }
    
    @PostConstruct
    public void initalizeDummyData() {
        Organization organization = new Organization();
        organization.setCode("GRC");
        organization.setDescription("The GRC Module.");
        organization.setId("1");
        organization.setName("Governance Risk And Compliance");
        organizations.add(organization);
        organization = new Organization();
        organization.setCode("ITG");
        organization.setDescription("ITGRC Description");
        organization.setId("2");
        organization.setName("IT Governance Risk And Compliance");
        organizations.add(organization);
        organization = new Organization();
        organization.setCode("RSK");
        organization.setDescription("RSK Description");
        organization.setId("3");
        organization.setName("Risk Management");
        organizations.add(organization);
    }

    public ArrayList<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(ArrayList<Organization> organizations) {
        this.organizations = organizations;
    }
}
