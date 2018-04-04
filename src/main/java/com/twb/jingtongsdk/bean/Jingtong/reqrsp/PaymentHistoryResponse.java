package com.twb.jingtongsdk.bean.Jingtong.reqrsp;

import com.twb.jingtongsdk.bean.Jingtong.JingtongBaseResponse;

//获得支付信息
public class PaymentHistoryResponse extends JingtongBaseResponse
{
	
	private PaymentDate[] payments;//支付的效果

	public PaymentDate[] getPayments()
	{
		return payments;
	}

	public void setPayments(PaymentDate[] payments)
	{
		this.payments = payments;
	}
	
	
}
