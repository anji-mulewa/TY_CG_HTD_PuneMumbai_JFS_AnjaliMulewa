package com.capgemini.jdbc.dao;



import java.util.List;

import com.capgemini.jdbc.beans.UserBean;

public interface UserDAO {
    public List<UserBean> getAllInfo();
	
	public UserBean getInfo(int userid);
	public UserBean login(int userid , String password);
	public boolean deleteInfo(int userid , String password) ;
	public boolean insertInfo(int userid, String username,String emailid , String password );
}
