package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteDecorator1 extends Decorator {
	
	//���屻������
	public ConcreteDecorator1(Component _component){
		super(_component);
	}
	
	//�����Լ������η���
	private void method1(){
		System.out.println("method1 ����");
	}
	
	//��д�����Operation����
	public void operate(){
		this.method1();
		super.operate();
	}
}
