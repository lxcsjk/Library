package com.company.section10;

import java.lang.reflect.Method;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������
 */
public class Client {

	public static void main(String[] args) throws Throwable  {
		//����һ�����Ե����
		IGamePlayer player = new GamePlayer("����");
		
		//Ȼ���ٶ���һ��������
		GamePlayIH proxy = new GamePlayIH(player);
		
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ���ǣ�2009-8-25 10:45");
		
		String str[] = {"zhangSan","password"};
		Class type[] = {String.class,String.class};
		proxy.invoke(null, player.getClass().getMethod("login", type),str);
		//��ʼɱ��
		proxy.invoke(null, player.getClass().getMethod("killBoss", null),null);
		//����
		proxy.invoke(null, player.getClass().getMethod("upgrade", null),null);

		//��¼������Ϸʱ��
		System.out.println("����ʱ���ǣ�2009-8-26 03:40");
		
	}
	
	

}
