package com.company.section4;

import java.util.Random;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ���ղ���ִ�е�ҵ���߼���
 */
public class Wizard {
	private Random rand = new Random(System.currentTimeMillis());
	//��һ��
	private int first(){
		System.out.println("ִ�е�һ������...");
		return rand.nextInt(100);
	}
	
	//�ڶ���
	private int second(){
		System.out.println("ִ�еڶ�������...");
		return rand.nextInt(100);
	}
	
	//����������
	private int third(){
		System.out.println("ִ�е���������...");
		return rand.nextInt(100);
	}
	
	//�����װ����	
	public void installWizard(){		
		int first = this.first();  
		//����first���صĽ�������Ƿ���Ҫִ��second
		if(first>50){
			int second = this.second();
			if(second>50){
				int third = this.third();
				if(third >50){
					this.first();
				}
			}
		}
		
	}
}
