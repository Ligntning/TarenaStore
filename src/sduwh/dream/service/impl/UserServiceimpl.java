package sduwh.dream.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sduwh.dream.pojo.User;
import sduwh.dream.service.UserService;
import sduwh.dream.util.DaoFactory;
import sduwh.dream.util.JDBCTools;

public class UserServiceimpl implements UserService {

	@Override
	public List getUserList() {
		return DaoFactory.getUserDao().getUserList();
	}
	
	public User getUserByID(String userid) {
		return DaoFactory.getUserDao().getUserByID(userid);
	}

}
