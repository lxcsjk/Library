package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ʿ��ʹ��ǹ��ɱ��
 */
public class Soldier {
	//����ʿ����ǹ֧
	private AbstractGun gun;
	//��ʿ��һ֧ǹ
	public void setGun(AbstractGun _gun){
		this.gun = _gun; 
	}
	public void killEnemy(){
		System.out.println("ʿ����ʼɱ��...");
		gun.shoot();
	}
}
