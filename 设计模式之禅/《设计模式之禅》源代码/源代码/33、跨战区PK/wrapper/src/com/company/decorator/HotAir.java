package com.company.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class HotAir extends Decorator {
	public HotAir(IStar _star){
		super(_star);
	}
	
	@Override
	public void act(){
		System.out.println("����ǰ�������̸��û���Լ������ݵĽ�ɫ");
		super.act();
	}
}
