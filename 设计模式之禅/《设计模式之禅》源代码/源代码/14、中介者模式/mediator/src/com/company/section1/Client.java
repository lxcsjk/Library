package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ҵ�񳡾���
 */
public class Client {
	
	public static void main(String[] args) {
		//�ɹ���Ա�ɹ�����
		System.out.println("------�ɹ���Ա�ɹ�����--------");
		Purchase purchase = new Purchase();
		purchase.buyIBMcomputer(100);
		
		//������Ա���۵���
		System.out.println("\n------������Ա���۵���--------");
		Sale sale = new Sale();
		sale.sellIBMComputer(1);
		
		//�ⷿ������Ա������
		System.out.println("\n------�ⷿ������Ա��⴦��--------");
		Stock stock = new Stock();
		stock.clearStock();
	}

}
