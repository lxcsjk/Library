package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//����һ�����۲���
		ConcreteSubject subject = new ConcreteSubject();
		//����һ���۲���
		Observer obs= new ConcreteObserver();
		//�۲��߹۲챻���۲���
		subject.addObserver(obs);
		//�۲��߿�ʼ���
		subject.doSomething();		
	}
	
	


}
