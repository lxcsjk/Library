package com.company.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//����������ν������
		IStar freakStar = new FreakStar();
		//����������ô�����Լ���
		//����ǰ�����Լ���������
		freakStar = new HotAir(freakStar);
		//����Ϻ����������Լ��ݵ���
		freakStar = new Deny(freakStar);
		//�������⸱����
		System.out.println("====����һЩ������ǵ�����====");
		freakStar.act();
	}
}
