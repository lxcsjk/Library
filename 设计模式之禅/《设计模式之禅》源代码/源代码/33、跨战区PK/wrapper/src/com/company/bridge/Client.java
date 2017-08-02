package com.company.bridge;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {

	public static void main(String[] args) {
		//������һ����Ӱ����
		AbstractStar zhangSan = new FilmStar();
		//������һ������
		AbstractStar liSi = new Singer();
		
		//չʾһ�¸������ǵ���Ҫ����
		zhangSan.doJob();
		liSi.doJob();
		
		//��Ȼ��Ҳ�в������ǲ�����ҵ�����������Ϸ
		liSi = new Singer(new ActFilm());
		liSi.doJob();
	}
}
