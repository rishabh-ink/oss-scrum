/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oss.process.scrum.service;

import java.util.List;
import oss.process.scrum.domain.Organization;
import oss.process.scrum.domain.User;

/**
 *
 * @author gpuliyar
 */
public interface IOrganizationService {

    boolean create(Organization data, User user);

    boolean edit(Organization data, User user);

    List<Organization> getOrganizations(User user);
}
