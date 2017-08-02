package com.company.section3;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Client {
	
	public static void main(String[] args) {
		//���ȳ�ʼ��һ���û�
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User("�մ�",3));
		userList.add(new User("ţ��",8));		
		userList.add(new User("����",10));
		userList.add(new User("����",15));
		userList.add(new User("����",18));
		userList.add(new User("����",20));
		userList.add(new User("����",25));
		userList.add(new User("���",30));
		userList.add(new User("���",35));
		userList.add(new User("��ʮ",40));
		
		//����һ���û���ѯ��
		IUserProvider userProvider = new UserProvider(userList);
		
		//��ӡ���������20����û�
		System.out.println("===�������20����û�===");
		//����һ�����
		IUserSpecification userSpec = new UserByAgeThan(20);
		for(User u:userProvider.findUser(userSpec)){
			System.out.println(u);
		}
	}
}
