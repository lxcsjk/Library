package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public enum ProductEventType {
	//�½�һ����Ʒ
	NEW_PRODUCT(1),
	//ɾ��һ����Ʒ
	DEL_PRODUCT(2),
	//�޸�һ����Ʒ
	EDIT_PRODUCT(3),
	//��¡һ����Ʒ
	CLONE_PRODUCT(4);
	
	private int value=0;
	private ProductEventType(int _value){
		this.value = _value;
	}
	
	public int getValue(){
		return this.value;
	}
}

