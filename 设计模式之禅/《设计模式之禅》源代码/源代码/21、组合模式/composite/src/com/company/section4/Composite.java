package com.company.section4;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Composite extends Component {
	//��������
	private ArrayList<Component> componentArrayList = new ArrayList<Component>();
	
	//����һ��Ҷ�ӹ�������֦����
	public void add(Component component){
		this.componentArrayList.add(component);
	}
	
	//ɾ��һ��Ҷ�ӹ�������֦����
	public void remove(Component component){
		this.componentArrayList.remove(component);
	}
	
	//��÷�֧�µ�����Ҷ�ӹ�������֦����
	public ArrayList<Component> getChildren(){
		return this.componentArrayList;
	}
}
