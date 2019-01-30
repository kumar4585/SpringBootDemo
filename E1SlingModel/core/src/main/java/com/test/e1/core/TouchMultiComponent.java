package com.test.e1.core;

import java.util.ArrayList;
import java.util.List;

import org.apache.sling.commons.json.JSONObject;

import com.adobe.cq.sightly.WCMUsePojo;

@SuppressWarnings("deprecation")
public class TouchMultiComponent extends WCMUsePojo {

	private List<TouchMultiBean> submenuItems = new ArrayList<TouchMultiBean>();

	@Override
	public void activate() throws Exception {
		setMultiFieldItems();
	}

private List<TouchMultiBean> setMultiFieldItems() throws Exception {

String[] itemsProps = getProperties().get("mfmenu", String[].class);
 
for (int i = 0; i < itemsProps.length; i++) {
  
JSONObject  jObj = new JSONObject(itemsProps[i]);
  
String title = jObj.getString("title1");
String link = jObj.getString("path1");
String flag = jObj.getString("flag1");
 

TouchMultiBean menuItem = new TouchMultiBean();

menuItem.setTitle1(title);
menuItem.setPath1(link);
menuItem.setFlag1(flag);

submenuItems.add(menuItem);
}

return submenuItems;
}
public List<TouchMultiBean> getMultiFieldItems() {
		return submenuItems;
	}
}