/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oss.process.scrum.service;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import oss.process.scrum.domain.Organization;
import oss.process.scrum.model.dao.ScrOrganizationFacadeLocal;
import oss.process.scrum.model.vo.ScrOrganization;

/**
 *
 * @author gpuliyar
 */
@Stateless
public class OrganizationService implements OrganizationServiceLocal {
    @EJB
    private ScrOrganizationFacadeLocal scrOrganizationFacade;

    @Override
    public List<Organization> getOrganizations() {
        List<ScrOrganization> organizations = scrOrganizationFacade.findAll();
        List<Organization> orgs = new ArrayList<Organization>();
        
        for (ScrOrganization scrOrganization : organizations) {
            Organization org = new Organization();
            org.setCode(scrOrganization.getOrgCode());
            org.setDescription(scrOrganization.getOrgDesc());
            org.setId(scrOrganization.getUuid());
            org.setName(scrOrganization.getOrgName());
            orgs.add(org);
        }
        
        return orgs;
    }

    @Override
    public Boolean create(Organization data) {
        ScrOrganization organization = new ScrOrganization();
        organization.setOrgCode(data.getCode());
        organization.setOrgDesc(data.getDescription());
        organization.setOrgName(data.getName());
        organization.setUuid(data.getId());
        scrOrganizationFacade.create(organization);
        return true;
    }
}
