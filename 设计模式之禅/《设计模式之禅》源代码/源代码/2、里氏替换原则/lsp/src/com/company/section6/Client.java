package com.company.section6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	public static void invoker(){
		//������ڵĵط��������Ӧ���ܹ�����
		//Father f = new Father();
		Son f =new Son();
		Map map = new HashMap();
		Collection arrayList = f.doSomething(map);
	}
	
	public static void main(String[] args) {
		
		invoker();
	}
}
