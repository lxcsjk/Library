package com.company.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class FilmStar extends AbstractStar {
	
	//Ĭ�ϵĵ�Ӱ����Ӧ�����ĵ�Ӱ
	public FilmStar(){
		super(new ActFilm());
	}
	
	//Ҳ������������һ����ְҵ��������������Ѩ�����ʱ�з�����
	public FilmStar(AbstractAction _action){
		super(_action);
	}
	
	//ϸ����Ӱ���ǵ�ְ��
	@Override
	public void doJob(){
		System.out.println("\n======��Ӱ���ǵ���Ҫ����=====");
		super.doJob();
	}
}
