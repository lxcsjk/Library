package com.company;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class FreeDeduction implements IDeduction {

	//���ɿۿ�
	public boolean exec(Card card, Trade trade) {
		//ֱ�Ӵ���������п۳�
		card.setFreeMoney(card.getFreeMoney() - trade.getAmount());
		return true;
	}

}
