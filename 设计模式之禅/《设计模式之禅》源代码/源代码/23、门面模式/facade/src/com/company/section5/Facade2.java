package com.company.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Facade2 {
	//����ԭ�е�����
	private Facade facade = new Facade();
	
	//�����ṩΨһ�ķ�����ϵͳ�ķ���
	public void methodB(){
		this.facade.methodB();
	}
}
