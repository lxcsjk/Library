package com.company.section7;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ��Ϸ���
 */
public interface IGamePlayer {

	//��¼��Ϸ
	public void login(String user,String password);
	
	//ɱ�֣�����������Ϸ����Ҫ��ɫ
	public void killBoss();
	
	//����
	public void upgrade();
	
	//ÿ���˶�������һ���Լ��Ĵ���
	public IGamePlayer getProxy();
}
