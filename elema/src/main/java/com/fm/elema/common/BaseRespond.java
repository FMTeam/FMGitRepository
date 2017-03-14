package com.fm.elema.common;

import java.io.Serializable;

public class BaseRespond<T> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int result;// 0 - 表示请求成功；非0 - 表示出现错误或异常；
    private String message = "";
    private T data;


    /**
     * 设置响应的错误信息
     * 
     * @param result 错误信息代码
     * @param errMsg 错误信息提示
     */
    public void setError(int result, String errMsg) {
        this.result = result;
        this.message = errMsg;
    }


    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
