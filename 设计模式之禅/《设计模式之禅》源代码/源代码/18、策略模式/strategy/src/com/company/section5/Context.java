package com.company.section5;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Context {

	
	private Calculator cal = null;
	
	public Context(Calculator _cal){
		this.cal = _cal;
	}
	
	public int exec(int a,int b,String symbol){
		return this.cal.exec(a, b);
	}
	
}
