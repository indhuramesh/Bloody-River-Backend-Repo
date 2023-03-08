package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Models.bloodBank;
import com.example.demo.Service.bloodService;

@RestController
@CrossOrigin

public class bloodController {
	
	@Autowired
	
	bloodService bs;
	
	@PostMapping("/addDetails")
	public bloodBank addInfo(@RequestBody bloodBank bb)
	{
		return bs.saveDetails(bb);
	}
	
	@GetMapping("/showDetails")
	public List<bloodBank> fetchDetails()
	{
		return bs.getDetails();
	}
	
	@PutMapping("/updateDetails")
	public bloodBank updateInfo(@RequestBody bloodBank bb1)
	{
		return bs.updateDetails(bb1);
	}
	@DeleteMapping("/delete/{bankId}")
	public  String deleteInfo(@PathVariable("bankId") int id)
	{
		bs.deleteDetails(id);
		return "The "+id+" id have been deleted";
	}
	
	@GetMapping("/product/{field}")
	public List<bloodBank> getWithSort(@PathVariable String field)
	{
		return bs.getSorted(field);
	}
	@GetMapping("/product/{offset}/{pageSize}")
	public List<bloodBank> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize)
	{
		return bs.getWithPagination(offset,pageSize);
	}

}
