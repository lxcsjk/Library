package com.company.section2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class DynamicProxy<T> {

	public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h){
		//Ѱ��JoinPoint���ӵ㣬AOP���ʹ��Ԫ���ݶ���
		if(true){
			//ִ��һ��ǰ��֪ͨ
			(new BeforeAdvice()).exec();
		}
		//ִ��Ŀ�꣬�����ؽ��
		return (T)Proxy.newProxyInstance(loader,interfaces, h);		
	}
}

