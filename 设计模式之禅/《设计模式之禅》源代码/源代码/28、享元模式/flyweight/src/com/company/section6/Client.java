package com.company.section6;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		String key1 = "��Ŀ1�Ϻ�";
		String key2 = "��Ŀ1�Ϻ�";
		//��ʼ�������
		SignInfoFactory.getSignInfo(key1);

		//����ִ��10�����Ҫ��ʱ��
		long currentTime = System.currentTimeMillis();
		for(int i=0;i<1000000;i++){
			SignInfoFactory.getSignInfo(key2);
		}
		long tailTime = System.currentTimeMillis();
		
		System.out.println("ִ��ʱ�䣺"+(tailTime - currentTime) + " ms");
	}

		
}
