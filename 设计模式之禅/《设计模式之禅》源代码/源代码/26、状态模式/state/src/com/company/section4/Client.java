package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//���廷����ɫ
		Context context = new Context();
		//��ʼ��״̬
		context.setCurrentState(new ConcreteState1());
		//��Ϊִ��
		context.handle1();
		context.handle2();
	}
}
