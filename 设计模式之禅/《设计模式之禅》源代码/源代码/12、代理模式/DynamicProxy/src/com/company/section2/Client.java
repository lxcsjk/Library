package com.company.section2;

import java.lang.reflect.InvocationHandler;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//����һ������
		Subject subject = new RealSubject();
		//��������Ĵ���
		Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
		//�������Ϊ
		proxy.doSomething("Finish");
	}
}
