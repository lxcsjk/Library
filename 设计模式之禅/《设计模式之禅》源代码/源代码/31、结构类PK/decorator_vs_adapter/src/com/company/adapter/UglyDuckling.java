package com.company.adapter;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UglyDuckling extends WhiteSwan implements Duck {
	
	//��СѼ�Ľ���
	public void cry() {
		super.cry();
	}
	
	//��СѼ������
	public void desAppearance() {
		super.desAppaearance();
	}
	
	//��СѼ��������Ϊ
	public void desBehavior(){
		//��СѼ��������Ӿ
		System.out.println("����Ӿ");
		//�������
		super.fly();
	}
}
