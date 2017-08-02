package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Singleton {
	private static final Singleton singleton = new Singleton();
	
	//���Ʋ����������
	private Singleton(){
		
	}
	
	//ͨ���÷������ʵ������
	public static Singleton getSingleton(){
		return singleton;
	}
	
	//��������������������static
	public static void doSomething(){
		
	}
}
