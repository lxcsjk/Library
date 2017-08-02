package com.cbf4life.common5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class UserByAgeThan implements IUserSpecification {
	//��׼����
	private int age;
	//���캯�����ݻ�׼����
	public UserByAgeThan(int _age){
		this.age = _age;
	}
	
	//�����û��Ƿ���������
	public boolean IsSatisfiedBy(User user) {
		return user.getAge() > age;
	}

}
