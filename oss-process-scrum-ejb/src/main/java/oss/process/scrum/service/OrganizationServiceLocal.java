/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oss.process.scrum.service;

import java.util.List;
import javax.ejb.Local;
import oss.process.scrum.domain.Organization;

/**
 *
 * @author gpuliyar
 */
@Local
public interface OrganizationServiceLocal {

    List<Organization> getOrganizations();

    Boolean create(Organization data);
}
