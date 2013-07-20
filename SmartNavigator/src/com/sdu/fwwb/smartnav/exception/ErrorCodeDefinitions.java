package com.sdu.fwwb.smartnav.exception;

import java.util.HashMap;
import java.util.Map;

public class ErrorCodeDefinitions {

	public static int CODE_INVALID_INPUT = 11;
	
	public static Map<Integer,String> messageMap = new HashMap<Integer, String>();
	
	static{
		messageMap.put(CODE_INVALID_INPUT, "输入的内容无效");
	}
}
