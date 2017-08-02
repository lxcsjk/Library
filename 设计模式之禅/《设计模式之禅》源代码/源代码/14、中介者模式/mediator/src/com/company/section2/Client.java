package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ҵ�񳡾���
 */
public class Client {
	
	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		//�ɹ���Ա�ɹ�����
		System.out.println("------�ɹ���Ա�ɹ�����--------");
		Purchase purchase = new Purchase(mediator);
		purchase.buyIBMcomputer(100);
		
		//������Ա���۵���
		System.out.println("\n------������Ա���۵���--------");
		Sale sale = new Sale(mediator);
		sale.sellIBMComputer(1);
		
		//�ⷿ������Ա������
		System.out.println("\n------�ⷿ������Ա��⴦��--------");
		Stock stock = new Stock(mediator);
		stock.clearStock();
	}

}
