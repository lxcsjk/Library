package com.company.proxy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ����
 */
public class Idolater {
	
	public static void main(String[] args) {
		//��ݵ�������˭
		IStar star = new Singer();
		//�ҵ����ǵĴ�����
		IStar agent = new Agent(star);
		System.out.println("׷���壺������ĳ���ߣ���ǩ����");
		//ǩ��
		agent.sign();
	}
}
