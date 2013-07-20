package com.sdu.fwwb.smartnav.exception;

public class SmartNavError {

	private int code;
	private String message;
	
	public SmartNavError(int code) {
		this.code = code;
		this.message = ErrorCodeDefinitions.messageMap.get(code);
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "SmartNavError [code=" + code + ", message=" + message + "]";
	}
	
}
