package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ҵ�񳡾���
 */
public class Client {
	public static void main(String[] args) {
		IDriver zhangSan = new Driver();
		//ICar benz = new Benz();
		ICar bmw = new BMW();
		
		//���������۳�
		zhangSan.drive(bmw);
	}
}
