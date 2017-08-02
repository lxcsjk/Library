package com.company;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ���Թ���
 */
public class StrategyFactory {
	
	//���Թ���
	public static IDeduction getDeduction(StrategyMan strategy){
		IDeduction deduction = null;
		try {
			deduction = (IDeduction)Class.forName(strategy.getValue()).newInstance();
		}  catch (Exception e) {
			// �쳣����
			e.printStackTrace();
		}
		return deduction;
		
	}
}
