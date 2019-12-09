package com.capgemini.assessment.factroy;

import com.capgemini.assessment.dao.GmailDAO;
import com.capgemini.assessment.dao.GmailDAOImpl;

public class GmailFactory {
private GmailFactory() {
	
}
public static GmailDAO getInstance() {
	GmailDAO dao = new GmailDAOImpl();
	return dao;
}
}