package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	//ģ�⽻��
	public static void main(String[] args) {
	
		//��ʼ��һ��IC��
		Card card = initIC();
		//��ʾһ�¿�����Ϣ
		System.out.println("========��ʼ����Ϣ��=========");
		showCard(card);
		
		//�Ƿ�ֹͣ���б�־
		boolean flag = true;
		while(flag){
			Trade trade = createTrade();
			
			DeductionFacade.deduct(card, trade);
			//���׳ɹ�����ӡ���ɹ�������Ϣ
			System.out.println("\n======����ƾ֤========");
			System.out.println(trade.getTradeNo()+" ���׳ɹ���");
			System.out.println("���η����Ľ��׽��Ϊ��"+ trade.getAmount()/100.0 + " Ԫ");
			//չʾһ�¿�����Ϣ
			showCard(card);
			
			System.out.print("\n�Ƿ���Ҫ�˳���(Y/N)");
			if(getInput().equalsIgnoreCase("y")){
				flag = false;  //�˳���
			}
		}
		
	}
	
	//��ʼ��һ��IC��
	private static Card initIC(){
		Card card = new Card();
		card.setCardNo("1100010001000");
		card.setFreeMoney(100000);  //һǧԪ
		card.setSteadyMoney(80000); //�˰�Ԫ
		return card;
	}
	
	//����һ������
	private static Trade createTrade(){
		Trade trade = new Trade();
		System.out.print("�����뽻�ױ�ţ�");
		trade.setTradeNo(getInput());
		System.out.print("�����뽻�׽�");
		trade.setAmount(Integer.parseInt(getInput()));
		
		//���ؽ���
		return trade;
	}
	
	//��ӡ����ǰ���ڽ������
	public static void showCard(Card card){

		System.out.println("IC�����:" + card.getCardNo());
		System.out.println("�̶�������"+ card.getSteadyMoney()/100.0 + " Ԫ");
		System.out.println("����������"+ card.getFreeMoney()/100.0 + " Ԫ");
	}
	
	//��ü�������
	public static String getInput(){
		String str ="";
		try {
			str = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		} catch (IOException e) {
			//�쳣����
		}
		return str;
	}
	
	
}
