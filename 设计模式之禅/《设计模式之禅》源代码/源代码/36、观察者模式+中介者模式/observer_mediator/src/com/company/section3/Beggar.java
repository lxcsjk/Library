package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Beggar extends EventCustomer {
	
	//ֻ�ܴ����������Ķ���
	public Beggar(){
		super(EventCustomType.DEL);
	}
	
	@Override
	public void exec(ProductEvent event) {
		//�¼���Դͷ
		Product p = event.getSource();
		//�¼�����
		ProductEventType type = event.getEventType();
		System.out.println("��ؤ�����¼�:"+p.getName() +"����,�¼�����="+type);				
	}

}
