package com.company.factory;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SuperManFactory {
	
	//����һ���������˵Ĺ���
	public static ISuperMan createSuperMan(String type){
		//�����������������ͬ�ĳ���
		if(type.equalsIgnoreCase("adult")){
			//�������˳���
			return new AdultSuperMan();
		}else if(type.equalsIgnoreCase("child")){
			//
			return new ChildSuperMan();
		}else{
			return null;
		}
	}
}
