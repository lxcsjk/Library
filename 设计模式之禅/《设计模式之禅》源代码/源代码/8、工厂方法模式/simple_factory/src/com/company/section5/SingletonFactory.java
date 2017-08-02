package com.company.section5;

import java.lang.reflect.Constructor;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SingletonFactory {
	private static Singleton singleton;
	static{ 
		try {
			Class cl= Class.forName(Singleton.class.getName());
			//����޲ι���
			Constructor constructor=cl.getDeclaredConstructor();
			//�����޲ι����ǿɷ��ʵ�
			constructor.setAccessible(true);
			//����һ��ʵ������
			singleton = (Singleton)constructor.newInstance();
		} catch (Exception e) {
			//�쳣����
		}		
	}
	
	public static Singleton getSingleton(){
		return singleton;	
	}
}
