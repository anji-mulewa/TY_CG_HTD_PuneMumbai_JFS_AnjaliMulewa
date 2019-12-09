package com.capgemini.assessment.dao;

import java.util.ArrayList;

import com.capgemini.assessment.beans.AccountBeans;
import com.capgemini.assessment.beans.InboxBeans;

public interface GmailDAO {
	public boolean login(String email, String password);
	public void compose(int email,String message);
	public boolean create(int userid, String username,String password,String email);
	public ArrayList<InboxBeans> show(int userid);
	public int getUserId(String email);
}
