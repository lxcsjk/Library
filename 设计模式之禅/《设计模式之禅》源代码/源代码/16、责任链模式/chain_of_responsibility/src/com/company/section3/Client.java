package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//���������еĴ���ڵ�
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		//�������еĽ׶�˳��,1-->2-->3
		handler1.setNext(handler2);
		handler2.setNext(handler3);
		//�ύ���󣬷��ؽ��
		Response response = handler1.handlerMessage(new Request());
	}

}
