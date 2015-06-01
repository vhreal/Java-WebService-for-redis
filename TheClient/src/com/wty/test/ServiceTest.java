package com.wty.test;

import com.wty.client.ServiceHello;
import com.wty.client.ServiceHelloService;

public class ServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServiceHello hello = new ServiceHelloService().getServiceHelloPort();
		hello.startRedis();
		String result = hello.get("1011");
		System.out.println(result);
	}

}
