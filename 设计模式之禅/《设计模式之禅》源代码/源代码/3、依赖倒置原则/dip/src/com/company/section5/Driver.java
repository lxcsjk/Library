package com.company.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ˾��
 */
public class Driver implements IDriver{
	private ICar car;
	
	public void setCar(ICar car){
		this.car = car;
	}
	
	//˾������Ҫְ����Ǽ�ʻ����
	public void drive(){
		this.car.run();
	}
}
