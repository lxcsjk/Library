package com.company;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * IC����Ϣ
 */
public class Card {

	//IC������
	private String cardNo="";
	//���ڵĹ̶����׽��
	private int steadyMoney =0;
	//�������ɽ��׽��
	private int freeMoney =0;
	
	//getter/setter����
	
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public int getSteadyMoney() {
		return steadyMoney;
	}
	public void setSteadyMoney(int steadyMoney) {
		this.steadyMoney = steadyMoney;
	}
	public int getFreeMoney() {
		return freeMoney;
	}
	public void setFreeMoney(int freeMoney) {
		this.freeMoney = freeMoney;
	}
	
}
