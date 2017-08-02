package com.company.section3;



/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//����������������Invoker
		Invoker invoker = new Invoker();
		
		//���������
		Receiver receiver = new ConcreteReciver1();
		
		//����һ�����͸������ߵ�����
		Command command = new ConcreteCommand1(receiver);
		
		//�������������ȥִ��
		invoker.setCommand(command);
		invoker.action();
		
	}

}
