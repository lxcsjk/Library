package com.company.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public interface IUserSpecification {
	
	//��ѡ���Ƿ�����Ҫ��
	public boolean isSatisfiedBy(User user);	
	
	//and����
	public IUserSpecification and(IUserSpecification spec);
	
	//or����
	public IUserSpecification or(IUserSpecification spec);
	
	//not����
	public IUserSpecification not();
}

