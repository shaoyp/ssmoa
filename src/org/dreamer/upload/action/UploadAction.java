package org.dreamer.upload.action;

import java.io.File;

public class UploadAction {
	private String statusCode = "";
	private String message = "";
	private String navTabId = "";
	private String rel = "";
	private String callbackType = "";
	private String forwardUrl = "";
	private String confirmMsg = "";
	
	private File image;
	
	public String show(){
		System.out.println("----------------upload  show action------");
		return "show";
	}
	public String upload(){
		System.out.println("----------------upload  upload action------");
		statusCode = "200";
		message = "我上传一个文件";
		return "upload";
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getNavTabId() {
		return navTabId;
	}
	public void setNavTabId(String navTabId) {
		this.navTabId = navTabId;
	}
	public String getRel() {
		return rel;
	}
	public void setRel(String rel) {
		this.rel = rel;
	}
	public String getCallbackType() {
		return callbackType;
	}
	public void setCallbackType(String callbackType) {
		this.callbackType = callbackType;
	}
	public String getForwardUrl() {
		return forwardUrl;
	}
	public void setForwardUrl(String forwardUrl) {
		this.forwardUrl = forwardUrl;
	}
	public String getConfirmMsg() {
		return confirmMsg;
	}
	public void setConfirmMsg(String confirmMsg) {
		this.confirmMsg = confirmMsg;
	}
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}

}
