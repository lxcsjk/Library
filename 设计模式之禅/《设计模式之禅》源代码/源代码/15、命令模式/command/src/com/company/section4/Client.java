package com.company.section4;



/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//����������������Invoker
		Invoker invoker = new Invoker();
	
		//����һ�����͸������ߵ�����
		Command command = new ConcreteCommand1();
		
		//�������������ȥִ��
		invoker.setCommand(command);
		invoker.action();
		
	}

}
