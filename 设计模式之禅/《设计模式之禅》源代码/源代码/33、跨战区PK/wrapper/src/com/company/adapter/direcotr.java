package com.company.adapter;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class direcotr {

	public static void main(String[] args) {
		System.out.println("\n=======��Ϸ����ģ��==========\n");
		//����һ��������
		IStar star = new FilmStar();
		star.act("ǰʮ����ӣ����Ǳ�����Ϸ");
		
		//���ݰ�һ����ͨ��Ա��Ϊ��һ��������Ա
		IActor actor = new UnknownActor();
		IStar standin= new Standin(actor);
		standin.act("�м�����ӣ���������Ϸ");
		
		star.act("��ʮ����ӣ����Ǳ�����Ϸ");
		
	}
}
