package com.company.decorator;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Decorator implements IStar {
	//���ε���˭
	private IStar star;
	
	public Decorator(IStar _star){
		this.star = _star;
	}
	
	public void act() {
		this.star.act();
	}

}
