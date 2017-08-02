package com.company.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class RunnerWithJet implements IRunner {
	private IRunner runner;
	
	public RunnerWithJet(IRunner _runner){
		this.runner = _runner;
	}
	public void run() {
		System.out.println("�ӿ��˶�Ա���ٶȣ�Ϊ�˶�Ա��������װ��");
		runner.run();
	}

}
