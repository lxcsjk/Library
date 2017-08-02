package com.company.section2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class MyInvocationHandler implements InvocationHandler {
	//������Ķ���
	private Object target = null;
	//ͨ�����캯������һ������
	public MyInvocationHandler(Object _obj){
		this.target = _obj;
	}
	//������	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//ִ�б�����ķ���
		return method.invoke(this.target, args);
	}
}
