package com.company.section1;

import java.util.Random;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ���
 */
public class Stock {
	//�տ�ʼ��100̨����
	private static int COMPUTER_NUMBER =100;  
	
	//�������
	public void increase(int number){
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("�������Ϊ��"+COMPUTER_NUMBER);
	}
	
	//��潵��
	public void decrease(int number){
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("�������Ϊ��"+COMPUTER_NUMBER);
	}
	
	//��ÿ������
	public int getStockNumber(){
		return COMPUTER_NUMBER;
	}
	
	//���ѹ�����ˣ���Ҫ֪ͨ�ɹ���Ա��Ҫ�ɹ���������ԱҪ��������
	public void clearStock(){
		Purchase purchase = new Purchase();
		Sale sale = new Sale();
		System.out.println("����������Ϊ��"+COMPUTER_NUMBER);
		//Ҫ���ۼ�����
		sale.offSale();
		//Ҫ��ɹ���Ա��Ҫ�ɹ�
		purchase.refuseBuyIBM();
		
	}
}
