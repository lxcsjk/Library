package com.company.chain;

import java.util.Random;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class DnsServer {
	//�ϼ�DNS��˭
	private DnsServer upperServer;
	//��������
	public final Recorder resolve(String domain){
		Recorder recorder=null;
		if(isLocal(domain)){//�Ǳ����ܽ���������
			recorder = echo(domain);
		}else{//�������ܽ���
			//�ύ�ϼ�DNS���н���
			recorder = upperServer.resolve(domain);
		}
		return recorder;
	}
	
	//ָ���ϼ�DNS
	public void setUpperServer(DnsServer _upperServer){
		this.upperServer = _upperServer;
	}
	
	//ÿ��DNS����һ��DNS�����ݴ�������ZONE��,��������Ƿ��ڱ�zone��
	protected abstract boolean isLocal(String domain);
	
	//ÿ��DNS������������ʵ�ֽ�������
	protected Recorder echo(String domain){
		Recorder recorder = new Recorder();
		//���IP��ַ
		recorder.setIp(genIpAddress());
		recorder.setDomain(domain);
		
		return recorder;
	}
	
	//�������һ��IP��ַ��������
	protected String genIpAddress(){
		Random rand = new Random();
		String address = rand.nextInt(255) + "." + rand.nextInt(255) + "."+ rand.nextInt(255) + "."+ rand.nextInt(255);
		
		return address;
	}
}
