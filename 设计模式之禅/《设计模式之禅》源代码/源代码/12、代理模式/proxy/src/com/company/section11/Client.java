package com.company.section11;

import java.lang.reflect.Method;
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
		
		//��ʼ����Ϸ������ʱ���
		System.out.println("��ʼʱ���ǣ�2009-8-25 10:45");
		
		//������class loader
		ClassLoader cl = player.getClass().getClassLoader();
		
		
		IGamePlayer proxy = DynamicProxy.newProxyInstance(cl,new Class[] {IGamePlayer.class}, new MyIvocationHandler(player));
		
		//��½
		proxy.login("zhangSan", "password");
		//��ʼɱ��
		proxy.killBoss();
		//����
		proxy.upgrade();

		//��¼������Ϸʱ��
		System.out.println("����ʱ���ǣ�2009-8-26 03:40");
		
	}
	
	

}
