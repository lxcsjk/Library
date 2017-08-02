package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public enum EventCustomType {
	//�½����¼�
	NEW(1),
	//ɾ���¼�
	DEL(2),
	//�޸��¼�
	EDIT(3),
	//��¡�¼�
	CLONE(4);
	
	private int value=0;
	private EventCustomType(int _value){
		this.value = _value;
	}
	public int getValue(){
		return value;
	}
}