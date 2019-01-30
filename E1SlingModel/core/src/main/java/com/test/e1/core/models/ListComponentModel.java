package com.test.e1.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;

@Model(adaptables = Resource.class)

public class ListComponentModel {

	@Inject
    @Optional
    public String ddtext;
	@Inject
    public Resource ddc;
	@Inject
    public Resource IS;
	@Inject
    public  Resource PS;
	@Inject
    public Resource AS;

    

}
