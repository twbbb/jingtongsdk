# jingtongsdk


为井通API接口的简单封装，

账号类接口，支付类接口和交易记录接口，用过了一段时间没有问题。

挂单接口只经过测试，实际还没用过，其中取消用户挂单，还没处理。

JingtongRequstConstants. URL_HEAD， 可以配置生产环境或测试环境


调用的话，创建对应JingtongRequest，并且赋值对应的参数
然后调用 JingtongRequestUtils.sendRequest(JingtongRequest)，
返回对应的JingtongResponse。

如：查询余额，创建了查询余额BalancesRequest，并且赋值对应数据，返回的是BalancesResponse

BalancesRequest br = new BalancesRequest();
		br.setAddress("j4mk8vSKLVhto6RArmQKKGCMW6kc4x68xa");
		BalancesResponse jr = (BalancesResponse) JingtongRequestUtils.sendRequest(br);
		System.out.println(jr);
		assertEquals(true, jr.isSuccess());

打印内容：
{
  "balances": [
    {
      "value": "37.945116",
      "currency": "SWT",
      "issuer": "",
      "freezed": "25"
    },
    {
      "value": "0",
      "currency": "CNY",
      "issuer": "jGa9J9TkqtBcUoHe2zqhVFFbgUVED6o9or",
      "freezed": "0.000000"
    }
  ],
  "sequence": 735,
  "success": true,
  "message": null,
  "status_code": "0",
  "error_type": null,
  "error": null
}


