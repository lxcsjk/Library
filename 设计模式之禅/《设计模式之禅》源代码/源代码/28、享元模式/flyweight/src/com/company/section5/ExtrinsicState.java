package com.company.section5;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ExtrinsicState {
	//���Կ�Ŀ
	private String subject;
	//���Եص�
	private String location;
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof ExtrinsicState){
			ExtrinsicState state = (ExtrinsicState)obj;
			return state.getLocation().equals(location) && state.getSubject().equals(subject);		
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return subject.hashCode() + location.hashCode();
	}
}
