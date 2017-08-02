package com.company.section7;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Originator {
	
	//�ڲ�״̬
	private String state1 = "";
	private String state2 = "";
	private String state3 = ""; 
	
	public String getState1() {
		return state1;
	}

	public void setState1(String state1) {
		this.state1 = state1;
	}

	public String getState2() {
		return state2;
	}

	public void setState2(String state2) {
		this.state2 = state2;
	}

	public String getState3() {
		return state3;
	}

	public void setState3(String state3) {
		this.state3 = state3;
	}

	//����һ������¼
	public Memento createMemento(){
		return new Memento(BeanUtils.backupProp(this));
	}
	
	//�ָ�һ������¼
	public void restoreMemento(Memento _memento){
		BeanUtils.restoreProp(this, _memento.getStateMap());
	}
	
	//����һ��toString����
	@Override
	public String toString(){
		return "state1=" +state1+"\nstat2="+state2+"\nstate3="+state3; 
	}
}
