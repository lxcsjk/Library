package com.company.chain;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class Recorder {
	//����
	private String domain;
	//IP��ַ
	private String ip;
	//����
	private String owner;
	
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	//�����¼��Ϣ
	@Override
	public String toString(){
		String str= "������" + this.domain;
		str = str + "\nIP��ַ��" + this.ip;
		str = str + "\n�����ߣ�" + this.owner;
		
		return str;
	}
}
