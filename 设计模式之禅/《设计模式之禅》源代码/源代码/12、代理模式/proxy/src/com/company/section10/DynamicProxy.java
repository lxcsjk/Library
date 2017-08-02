package com.company.section10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������
 */
public class DynamicProxy implements InvocationHandler {
	//��������
	Class cls =null;
	//�������ʵ��
	Object obj = null;
	
	//��Ҫ����˭
	public DynamicProxy(Object _obj){
		this.obj = _obj;
	}
	
	//���ñ�����ķ���
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = method.invoke(this.obj, args);
		//����ǵ�¼������������Ϣ
		if(method.getName().equalsIgnoreCase("login")){
			System.out.println("���������ҵ��˺ŵ�½��");
		}
		return result;
	}
	
}
