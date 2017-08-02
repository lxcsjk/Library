package com.company.section1;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UserProvider implements IUserProvider {
	//�û��б�
	private ArrayList<User> userList;
	
	//���캯�������û��б�
	public UserProvider(ArrayList<User> _userList){
		this.userList = _userList;
	}
	
	//�������ָ��������û�
	public ArrayList<User> findUserByAgeThan(int age) {
		ArrayList<User> result = new ArrayList<User>();
		for(User u:userList){
			if(u.getAge()>age){ //�����������û�
				result.add(u);
			}
		}
		return result;
	}

	//��������ָ���������û�
	public ArrayList<User> findUserByNameEqual(String name) {
		ArrayList<User> result = new ArrayList<User>();
		for(User u:userList){
			if(u.getName().equals(name)){//��������
				result.add(u);
			}
		}
		return result;
	}

}
