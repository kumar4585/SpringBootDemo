package com.example.demo.service;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Service;

@Service
@XmlRootElement
public class DemoDataShow {

	private Long id;
    private String name;
    private String age ;
	public DemoDataShow(Long id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public DemoDataShow() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
    
	 @Override
	    public String toString() {
	        return" Employee " + String.format(" [id=%s, name=%s, age=%s]", id, name, age);
	    }
}
