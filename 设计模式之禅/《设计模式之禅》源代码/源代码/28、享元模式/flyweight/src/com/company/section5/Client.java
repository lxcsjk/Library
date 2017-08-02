package com.company.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//��ʼ�������
		ExtrinsicState state1 = new ExtrinsicState();
		state1.setSubject("��Ŀ1");
		state1.setLocation("�Ϻ�");
		SignInfoFactory.getSignInfo(state1);
		
		ExtrinsicState state2 = new ExtrinsicState();
		state2.setSubject("��Ŀ1");
		state2.setLocation("�Ϻ�");
		
		
		//����ִ��10�����Ҫ��ʱ��
		long currentTime = System.currentTimeMillis();
		for(int i=0;i<1000000;i++){
			SignInfoFactory.getSignInfo(state2);
		}
		long tailTime = System.currentTimeMillis();
		
		System.out.println("ִ��ʱ�䣺"+(tailTime - currentTime) + " ms");
	}

		
}
