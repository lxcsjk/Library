package com.company.section2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ����ʹ��Client�����һ���������
 */
public class Client {

	public static void main(String[] args) {
		//����һ��Ů��Ⱥ��
		List<Girl> listGirls = new ArrayList<Girl>();
		//��ʼ��Ů��
		for(int i=0;i<20;i++){
			listGirls.add(new Girl());
		}
			
		Teacher teacher= new Teacher();
		
		//��ʦ��������
		teacher.commond(new GroupLeader(listGirls));
	}
	
}
