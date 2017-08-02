package com.cbf4life.common5;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UserProvider implements IUserProvider {
	//�û��б�
	private ArrayList<User> userList;
	//�����û��б�
	public UserProvider(ArrayList<User> _userList){
		this.userList = _userList;
	}
	//����ָ���Ĺ������û�
	public ArrayList<User> findUser(IUserSpecification userSpec) {
		ArrayList<User> result = new ArrayList<User>();
		for(User u:userList){
			if(userSpec.IsSatisfiedBy(u)){//����ָ�����
				result.add(u);
			}
		}
		return result;
	}

}
