package cn.uc.yqb.utils;

import java.io.Serializable;

public class Result implements Serializable {

	private int retCode;
	private String retMsg;
	private Object retData;
	public int getRetCode() {
		return retCode;
	}
	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}
	public String getRetMsg() {
		return retMsg;
	}
	public void setRetMsg(String retMsg) {
		this.retMsg = retMsg;
	}
	public Object getRetData() {
		return retData;
	}
	public void setRetData(Object retData) {
		this.retData = retData;
	}
	
	
	
}
