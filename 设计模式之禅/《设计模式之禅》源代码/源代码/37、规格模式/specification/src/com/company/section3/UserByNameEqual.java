package com.company.section3;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UserByNameEqual implements IUserSpecification {
	//��׼����
	private String name;
	//���캯�����ݻ�׼����
	public UserByNameEqual(String _name){
		this.name = _name;
	}
	
	//�����û��Ƿ���������
	public boolean IsSatisfiedBy(User user) {
		return user.getName().equals(name);
	}

}
