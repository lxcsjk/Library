package com.company.section1;

import java.util.HashMap;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �������ʽ����
 */
public class SubExpression extends SymbolExpression {

	public SubExpression(Expression _left,Expression _right){
		super(_left,_right);
	}

	//�������Ǽ�������
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) - super.right.interpreter(var);
	}

}
