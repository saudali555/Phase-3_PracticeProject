package com.org;


import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

	@Autowired
	ProductService eproductService;
	
	
	@RequestMapping(value = "/list",method = RequestMethod.GET)
	public String listProduct(@RequestParam("id") int pid, ModelMap map)
	{
		map.addAttribute("eproduct", new EProductEntity());
		map.addAttribute("list",eproductService.searchById(pid));
		return "list";
	}
	
	@RequestMapping(value = "/edit",method = RequestMethod.GET)
	public String updatedList(@RequestParam("id") int id, @RequestParam("name") String n, @RequestParam("price") BigDecimal p, ModelMap map)
	{
		map.addAttribute("eproduct", new EProductEntity());
		map.addAttribute("list",eproductService.updateDetails(id,n,p));
		return "list";
	}
}