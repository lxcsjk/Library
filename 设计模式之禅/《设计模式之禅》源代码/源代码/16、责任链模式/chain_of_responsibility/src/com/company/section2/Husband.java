package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �ɷ���
 */
public class Husband extends Handler {
	//�ɷ�ֻ�������ӵ�����
	public Husband(){
		super(Handler.HUSBAND_LEVEL_REQUEST);
	}
	
	//�ɷ���ʾ�Ĵ�
	@Override
	protected void response(IWomen women) {
		System.out.println("--------�������ɷ���ʾ-------");
		System.out.println(women.getRequest());
		System.out.println("�ɷ�Ĵ��ǣ�ͬ��\n");
	}

}
