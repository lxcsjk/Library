package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ˾��
 */
public class Driver implements IDriver{
	private ICar car;
	
	//���캯��ע��
	public Driver(ICar _car){
		this.car = _car;
	}
	
	//˾������Ҫְ����Ǽ�ʻ����
	public void drive(){
		this.car.run();
	}
}
