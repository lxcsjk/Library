package com.company.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Car implements ICar {
	//��������
	private String engine;
	//��������
	private String wheel;
	
	//һ���Դ���������Ҫ����Ϣ
	public Car(String _engine,String _wheel){
		this.engine = _engine;
		this.wheel = _wheel;
	}
	
	
	public String getEngine() {
		return engine;
	}


	public String getWheel() {
		return wheel;
	}
	
	@Override
	public String toString(){
		return "���������ǣ�" + wheel + "\n���������ǣ�" + engine;		
	}
}