package com.company.section7;

import com.company.section6.GamePlayer;
import com.company.section6.IGamePlayer;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������
 */
public class Client {

	public static void main(String[] args) {
		//�������Ϸ�Ľ�ɫ
		IGamePlayer player = new GamePlayer("����");
		//���ָ���Ĵ���
		IGamePlayer proxy = player.getProxy();
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

