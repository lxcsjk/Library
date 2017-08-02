package com.company.section6;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
//ʵ��and����
public class AndSpecification extends CompositeSpecification {
	//����������������and����
	private ISpecification left;
	private ISpecification right;
	
	public AndSpecification(ISpecification _left,ISpecification _right){
		this.left = _left;
		this.right = _right;
	}
	
	//����and����
	@Override
	public boolean isSatisfiedBy(Object candidate) {
		return left.isSatisfiedBy(candidate) && right.isSatisfiedBy(candidate);
	}

}
