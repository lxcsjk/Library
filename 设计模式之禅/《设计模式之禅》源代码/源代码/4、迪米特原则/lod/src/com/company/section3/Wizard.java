package com.company.section3;

import java.util.Random;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ���ղ���ִ�е�ҵ���߼���
 */
public class Wizard {
	private Random rand = new Random(System.currentTimeMillis());
	//��һ��
	public int first(){
		System.out.println("ִ�е�һ������...");
		return rand.nextInt(100);
	}
	
	//�ڶ���
	public int second(){
		System.out.println("ִ�еڶ�������...");
		return rand.nextInt(100);
	}
	
	//����������
	public int third(){
		System.out.println("ִ�е���������...");
		return rand.nextInt(100);
	}
	
	
}
