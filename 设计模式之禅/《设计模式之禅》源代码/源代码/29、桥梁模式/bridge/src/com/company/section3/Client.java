package com.company.section3;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		House house = new House();
		System.out.println("-------���ز���˾������������е�-------");
		//���ҵ����ز���˾
		HouseCorp houseCorp =new HouseCorp(house);
		//������ô��Ǯ
		houseCorp.makeMoney();
		System.out.println("\n");	
		//ɽկ��˾�����Ĳ�Ʒ�ܶ࣬������ֻҪָ����Ʒ�ͳ���
		System.out.println("-------ɽկ��˾���������е�-------");
		ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new IPod());
		shanZhaiCorp.makeMoney();	
	}
}

