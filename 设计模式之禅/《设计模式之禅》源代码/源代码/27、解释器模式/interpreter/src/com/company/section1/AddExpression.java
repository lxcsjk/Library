package com.company.section1;

import java.util.HashMap;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �ӷ�����
 */
public class AddExpression extends SymbolExpression {

	public AddExpression(Expression _left,Expression _right){
		super(_left,_right);
	}
	
	//�������������ʽ����Ľ��������
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) + super.right.interpreter(var);
	}

}
