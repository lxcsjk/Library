package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//ԭ�е�ҵ���߼�
		Target target = new ConcreteTarget();
		target.request();
		
		//������������������ɫ���ҵ���߼�
		Target target2 = new Adapter();
		target2.request();
	}
}
