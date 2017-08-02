package com.company;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SteadyDeduction implements IDeduction {
	
	//�̶��Խ��׿ۿ�
	public boolean exec(Card card, Trade trade) {
		//�̶��������ɽ����۳�50%
		int halfMoney = (int)Math.rint(trade.getAmount() / 2.0);
		card.setFreeMoney(card.getFreeMoney() - halfMoney);
		card.setSteadyMoney(card.getSteadyMoney() - halfMoney);
		return true;
	}
}
