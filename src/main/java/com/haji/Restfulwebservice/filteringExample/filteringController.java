package com.haji.Restfulwebservice.filteringExample;

import java.util.ArrayList;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class filteringController {

	@GetMapping("getd")
	public MappingJacksonValue retdb() {
		SimpleBeanPropertyFilter f = SimpleBeanPropertyFilter.filterOutAllExcept("field1","field3");
		FilterProvider fp = new SimpleFilterProvider().addFilter("somefilter", f);
		MappingJacksonValue mjv =new MappingJacksonValue(new DemoBean(1, 1, 1));
		mjv.setFilters(fp);
		
		
		return mjv;
	}
 
	@GetMapping("getdList")
	public MappingJacksonValue retList() {
		ArrayList<DemoBean> ad = new ArrayList<>();
		ad.add(new DemoBean(1, 1, 1));
		ad.add(new DemoBean(2, 2, 2));
		ad.add(new DemoBean(3, 3, 3));
		SimpleBeanPropertyFilter f = SimpleBeanPropertyFilter.filterOutAllExcept("field3");
		FilterProvider fp = new SimpleFilterProvider().addFilter("somefilter", f);
		MappingJacksonValue mjv =new MappingJacksonValue(ad);
		mjv.setFilters(fp);
		
		
		return mjv;

	}

	@GetMapping("gets")
	public DemoBean retDemoBean() {
		return new DemoBean(1, 2, 3);
	}

	@GetMapping("getsList")
	public ArrayList<DemoBean> returnListOfDemoBean() {
		ArrayList<DemoBean> ad = new ArrayList<>();
		ad.add(new DemoBean(2, 2, 2));
		ad.add(new DemoBean(3, 3, 3));
		ad.add(new DemoBean(4, 4, 4));
		return ad;
	}
}
