package com.company.section1;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ��̽
 */
public class Searcher extends AbstractSearcher{
	public Searcher(IPettyGirl _pettyGirl){
		super(_pettyGirl);
	}
	
	//չʾ��Ů����Ϣ
	public void show(){
		System.out.println("--------��Ů����Ϣ���£�---------------");
		//չʾ����
		super.pettyGirl.goodLooking();
		//չʾ���
		super.pettyGirl.niceFigure();
		//չʾ����
		super.pettyGirl.greatTemperament();
	}
}
