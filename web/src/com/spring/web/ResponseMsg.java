/**
 *  ResponseMsg.java
 */
package com.spring.web;

import java.io.Serializable;

/**
 * 向页面输出json封装实体
 */
public class ResponseMsg implements Serializable {
	private static final long serialVersionUID = -8812080704817413744L;
	
	/**
	 * 出错信息 
	 */
	private String error;
	
	/**
	 * 向前端输出消息
	 */
	private String msg;
	
	/**
	 * 是否成功
	 */
	private Boolean isSucc = true;
	
	/**
	 * 输出数据
	 */
	private Object datas;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getIsSucc() {
		return isSucc;
	}

	public void setIsSucc(Boolean isSucc) {
		this.isSucc = isSucc;
	}

	public Object getDatas() {
		return datas;
	}

	public void setDatas(Object datas) {
		this.datas = datas;
	}
}
