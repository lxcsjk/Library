package com.company.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//����һ�����곬��
		SuperMan adultSuperMan = Director.getAdultSuperMan();
		//չʾһ�³��˵���Ϣ
		adultSuperMan.getSpecialTalent();
	}
}
