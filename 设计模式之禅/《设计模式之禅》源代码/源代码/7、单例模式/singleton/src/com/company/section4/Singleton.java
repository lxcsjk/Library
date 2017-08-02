package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public final class Singleton {
	private static Singleton singleton = null;
	
	//���Ʋ����������
	private Singleton(){
		
	}
	
	//ͨ���÷������ʵ������
	public synchronized static Singleton getSingleton(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;		
	}
}
