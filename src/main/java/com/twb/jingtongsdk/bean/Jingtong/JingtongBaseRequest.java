package com.twb.jingtongsdk.bean.Jingtong;

import com.twb.jingtongsdk.bean.JingtongRequest;
import com.twb.jingtongsdk.utils.JingtongRequstConstants;

public abstract class JingtongBaseRequest implements JingtongRequest
{
	
	public String toString() {
	        return JingtongRequstConstants.PRETTY_PRINT_GSON.toJson(this);
	    }
	
}
