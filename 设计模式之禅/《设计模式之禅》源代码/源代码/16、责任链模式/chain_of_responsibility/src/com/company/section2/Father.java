package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ����
 */
public class Father extends Handler {
	//����ֻ����Ů��������
	public Father(){
		super(Handler.FATHER_LEVEL_REQUEST);
	}
	
	//���׵Ĵ�
	@Override
	protected void response(IWomen women) {
		System.out.println("--------Ů��������ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("���׵Ĵ���:ͬ��\n");
	}

}
