/**
 * 
 */
package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �й�����ʷ��һ�㶼��һ������һ���ʵۣ��������ʵ۵Ļ�����ȻҪPK��һ���ʵ۳���
 */
public class Emperor {
	private static final Emperor emperor =new Emperor();  //��ʼ��һ���ʵ�
	
	private Emperor(){
		//���׺͵���Լ���㣬Ŀ�ľ��ǲ�ϣ�������ڶ����ʵ�
	}
	
	public static Emperor getInstance(){
		return emperor;
	}
	
	//�ʵ۷�����
	public static void say(){
		System.out.println("�Ҿ��ǻʵ�ĳĳĳ....");		
	}
}
