package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ��̽��������Ů
 */
public abstract class AbstractSearcher {
	protected IGoodBodyGirl goodBodyGirl;
	protected IGreatTemperamentGirl greatTemperamentGirl;
	
	//����������Ů
	public AbstractSearcher(IGoodBodyGirl _goodBodyGirl){
		this.goodBodyGirl = _goodBodyGirl;
	}
	
	//����������Ů
	public AbstractSearcher(IGreatTemperamentGirl _gretTemperamentGirl){
		this.greatTemperamentGirl = _gretTemperamentGirl;
	}
	
	//������Ů���г���Ů��Ϣ
	public abstract void show();
}
