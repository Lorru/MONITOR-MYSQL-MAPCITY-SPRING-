package cl.geobpo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cl.geobpo.models.dao.IProcessListDao;
//import cl.geobpo.models.service.IProcessListService;

@Controller
public class IndexController 
{
	//@Autowired
	//private IProcessListService processListService;
	
	@Autowired
	private IProcessListDao processListDao;
	
	@GetMapping("/")
	public String index(Model model) 
	{
		//model.addAttribute("processList",processListService.findAll());
		model.addAttribute("processList",processListDao.findAllQuery());
		return "index";
	}	
}
