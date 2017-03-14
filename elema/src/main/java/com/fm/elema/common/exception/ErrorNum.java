package com.fm.elema.common.exception;

public enum ErrorNum {
	
	LOGIN_MOBILE_ERROR(1001,"账号输入有误"),
	LOGIN_PASSWORD_ERROR(1002,"密码输入有误");

	public int index;
	
	public String name;

	private ErrorNum(int index, String name) {
		this.index = index;
		this.name = name;
	}
	
	
	
}
