package com.company.proxy;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Agent implements IStar {
	//������˭�Ĵ�����
	private IStar star;
	//���캯����������
	public Agent(IStar _star){
		this.star = _star;
	}
	//�������ǲ���ǩ�ֵģ�ǩ���˸���Ҳ����ѽ
	public void sign() {
		star.sign();
	}

}
