package com.company.section4;

import java.util.Vector;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Subject {
	//��һ��һ���۲�������
	private Vector<Observer> obsVector = new Vector<Observer>();
	
	//����һ���۲���
	public void addObserver(Observer o){
		this.obsVector.add(o);
	}
	
	//ɾ��һ���۲���
	public void delObserver(Observer o){
		this.obsVector.remove(o);
	}
	
	//֪ͨ���й۲���
	public void notifyObserver(){
		for(Observer o:this.obsVector){
			o.update();
		}
	}
}
