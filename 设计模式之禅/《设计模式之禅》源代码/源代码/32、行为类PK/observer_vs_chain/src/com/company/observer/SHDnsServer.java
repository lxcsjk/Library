package com.company.observer;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class SHDnsServer extends DnsServer {

	@Override
	protected void sign(Recorder recorder) {		
		recorder.setOwner("�Ϻ�DNS������");
	}

	//�����Ϻ���DNS�������ܴ���ļ���
	@Override
	protected boolean isLocal(Recorder recorder) {
		return recorder.getDomain().endsWith(".sh.cn");
	}

}
