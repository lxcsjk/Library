package com.company.section2;

import java.util.List;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ����ίԱ�����̫�ѷ����˶����й�����ɫ�ʻ�
 */
public class GroupLeader {
	private List<Girl> listGirls;
	//����ȫ���Ů������
	public GroupLeader(List<Girl> _listGirls){
		this.listGirls = _listGirls;
	}
	
	//�����Ů���Ĺ���
	public void countGirls(){

		System.out.println("Ů�������ǣ�"+this.listGirls.size());
	}
}
