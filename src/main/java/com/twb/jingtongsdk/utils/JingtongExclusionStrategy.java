package com.twb.jingtongsdk.utils;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.twb.jingtongsdk.bean.Jingtong.Exclude;

public class JingtongExclusionStrategy implements ExclusionStrategy
{

	@Override
	public boolean shouldSkipField(FieldAttributes f)
	{
		Exclude annotation = f.getAnnotation(Exclude.class);
	    if(annotation!=null)
	    {
	    	return true;
	    }
	    
	    return false;
		
	}

	@Override
	public boolean shouldSkipClass(Class<?> clazz)
	{
		// TODO Auto-generated method stub
		return false;
	}

}
