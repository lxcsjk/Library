package com.company.proxy;

import java.util.Random;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class RunnerAgent implements IRunner {
	private IRunner runner;
	
	public RunnerAgent(IRunner _runner){
		this.runner = _runner;
	}
	
	//�������ǲ����ܵ�
	public void run() {
		Random rand = new Random();
		if(rand.nextBoolean()){
			System.out.println("������ͬ�ⰲ���˶�Ա�ܲ�");
			runner.run();
		}else{
			System.out.println("���������鲻�ã��������˶�Ʒ�ܲ�");
		}
	}

}
