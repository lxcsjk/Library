package com.company.section1;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * Ů洽����������������ߣ��ֱ��ǣ�
 * ����������
 * Ů��������
 */
public class NvWa {
	
	public static void main(String[] args) {
		
		//��һ�������ߣ�����������
		HumanFactory maleHumanFactory = new MaleFactory();
		
		//�ڶ��������ߣ�Ů��������
		HumanFactory femaleHumanFactory = new FemaleFactory();
		
		//�����߽�����ϣ���ʼ��������:
		Human maleYellowHuman = maleHumanFactory.createYellowHuman();
		
		Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
		
		
		System.out.println("---����һ����ɫŮ��---");
		femaleYellowHuman.getColor();
		femaleYellowHuman.talk();
		femaleYellowHuman.getSex();
		
		System.out.println("\n---����һ����ɫ����---");
		maleYellowHuman.getColor();
		maleYellowHuman.talk();
		maleYellowHuman.getSex();
		

		
		/*
		 * .....
		 * �������������
		 */
	}
}
