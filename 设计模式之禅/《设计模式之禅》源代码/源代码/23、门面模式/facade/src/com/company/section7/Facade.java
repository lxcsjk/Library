package com.company.section7;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Facade {
	//��ί�еĶ���
	private ClassA a = new ClassA();
	private ClassB b = new ClassB();
	private Context context = new Context();
	
	//�ṩ���ⲿ���ʵķ���
	public void methodA(){
		this.a.doSomethingA();
	}
	
	public void methodB(){
		this.b.doSomethingB();
	}
	
	public void methodC(){
		this.context.complexMethod();
	}
}
