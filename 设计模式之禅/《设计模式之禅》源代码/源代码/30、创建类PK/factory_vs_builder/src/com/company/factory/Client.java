package com.company.factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	//ģ����������
	public static void main(String[] args) {
		//����һ�����곬��
		ISuperMan adultSuperMan = SuperManFactory.createSuperMan("adult");
		//չʾһ�³��˵ļ���
		adultSuperMan.specialTalent();
	}
}
