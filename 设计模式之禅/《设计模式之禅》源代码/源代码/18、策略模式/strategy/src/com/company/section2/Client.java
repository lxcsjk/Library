package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//������һ������Ĳ���
		Strategy strategy = new ConcreteStrategy1(); 
		//�����������Ķ���
		Context context = new Context(strategy);
		//ִ�з�װ��ķ���
		context.doAnythinig();
	}
	
	
}
