package com.company.section5;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//����һ��ʵ�ֻ���ɫ
		Implementor imp = new ConcreteImplementor1();
		//����һ�����󻯽�ɫ
		Abstraction abs = new RefinedAbstraction(imp);
		//ִ������
		abs.request();
	}
}
