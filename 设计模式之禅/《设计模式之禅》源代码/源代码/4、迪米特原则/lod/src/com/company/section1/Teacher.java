package com.company.section1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ��ʦ��
 */
public class Teacher {
	
	//��ʦ��ѧ����������,��һ��Ů��
	public void commond(GroupLeader groupLeader){
		List<Girl> listGirls = new ArrayList();
		//��ʼ��Ů��
		for(int i=0;i<20;i++){
			listGirls.add(new Girl());
		}
		
		//��������ίԱ��ʼִ���������
		groupLeader.countGirls(listGirls);
	}
}
