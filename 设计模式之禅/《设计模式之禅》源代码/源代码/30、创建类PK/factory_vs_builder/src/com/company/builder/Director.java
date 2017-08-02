package com.company.builder;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Director {
	//���������ߵ�Ӧ��
	private static Builder  adultBuilder = new AdultSuperManBuilder();
	//δ���곬�˵Ľ�����
	private static Builder childBuilder = new ChildSuperManBuilder();
	
	//����һ�����ꡢ����еĳ���
	public static SuperMan getAdultSuperMan(){
		return adultBuilder.getSuperMan();
	}
	//����һ��δ���ꡢ��ǹ����ĳ���
	public static SuperMan getChildSuperMan(){
		return childBuilder.getSuperMan();
	}
	
}
