package com.company.section6;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public enum Calculator {
	//�ӷ�����
	ADD("+"){
		public int exec(int a,int b){
			return a+b;
		}
	},
	//��������
	SUB("-"){
		public int exec(int a,int b){
			return a - b;
		}
	};
	
	String value = "";
	//�����Աֵ����
	private Calculator(String _value){
		this.value = _value;
	}
	//���ö�ٳ�Ա��ֵ
	public String getValue(){
		return this.value;
	}
	
	//����һ��������
	public abstract int exec(int a,int b);
}
