package com.company.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ������
 */
public class Client {
	
	//������չʾ��Ů��Ϣ
	public static void main(String[] args) {
		//����һ��������Ů
		IGreatTemperamentGirl yanYan = new PettyGirl("����");
		AbstractSearcher searcher = new Searcher(yanYan);
		searcher.show();
	}

}
