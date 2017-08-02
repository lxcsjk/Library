package com.company.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ÿ��DNS����������ʹ�۲���Ҳ�Ǳ��۲���
 */
public abstract class DnsServer extends Observable implements Observer {

	//��������Ҳ���ǽ��յ��¼���Ĵ���
	public void update(Observable arg0, Object arg1) {
		Recorder recorder = (Recorder)arg1;
		//��������ܽ���
		if(isLocal(recorder)){
			recorder.setIp(genIpAddress());
		}else{//�������ܽ��������ύ���ϼ�DNS
			responsFromUpperServer(recorder);
		}
		//ǩ��
		sign(recorder);
	}

	//��Ϊ���۲��ߣ��������ӹ۲���,DNS�������ϼ�DNSһ����һ��
	public void setUpperServer(DnsServer dnsServer){
		//����գ�Ȼ��������
		super.deleteObservers();
		super.addObserver(dnsServer);
	}
	
	//��DNS���������Ҳ����֪ͨ�۲���
	private void responsFromUpperServer(Recorder recorder){
		super.setChanged();
		super.notifyObservers(recorder);
	}
	
	//ÿ��DNS������ǩ���Լ�������
	protected abstract void sign(Recorder recorder);
	

	
	//ÿ��DNS�����������붨���Լ��Ĵ�����
	protected abstract boolean isLocal(Recorder recorder);
	
	//�������һ��IP��ַ��������
	private String genIpAddress(){
		Random rand = new Random();
		String address = rand.nextInt(255) + "." + rand.nextInt(255) + "."+ rand.nextInt(255) + "."+ rand.nextInt(255);
		
		return address;
	}
}
