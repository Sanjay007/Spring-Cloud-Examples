package com.frugalis.EurekaServiceClient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
public class CustomerController {


	private static Map<String, List<Customer>> custList = new HashMap<String, List<Customer>>();

	static {
		custList = new HashMap<String, List<Customer>>();

		List<Customer> lst = new ArrayList<Customer>();
		Customer std = new Customer();
		std.setId(7);
		std.setName("testing");
		lst.add(std);
		std = new Customer();
		std.setId(5);
		std.setAddress("ASERT");
		lst.add(std);

		custList.put("first", lst);


	}
	
	@RequestMapping(value = "/getcustomer", method = RequestMethod.GET)
	public List<Customer> getStudents() {
		

		List<Customer> studentList = custList.get("first");
		
		return studentList;
	}

}
