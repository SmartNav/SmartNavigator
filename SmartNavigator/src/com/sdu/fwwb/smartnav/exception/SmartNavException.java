package com.sdu.fwwb.smartnav.exception;

public class SmartNavException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3385400787809943037L;

	private SmartNavError error;
	
	public SmartNavException(SmartNavError error){
		this.error = error;
	}
	
	@Override
	public String getLocalizedMessage() {
		return super.getLocalizedMessage();
	}

	@Override
	public String getMessage() {
		return error.getMessage();
	}

}
