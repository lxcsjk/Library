package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ҵ�񳡾�ģ����
 */
public class Client {
	
	public static void main(String[] args) {
		//������ë���ʿ��
		Soldier sanMao = new Soldier();
		sanMao.setGun(new ToyGun());
		sanMao.killEnemy();
	}
}
