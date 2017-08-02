package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Calculator {
	//�ӷ���
	private final static String ADD_SYMBOL = "+";
	//������
	private final static String SUB_SYMBOL = "-";
	
	public int exec(int a,int b,String symbol){
		int result =0;
		if(symbol.equals(ADD_SYMBOL)){
			result = this.add(a, b);
		}else if(symbol.equals(SUB_SYMBOL)){
			result = this.sub(a, b);
		}
		return result;
	}
	
	//�ӷ�����
	private int add(int a,int b){
		return a+b;
	}
	
	//��������
	private int sub(int a,int b){
		return a-b;
	}
}
