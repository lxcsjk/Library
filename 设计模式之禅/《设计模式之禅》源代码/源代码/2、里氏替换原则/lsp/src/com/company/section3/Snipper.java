package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * �ѻ��֣�Ϊʲô��Snipper��snipe������������֣������ְ����������̵����е��Ǹ�����
 * Ӣ�����嵽ӡ�ȴ��ԣ���������ֺܴ�������һ�����ͷ����ˣ�û�취�Ϳ�ʼαװ��Զ�̾�׼��������Ǻ�
 * snipper�͵�����
 */
public class Snipper {
	//����һ���ѻ�ǹ
	private AUG aug;
	
	//���ѻ���һ��ѻ�ǹ
	public void setRifle(AUG _aug){
		this.aug = _aug;
	}
	
	public void killEnemy(){
		//���ȿ������˵��������ɱ�����ˣ��Լ�Ҳ���˸ɵ�
		aug.zoomOut();
		//��ʼ���
		aug.shoot();
	}
}
