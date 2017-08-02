package com.company;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class DeductionContext {

	//�ۿ����
	private IDeduction deduction = null;
	
	//���캯�����ݲ���
	public DeductionContext(IDeduction _deduction){
		this.deduction = _deduction;
	}
	
	//ִ�пۿ�
	public boolean exec(Card card,Trade trade){
		return this.deduction.exec(card, trade);
	}
}
