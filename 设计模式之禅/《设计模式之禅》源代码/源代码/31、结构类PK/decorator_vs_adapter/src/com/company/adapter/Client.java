package com.company.adapter;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//Ѽ������������ӣ������ĸ�����һ��ģ��
		System.out.println("===������������ӣ������ĸ�ģ���������ģ�===");
		Duck duck = new Duckling();
		duck.cry();  //СѼ�ӵĽ���
		duck.desAppearance(); //СѼ�ӵ�����
		duck.desBehavior(); //СѼ�ӵ�������Ϊ
		System.out.println("\n===һֻ���ص�СѼ�ӣ�ģ���������ģ�===");
		Duck uglyDuckling = new UglyDuckling();
		uglyDuckling.cry(); //��СѼ�Ľ���
		uglyDuckling.desAppearance(); //��СѼ������
		uglyDuckling.desBehavior(); //��СѼ��������Ϊ
	}
}
