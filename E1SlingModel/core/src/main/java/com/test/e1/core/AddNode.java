package com.test.e1.core;

import java.util.HashMap;
import java.util.Map;

import javax.jcr.Node;
import javax.jcr.Session;

import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
public class AddNode {
	static ResourceResolverFactory resolverFactory;
	static Session session;
	
	public static void main(String[] args) throws Exception { 
	
        Map<String, Object> param = new HashMap<String, Object>();
        param.put(ResourceResolverFactory.SUBSERVICE,"kumar");
          
		ResourceResolver resourceResolver = resolverFactory.getServiceResourceResolver(param);

	    session = resourceResolver.adaptTo(Session.class);		  
		  Node root = session.getRootNode(); 
		  
		  Node adobe = root.addNode("ProgramNode"); 
		  Node day = adobe.addNode("subnode"); 
		  day.setProperty("jcr:title", "programNode"); 
		     
		  Node node = root.getNode("ProgramNode/subnode"); 
		  System.out.println(node.getPath()); 
		  System.out.println(node.getProperty("jcr:title").getString()); 
		  session.save(); 
		  session.logout();
		  
		  
		}

}
