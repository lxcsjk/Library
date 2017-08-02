package com.company.section3;

import java.util.Map;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ��OuterUser��װ��UserInfo
 */
@SuppressWarnings("all")
public class OuterUserInfo implements IUserInfo {
	//ԴĿ�����
	private IOuterUserBaseInfo baseInfo = null;  //Ա���Ļ�����Ϣ
	private IOuterUserHomeInfo homeInfo = null; //Ա���ļ�ͥ ��Ϣ
	private IOuterUserOfficeInfo officeInfo = null; //������Ϣ
	
	//���ݴ���
	private Map baseMap = null;
	private Map homeMap = null;
	private Map officeMap = null;
	
	//���캯�����ݶ���
	public OuterUserInfo(IOuterUserBaseInfo _baseInfo,IOuterUserHomeInfo _homeInfo,IOuterUserOfficeInfo _officeInfo){
		this.baseInfo = _baseInfo;
		this.homeInfo = _homeInfo;
		this.officeInfo = _officeInfo;
		
		//���ݴ���
		this.baseMap = this.baseInfo.getUserBaseInfo();
		this.homeMap = this.homeInfo.getUserHomeInfo();
		this.officeMap = this.officeInfo.getUserOfficeInfo();
	}
	
	 //��ͥ��ַ
	public String getHomeAddress() {
		String homeAddress = (String)this.homeMap.get("homeAddress");
		System.out.println(homeAddress);
		return homeAddress;
	}

	 //��ͥ�绰����
	public String getHomeTelNumber() {
		String homeTelNumber = (String)this.homeMap.get("homeTelNumber");
		System.out.println(homeTelNumber);
		return homeTelNumber;
	}

	 //ְλ��Ϣ
	public String getJobPosition() {
		String jobPosition = (String)this.officeMap.get("jobPosition");
		System.out.println(jobPosition);
		return jobPosition;
	}

	 //�ֻ�����
	public String getMobileNumber() {
		String mobileNumber = (String)this.baseMap.get("mobileNumber");
		System.out.println(mobileNumber);
		return mobileNumber;
	}

	 //�칫�绰
	public String getOfficeTelNumber() {
		String officeTelNumber = (String)this.officeMap.get("officeTelNumber");
		System.out.println(officeTelNumber);
		return officeTelNumber;
	}
	
	// Ա��������
	public String getUserName() {
		String userName = (String)this.baseMap.get("userName");
		System.out.println(userName);
		return userName;
	}

}
