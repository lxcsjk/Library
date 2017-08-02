package com.company.section1;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class DynamicProxy {
	//����Ҫ�����ĸ���
	private Object obj =null;
	//ͨ�����캯�����ݱ��������	
	public DynamicProxy(Object _obj){
		Class c = _obj.getClass();
		//���ɱ�������Ĵ�����
		this.obj = Proxy.newProxyInstance(c.getClassLoader(), c.getInterfaces(), new MyInvocationHandler(_obj));
	}
	//ִ�д�����ķ���
	public Object exec(String methodName,Object...args){
		//����ֵ
		Object result = null;
		//�����еĲ�������
		Class[] c= new Class[args.length];
		int i=0;
		//��ò���������
		for(Object o:args){
			c[i] = o.getClass();
			i++;
		}
		try {
			//���ݷ������ƺͲ������Ͳ��ҵ�Ψһһ������
			Method method=this.obj.getClass().getMethod(methodName, c);
			//ִ�и÷���
			result = method.invoke(this.obj, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
