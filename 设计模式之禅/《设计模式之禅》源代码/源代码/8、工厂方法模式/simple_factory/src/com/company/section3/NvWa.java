package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ���ȶ���Ů洣������Ƕ����ѽ
 */
public class NvWa {

	public static void main(String[] args) {
		
		//Ů洵�һ�����ˣ�����㣬ȱ�ݲ�Ʒ
		System.out.println("--����ĵ��������ǰ�ɫ����--");
		Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		//Ů洵ڶ������ˣ������㣬���Ǵ�Ʒ��
		System.out.println("\n--����ĵ��������Ǻ�ɫ����--");
		Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		//���������ˣ���������ã���Ʒ����ɫ����
		System.out.println("\n--����ĵ��������ǻ�ɫ����--");
		Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
			
	}

}
