package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


import com.example.demo.Models.bloodBank;
import com.example.demo.Repositories.bloodRepo;


@Service

public class bloodService {
	@Autowired(required=true)
	
	bloodRepo br;
	
	public bloodBank saveDetails(bloodBank bb)
	{
		return br.save(bb);
	}
	public List<bloodBank> getDetails()
	{
		return br.findAll();
	}
	public bloodBank updateDetails(bloodBank bb1)
	{
		return br.saveAndFlush(bb1);
	}
	public void deleteDetails(int id)
	{
		br.deleteById(id);
	}
	public List<bloodBank> getSorted(String field)
	{
		return br.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	public List<bloodBank> getWithPagination(@PathVariable int offset, @PathVariable int pageSize)
	{
		Page<bloodBank> page=br.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}


}
