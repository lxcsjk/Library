package com.company.state;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class HumanState {
	//ָ��һ���������
	protected Human human;
	//����һ���������
	public void setHuman(Human _human){
		this.human = _human;
	}
	
	//��������ʲô״̬��Ҫ����
	public abstract void work();
}
