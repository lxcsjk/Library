package com.company.section3;


/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 */
public abstract class Handler {
	private Handler nextHandler;
	
	//ÿ�������߶������������������
	public final Response handlerMessage(Request request){
		Response response = null;
		
		//�ж��Ƿ����Լ��Ĵ�����
		if(this.getHandlerLevel().equals(request.getRequestLevel())){
			response = this.echo(request);
		}else{  //�������Լ��Ĵ�����
			//�ж��Ƿ�����һ��������
			if(this.nextHandler != null){
				response = this.nextHandler.handlerMessage(request);
			}else{
				//û���ʵ��Ĵ����ߣ�ҵ�����д���
			}
		}
		return response;
	}
	
	
	//������һ����������˭
	public void setNext(Handler _handler){
		this.nextHandler = _handler;
	}
	
	//ÿ�������߶���һ��������
	protected abstract Level getHandlerLevel();
	
	//ÿ�������߶�����ʵ�ִ�������
	protected abstract Response echo(Request request);
	
}
