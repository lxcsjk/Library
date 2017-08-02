package com.cbf4life.common5;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//���ȳ�ʼ��һ���û�
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User("�չ���",23));
		userList.add(new User("����ţ",82));		
		userList.add(new User("�Ź�����",10));
		userList.add(new User("����",10));
		
		//����һ���û���ѯ��
		IUserProvider userProvider = new UserProvider(userList);
		
		//��ӡ�������Թ��쿪ͷ����Ա
		System.out.println("===�����Թ��쿪ͷ����Ա===");
		//����һ�����
		IUserSpecification userSpec1 = new UserByNameLike("%����%");
		IUserSpecification userSpec2 = new UserByAgeThan(20);
		userList = userProvider.findUser(userSpec1);
		for(User u:userProvider.findUser(userSpec2)){
			System.out.println(u);
		}
	}
}
