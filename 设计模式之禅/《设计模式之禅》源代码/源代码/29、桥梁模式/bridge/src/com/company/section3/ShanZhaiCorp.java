package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ShanZhaiCorp extends Corp {
	 //��ʲô��Ʒ����֪�����ȱ����õĲ�֪��
	public ShanZhaiCorp(Product product){
		super(product);
	}
	//��׬Ǯ
	public void makeMoney(){
		super.makeMoney();
		System.out.println("��׬Ǯѽ...");
	}
}

