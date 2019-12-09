package com.capgemini.assessment.beans;

public class InboxBeans {
private int messageid;
private int userid;
private String message;
public int getMessageid() {
	return messageid;
}
public void setMessageid(int messageid) {
	this.messageid = messageid;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
@Override
public String toString() {
	return "messageid=" + messageid + ", userid=" + userid + ", message=" + message;
}

}
