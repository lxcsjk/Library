package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������
 */
public class Client {

	public static void main(String[] args) {

		//Ȼ���ٶ���һ��������
		IGamePlayer proxy = new GamePlayerProxy("����");
		
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ���ǣ�2009-8-25 10:45");
		proxy.login("zhangSan", "password");
		//��ʼɱ��
		proxy.killBoss();
		//����
		proxy.upgrade();
		//��¼������Ϸʱ��
		System.out.println("����ʱ���ǣ�2009-8-26 03:40");
		
	}

}
