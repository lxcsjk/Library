package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteDecorator2 extends Decorator {
	
	//���屻������
	public ConcreteDecorator2(Component _component){
		super(_component);
	}
	
	//�����Լ������η���
	private void method2(){
		System.out.println("method2����");
	}
	
	//��д�����Operation����
	public void operate(){
		super.operate();
		this.method2();
	}
}
