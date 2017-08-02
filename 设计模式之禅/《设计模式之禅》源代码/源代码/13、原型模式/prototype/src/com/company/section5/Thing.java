package com.company.section5;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ����
 */
public class Thing implements Cloneable{
	//����һ��˽�б���
	private final ArrayList<String> arrayList = new ArrayList<String>();

	@Override
	public Thing clone(){
		Thing thing=null;
		try {
			thing = (Thing)super.clone();	
			//this.arrayList = (ArrayList<String>)this.arrayList.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return thing;
	}
	
	//����HashMap��ֵ
	public void setValue(String value){
		this.arrayList.add(value);
	}
	
	//ȡ��arrayList��ֵ
	public ArrayList<String> getValue(){
		return this.arrayList;
	}
		
}
