package com.company.section4;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteCommand2 extends Command {	
	//�����Լ���Ĭ�Ͻ�����
	public ConcreteCommand2(){
		super(new ConcreteReciver2());
	}	
	//�����µĽ�����
	public ConcreteCommand2(Receiver _receiver){
		super(_receiver);
	}	
	//ÿ��������������ʵ��һ������
	public void execute() {
		//ҵ����
		super.receiver.doSomething();
	}
}
