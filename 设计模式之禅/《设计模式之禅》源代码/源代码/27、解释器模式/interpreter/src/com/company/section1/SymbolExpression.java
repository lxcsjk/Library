package com.company.section1;

import java.util.HashMap;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class SymbolExpression extends Expression {
	protected Expression left;
	protected Expression right;
	
	//���еĽ�����ʽ��Ӧֻ�����Լ������������ʽ�Ľ��
	public SymbolExpression(Expression _left,Expression _right){
		this.left = _left;
		this.right = _right;
	}


}
