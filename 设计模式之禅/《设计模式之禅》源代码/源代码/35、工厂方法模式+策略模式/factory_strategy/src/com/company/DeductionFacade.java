package com.company;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class DeductionFacade {
	
	//���⹫���Ŀۿ���Ϣ
	public static Card deduct(Card card,Trade trade){
		//������Ѳ���
		StrategyMan reg = getDeductionType(trade);
		//��ʼ��һ�����Ѳ��Զ���
		IDeduction deduction = StrategyFactory.getDeduction(reg);
		//����һ������������
		DeductionContext context = new DeductionContext(deduction);
		//���пۿ��
		context.exec(card, trade);
		//���ؿۿ����Ϻ������
		return card;
	}
	
	//��ö�Ӧ���̻����Ѳ���
	private static StrategyMan getDeductionType(Trade trade){
		//ģ�����
		if(trade.getTradeNo().contains("abc")){
			return StrategyMan.FreeDeduction;
		}else{
			return StrategyMan.SteadyDeduction;
		}
	}
}
