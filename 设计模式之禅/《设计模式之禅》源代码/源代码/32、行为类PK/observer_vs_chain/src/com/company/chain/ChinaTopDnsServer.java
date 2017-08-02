package com.company.chain;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public class ChinaTopDnsServer extends DnsServer {

	@Override
	protected Recorder echo(String domain) {
		Recorder recorder = super.echo(domain);
		recorder.setOwner("�й�����DNS������");
		return recorder;
	}

	
	@Override
	protected boolean isLocal(String domain) {
		return domain.endsWith(".cn");
	}

}
