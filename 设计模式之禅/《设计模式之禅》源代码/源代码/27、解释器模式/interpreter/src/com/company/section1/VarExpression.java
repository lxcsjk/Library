package com.company.section1;

import java.util.HashMap;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ���������������ǰѱ�������ֵ��Ӧ����
 */
public class VarExpression extends Expression {
	private String key;
	
	public VarExpression(String _key){
		this.key = _key;
	}
	
	//��map��ȡ֮
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}

}
