package cl.geobpo.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.geobpo.models.entity.ProcessList;

@Repository
public class ProcessListDaoImpl implements IProcessListDao {
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true)
	public List<ProcessList> findAllQuery() 
	{
		return em.createQuery("select u from ProcessList u Where u.command = 'Query'").getResultList();
	}	
}
