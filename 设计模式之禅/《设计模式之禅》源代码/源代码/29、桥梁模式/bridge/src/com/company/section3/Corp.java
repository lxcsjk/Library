package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Corp {
	//����һ����Ʒ���󣬳�����ˣ���֪��������ʲô��Ʒ
	private Product product;
	//���캯���������ඨ�崫�ݾ���Ĳ�Ʒ����
	public Corp(Product product){
		this.product = product;
	}
	//��˾�Ǹ�ʲô�ģ�׬Ǯ��ѽ����׬Ǯɵ�ӲŸ�
	public void makeMoney(){	
		//ÿ����˾����һ����������
		this.product.beProducted();
		//Ȼ������
		this.product.beSelled();
	}
}

