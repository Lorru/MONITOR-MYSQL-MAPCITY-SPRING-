package cl.geobpo.models.service;

import java.util.List;

import cl.geobpo.models.entity.ProcessList;

public interface IProcessListService 
{
	public List<ProcessList> findAll();
}
