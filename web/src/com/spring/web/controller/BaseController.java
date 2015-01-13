package com.spring.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.spring.utils.exception.BusinessException;
import com.spring.utils.exception.ParameterException;

public class BaseController {
	
	/** 基于@ExceptionHandler异常处理 */  
	@ExceptionHandler
	public String ex(HttpServletRequest request, Exception ex) {
		request.setAttribute("ex", ex);
		if (ex instanceof BusinessException) {
			return "error-business";
		} else if (ex instanceof ParameterException) {
			return "error-parameter";
		} else {
			return "error";
		}
	}
}
