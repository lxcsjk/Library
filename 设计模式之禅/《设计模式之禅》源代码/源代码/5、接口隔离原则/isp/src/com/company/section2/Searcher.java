package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ��̽
 */
public class Searcher extends AbstractSearcher{
	public Searcher(IGoodBodyGirl _goodBodyGirl){
		super(_goodBodyGirl);
	}
	public Searcher(IGreatTemperamentGirl _greatTemperamentGirl){
		super(_greatTemperamentGirl);
	}
	
	//չʾ��Ů����Ϣ
	public void show(){
		System.out.println("--------��Ů����Ϣ���£�---------------");
		if(super.goodBodyGirl != null){ //չʾ����������Ů
			super.goodBodyGirl.goodLooking();
			super.goodBodyGirl.niceFigure();
		}
		
		if(super.greatTemperamentGirl != null){
			super.greatTemperamentGirl.greatTemperament();
		}
	}
}
