package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ConcreteCommand2 extends Command {
	//Ҳ���Ǹ�Receiver����������
	private Receiver receiver;
	
	//���캯�����ݽ�����
	public ConcreteCommand2(Receiver _receiver){
		this.receiver = _receiver;
	}
	
	//ÿ��������������ʵ��һ������
	public void execute() {
		//ҵ����
		this.receiver.doSomething();
	}

}
