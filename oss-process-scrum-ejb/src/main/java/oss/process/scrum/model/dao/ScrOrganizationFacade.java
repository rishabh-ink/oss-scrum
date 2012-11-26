/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oss.process.scrum.model.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import oss.process.scrum.model.vo.ScrOrganization;

/**
 *
 * @author gpuliyar
 */
@Stateless
public class ScrOrganizationFacade extends AbstractFacade<ScrOrganization> implements ScrOrganizationFacadeLocal {
    @PersistenceContext(unitName = "oss.process.scrum.dev_oss-process-scrum-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ScrOrganizationFacade() {
        super(ScrOrganization.class);
    }
    
}
