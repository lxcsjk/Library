package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ��̽��������Ů
 */
public abstract class AbstractSearcher {
	protected IPettyGirl pettyGirl;
	public AbstractSearcher(IPettyGirl _pettyGirl){
		this.pettyGirl = _pettyGirl;
	}
	
	//������Ů���г���Ů��Ϣ
	public abstract void show();
}
