package com.company.abstract_factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//��������һ������SUV
		System.out.println("===Ҫ������һ������SUV===");
		//�����ҵ��������۳��Ĺ���
		System.out.println("A���ҵ����۳�����");
		CarFactory carFactory= new BenzFactory();
		//��ʼ��������SUV
		System.out.println("B����ʼ��������SUV");
		ICar benzSuv = carFactory.createSuv();
		//������ϣ�չʾһ�³�����Ϣ
		System.out.println("C�����������������£�");
		System.out.println("����Ʒ�ƣ�"+benzSuv.getBand());
		System.out.println("�����ͺţ�" + benzSuv.getModel());		
	}
}