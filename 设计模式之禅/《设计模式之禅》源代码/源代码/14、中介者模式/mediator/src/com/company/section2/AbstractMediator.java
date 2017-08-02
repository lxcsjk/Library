package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbstractMediator {
	protected Purchase purchase;
	protected Sale sale;
	protected Stock stock;
	
	//���캯��
	public AbstractMediator(){
		purchase = new Purchase(this);
		sale = new Sale(this);
		stock = new Stock(this);
	}
	
	//�н�������Ҫ�ķ����������¼�����������������֮��Ĺ�ϵ
	public abstract void execute(String str,Object...objects);
}