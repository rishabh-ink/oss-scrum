/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oss.process.scrum.model.dao;

import java.util.List;
import javax.ejb.Local;
import oss.process.scrum.model.vo.ScrOrganization;

/**
 *
 * @author gpuliyar
 */
@Local
public interface ScrOrganizationFacadeLocal {

    void create(ScrOrganization scrOrganization);

    void edit(ScrOrganization scrOrganization);

    void remove(ScrOrganization scrOrganization);

    ScrOrganization find(Object id);

    List<ScrOrganization> findAll();

    List<ScrOrganization> findRange(int[] range);

    int count();
    
}
