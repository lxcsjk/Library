package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ���ȶ���Ů洣������Ƕ����ѽ
 */
public class NvWa {

	public static void main(String[] args) {
		
		//Ů洵�һ�����ˣ�����㣬ȱ�ݲ�Ʒ
		System.out.println("--����ĵ��������ǰ�ɫ����--");
		Human whiteHuman = (new WhiteHumanFactory()).createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		
		//Ů洵ڶ������ˣ������㣬���Ǵ�Ʒ��
		System.out.println("\n--����ĵ��������Ǻ�ɫ����--");
		Human blackHuman = (new BlackHumanFactory()).createHuman();
		blackHuman.getColor();
		blackHuman.talk();
		
		//���������ˣ���������ã���Ʒ����ɫ����
		System.out.println("\n--����ĵ��������ǻ�ɫ����--");
		Human yellowHuman = (new YellowHumanFactory()).createHuman();
		yellowHuman.getColor();
		yellowHuman.talk();
			
	}

}
