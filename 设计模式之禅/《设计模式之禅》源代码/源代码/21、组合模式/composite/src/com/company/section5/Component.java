package com.company.section5;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Component {
	
	//��������嶼���еĹ���
	public void doSomething(){
		//��дҵ���߼�
	}	
	
	//����һ��Ҷ�ӹ�������֦����
	public abstract void add(Component component);
	
	//ɾ��һ��Ҷ�ӹ�������֦����
	public abstract void remove(Component component);
	
	//��÷�֧�µ�����Ҷ�ӹ�������֦����
	public abstract ArrayList<Component> getChildren();
}
