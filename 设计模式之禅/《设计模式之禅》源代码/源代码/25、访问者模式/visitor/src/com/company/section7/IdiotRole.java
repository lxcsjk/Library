package com.company.section7;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class IdiotRole implements Role {
	//һ�����ǽ�ɫ,Ȼ˭������
	public void accept(AbsActor actor){
		actor.act(this);
	}
}
