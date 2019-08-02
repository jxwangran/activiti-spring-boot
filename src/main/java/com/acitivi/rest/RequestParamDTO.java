/**   
 * Copyright © 2017 北京易酒批电子商务有限公司. All rights reserved.
 */
package com.acitivi.rest;

import org.springframework.http.HttpMethod;

/** 
* @ClassName: RequestParamDTO 
* @Description: 
* @author wangran
* @date Jul 24, 2019 10:15:43 AM 
*/
public class RequestParamDTO<T> {

	private String url;
	
	private HttpMethod method;
	
	private HeaderParams headerParams;
	
	private String body;
	
	private Class<T> responseT;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public HttpMethod getMethod() {
		return method;
	}

	public void setMethod(HttpMethod method) {
		this.method = method;
	}

	public HeaderParams getHeaderParams() {
		return headerParams;
	}

	public void setHeaderParams(HeaderParams headerParams) {
		this.headerParams = headerParams;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Class<T> getResponseT() {
		return responseT;
	}

	public void setResponseT(Class<T> responseT) {
		this.responseT = responseT;
	}
	
}
