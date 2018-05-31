package cl.geobpo.models.dao;

import java.util.List;

//import org.springframework.data.repository.PagingAndSortingRepository;

import cl.geobpo.models.entity.ProcessList;

public interface IProcessListDao // extends PagingAndSortingRepository<ProcessList, Long>
{
	public List<ProcessList> findAllQuery();
}
