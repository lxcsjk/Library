package com.company.section4;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteCommand1 extends Command {
	//�����Լ���Ĭ�Ͻ�����
	public ConcreteCommand1(){
		super(new ConcreteReciver1());
	}	
	//�����µĽ�����
	public ConcreteCommand1(Receiver _receiver){
		super(_receiver);
	}	
	//ÿ��������������ʵ��һ������
	public void execute() {
		//ҵ����
		super.receiver.doSomething();
	}
}
