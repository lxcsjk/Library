package com.company.section2;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class EventDispatch implements Observer{
	//����ģʽ
	private final static EventDispatch dispatch = new EventDispatch(); 
	
	//�����������µ�ʵ��
	private EventDispatch(){
		
	}
	
	//��õ�������
	public static EventDispatch getEventDispathc(){
		return dispatch;
	}
	
	//�¼�����
	public void update(Observable o, Object arg) {
		
	}
	
}
