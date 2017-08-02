package com.company.section4;

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
	//�¼�������
	private Vector<EventCustomer> customer = new Vector<EventCustomer>();
	
	//�����������µ�ʵ��
	private EventDispatch(){
		
	}
	
	//��õ�������
	public static EventDispatch getEventDispathc(){
		return dispatch;
	}
	
	//�¼�����
	public void update(Observable o, Object arg) {
		//�¼���Դͷ
		Product product = (Product)arg;
		//�¼�
		ProductEvent event = (ProductEvent)o;
	
		//�����ߴ����������н���ģʽ�ĺ��ģ������Ǻܸ��ӵ�ҵ���߼�
		for(EventCustomer e:customer){			
			//���������Ƿ�ƥ��
			for(EventCustomType t:e.getCustomType()){				
				if(t.getValue() == event.getEventType().getValue()){
					e.exec(event);
				}					
			}

		}
	}

	//ע���¼�������
	public void registerCustomer(EventCustomer _customer){
		customer.add(_customer);
	}	

	
}

