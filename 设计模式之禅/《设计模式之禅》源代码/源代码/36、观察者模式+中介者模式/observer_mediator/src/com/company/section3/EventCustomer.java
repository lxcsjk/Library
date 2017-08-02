package com.company.section3;

import java.util.Vector;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class EventCustomer {
	//����ÿ���������ܹ�����ļ���
	private Vector<EventCustomType> customType = new Vector<EventCustomType>();
	
	//ÿ�������߶�Ҫ�����Լ�������һ������Ϣ
	public EventCustomer(EventCustomType _type){
		addCustomType(_type);
	}
	
	//ÿ�������߿������Ѷ���¼�
	public void addCustomType(EventCustomType _type){
		customType.add(_type);
	}
	
	//�õ��Լ��Ĵ�������
	public Vector<EventCustomType> getCustomType(){
		return customType;
	}
	
	//ÿ���¼���Ҫ���¼���������ʽ����
	public abstract void exec(ProductEvent event);
}
