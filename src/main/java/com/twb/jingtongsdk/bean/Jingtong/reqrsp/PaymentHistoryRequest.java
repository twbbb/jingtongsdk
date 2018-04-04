package com.twb.jingtongsdk.bean.Jingtong.reqrsp;

import com.twb.jingtongsdk.bean.Jingtong.Exclude;
import com.twb.jingtongsdk.bean.Jingtong.JingtongBaseRequest;
import com.twb.jingtongsdk.utils.JingtongRequstConstants;

//获得支付历史
public class PaymentHistoryRequest extends JingtongBaseRequest
{
	@Exclude
	private String address;//支付用户的井通地址
	
	public String requestUrl()
	{
		return "/v2/accounts/{:address}/payments";
	}
	
	public String requestType()
	{
		return JingtongRequstConstants.GET_TYPE;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	
	
}
