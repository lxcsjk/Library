package com.company.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class NotSpecification extends CompositeSpecification {
	//����һ�������
	private IUserSpecification spec;
	
	public NotSpecification(IUserSpecification _spec){
		this.spec = _spec;
	}
	
	//not����
	@Override
	public boolean isSatisfiedBy(User user) {
		return !spec.isSatisfiedBy(user);
	}

}
