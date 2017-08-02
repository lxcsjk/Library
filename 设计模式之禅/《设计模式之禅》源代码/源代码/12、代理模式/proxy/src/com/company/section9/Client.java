package com.company.section9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������
 */
public class Client {

	public static void main(String[] args) throws Throwable  {
		//����һ�����Ե����
		IGamePlayer player = new GamePlayer("����");		
		//����һ��hanlder
		InvocationHandler handler = new GamePlayIH(player);		
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ���ǣ�2009-8-25 10:45");		
		//������class loader
		ClassLoader cl = player.getClass().getClassLoader();		
		//��̬����һ��������
		IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class},handler);		
		//��¼
		proxy.login("zhangSan", "password");		
		//��ʼɱ��
		proxy.killBoss();
		//����
		proxy.upgrade();
		//��¼������Ϸʱ��
		System.out.println("����ʱ���ǣ�2009-8-26 03:40");
		
	}
}
