package com.example.demo.control;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoDataShow;
@RestController
@XmlRootElement
public class DemoController {
@Autowired
	private JdbcTemplate jt;

@RequestMapping(value="/createTable",method=RequestMethod.GET)
public String createTable() {
	
	jt.execute("create table CustomerData(id SERIAL,name varchar(255),age varchar(255))");
	return "table created";
	
}

@RequestMapping(value="/putData",method=RequestMethod.GET)
public String putData() {
	jt.execute("insert into customerdata(id,name,age) values (1,'kumar','24')");
	return "data inserted";
}

@RequestMapping(value="/getH2Data",method=RequestMethod.GET)

public List<DemoDataShow> getAll() {
   String sql = "hello"+"SELECT Id,name,age FROM customerdata";
   
   RowMapper<DemoDataShow> rM = new BeanPropertyRowMapper<DemoDataShow>(DemoDataShow.class);		
   return jt.query(sql, rM);
}

}
