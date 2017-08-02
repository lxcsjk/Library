package com.company.strategy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Context {
	private WorkAlgorithm workMethod;

	public WorkAlgorithm getWork() {
		return workMethod;
	}

	public void setWork(WorkAlgorithm work) {
		this.workMethod = work;
	}
	
	//ÿ���㷨���б�����еĹ���
	public void work(){
		this.workMethod.work();
	}
}
