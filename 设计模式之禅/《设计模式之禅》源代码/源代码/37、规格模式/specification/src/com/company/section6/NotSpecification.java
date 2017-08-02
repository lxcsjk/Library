package com.company.section6;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class NotSpecification extends CompositeSpecification {
	//����һ�������
	private ISpecification spec;
	
	public NotSpecification(ISpecification _spec){
		this.spec = _spec;
	}
	
	//not����
	@Override
	public boolean isSatisfiedBy(Object candidate) {
		return !spec.isSatisfiedBy(candidate);
	}

}
