package com.twb.jingtongsdk.bean.Jingtong.reqrsp;

import com.twb.jingtongsdk.bean.Jingtong.JingtongBaseResponse;

//获取挂单列表
public class OrdersListResponse  extends JingtongBaseResponse
{
	private Order[] orders;//单子信息

	public Order[] getOrders()
	{
		return orders;
	}

	public void setOrders(Order[] orders)
	{
		this.orders = orders;
	}


	
	
}
