package com.company.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class AbstractStar {
	//һ�����ǲμ���Щ�
	protected final AbstractAction action;
	
	//ͨ�����캯�����ݾ���
	public AbstractStar(AbstractAction _action){
		this.action = _action;
	}
	
	//ÿ�����Ƕ����Լ�����Ҫ����
	public void doJob(){
		action.desc();
	}
}
