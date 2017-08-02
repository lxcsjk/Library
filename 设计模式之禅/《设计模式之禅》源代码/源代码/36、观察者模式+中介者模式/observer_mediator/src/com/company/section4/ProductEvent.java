package com.company.section4;

import java.util.Observable;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ProductEvent extends Observable{
	//�¼���Դ
	private Product source;
	//�¼�������
	private ProductEventType type;
		
	//�����¼���Դͷ,Ĭ��Ϊ�½�����
	public ProductEvent(Product p) {
		this(p,ProductEventType.NEW_PRODUCT);
	}
	
	//�¼�Դͷ�Լ��¼�����
	public ProductEvent(Product p,ProductEventType _type){	
		this.source = p;
		this.type = _type;
		//�¼�����
		notifyEventDispatch();
	}
	
	//����¼���ʼ��ٸ��
	public Product getSource(){
		return source;
	}
	
	//����¼�������
	public ProductEventType getEventType(){
		return this.type;
	}
	
	//֪ͨ�¼���������
	private void notifyEventDispatch(){
		super.addObserver(EventDispatch.getEventDispathc());
		super.setChanged();
		super.notifyObservers(source);
	}
}
