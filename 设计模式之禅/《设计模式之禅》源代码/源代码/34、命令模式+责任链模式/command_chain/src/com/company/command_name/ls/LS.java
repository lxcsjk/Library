package com.company.command_name.ls;

import com.company.CommandVO;
import com.company.command_name.os.FileManager;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * ���������治������
 */
public class LS extends AbstractLS {

	//��򵥵�ls����
	protected String echo(CommandVO vo) {
		return FileManager.ls(vo.formatData());
	}

	//����Ϊ��
	protected String getOperateParam() {
		return super.DEFAULT_PARAM;
	}

}
