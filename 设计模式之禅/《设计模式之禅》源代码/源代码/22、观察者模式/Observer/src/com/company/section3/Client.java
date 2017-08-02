package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ���Client�������ǣ������ǵ��ӽǿ��������ʷ
 */
public class Client {
	
	public static void main(String[] args) {
		//�����۲��߲�������
		Observer liSi = new LiSi();
		Observer wangSi = new WangSi();
		Observer liuSi = new LiuSi();
		
		//�����������
		HanFeiZi hanFeiZi = new HanFeiZi();
		
		//���Ǻ��˸�����ʷ������������������������ڹ۲캫����
		hanFeiZi.addObserver(liSi);
		hanFeiZi.addObserver(wangSi);
		hanFeiZi.addObserver(liuSi);
		
		//Ȼ���������ǿ����������ڸ�ʲô
		hanFeiZi.haveBreakfast();		
	}
}
