package com.company.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UglyDuckling implements Swan {

	//��СѼ�Ľ���
	public void cry() {
		System.out.println("�����ǿ��ࡪ�����ࡪ������");
	}
	
	//��СѼ������
	public void desAppaearance() {
		System.out.println("������������İ�ɫ��ë���׵Ĵ��Դ�");
	}

	//��СѼ���Ƚ�С�����ܷ�
	public void fly() {
		System.out.println("���ܷ���");
	}

}

