package com.company.section4;

import java.util.ArrayList;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface IUserProvider {
	
	//�������������û�
	public ArrayList<User> findUser(IUserSpecification userSpec);
}
