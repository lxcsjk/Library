package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������
 */
public class Son extends Handler {
	//����ֻ����ĸ�׵�����
	public Son(){
		super(Handler.SON_LEVEL_REQUEST);
	}
	
	//���ӵĴ�
	protected void response(IWomen women) {
		System.out.println("--------ĸ���������ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("���ӵĴ��ǣ�ͬ��\n");
	}

	
}
