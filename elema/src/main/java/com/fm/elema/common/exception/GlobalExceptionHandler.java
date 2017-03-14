package com.fm.elema.common.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fm.elema.common.BaseRespond;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	private static final Log LOG = LogFactory.getLog(GlobalExceptionHandler.class);
	
	@ExceptionHandler
	@ResponseBody
	private BaseRespond<String> handle(BusinessException exception){
		BaseRespond<String> br = new BaseRespond<String>();
		LOG.error(exception);
		br.setError(exception.getErrNum(), exception.getMessage());
		return br;
		
	}
	
	

}
