package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������
 */
public class Client {

	public static void main(String[] args) {
		//�������������
		AbstractCreator creator1 = new Creator1();
		AbstractCreator creator2 = new Creator2();
		
		//����A1����
		AbstractProductA a1 =  creator1.createProductA();
		//����A2����
		AbstractProductA a2 = creator2.createProductA();
		//����B1����
		AbstractProductB b1 = creator1.createProductB();
		//����B2����
		AbstractProductB b2 = creator2.createProductB();
		
		/*
		 * Ȼ��������Ϳ���Ϊ����Ϊ��...
		 */
		
	}
}
