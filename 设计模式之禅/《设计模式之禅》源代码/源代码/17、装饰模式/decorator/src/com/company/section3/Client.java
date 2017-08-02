package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		
		//��һ������
		component = new ConcreteDecorator1(component);
		
		//�ڶ�������
		component = new ConcreteDecorator2(component);
		
		//���κ�����
		component.operate();
		
	}

}
