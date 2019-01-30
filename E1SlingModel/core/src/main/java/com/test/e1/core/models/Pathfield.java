package com.test.e1.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class)

public class Pathfield {
	  @Inject
	  public Resource pathf;
}
