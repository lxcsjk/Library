package com.company.section1;

import java.util.ArrayList;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface IUserProvider {

	//�����û��������û�
	public ArrayList<User> findUserByNameEqual(String name);
	
	//�������ָ��������û�
	public ArrayList<User> findUserByAgeThan(int age);
		
}
