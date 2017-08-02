package com.company.observer;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class TopDnsServer extends DnsServer {


	@Override
	protected void sign(Recorder recorder) {
		recorder.setOwner("ȫ�򶥼�DNS������");
	}

	
	@Override
	protected boolean isLocal(Recorder recorder) {
		//���е��������յĽ����ص�
		return true;
	}

}
