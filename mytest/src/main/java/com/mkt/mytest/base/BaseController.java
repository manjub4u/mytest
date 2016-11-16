package com.mkt.mytest.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mkt.mytest.admin.persist.entity.Category;

@RestController
@RequestMapping("/base")
public class BaseController {
	
	@RequestMapping("/categorys1")
    public Map getAllCategory() {//REST Endpoint.
 
       ArrayList<Category> al=new ArrayList<Category>();
       Category c1=new Category();
       c1.setCreatedBy(1);
       c1.setName("pen");
       c1.setImgUrl("imgUrl");
       c1.setDescription("description");
       
       Category c2=new Category();
       c2.setCreatedBy(1);
       c2.setName("pen");
       c2.setImgUrl("imgUrl");
       c2.setDescription("description");
       
       	al.add(c1);
       	al.add(c2);
       	
	     Map map=new HashMap();
	     map.put("data", al);
	     map.put("links", c2);
       return map;
    }
}
