package sduwh.dream.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import sduwh.dream.pojo.ContactInfo;
import sduwh.dream.pojo.User;
import sduwh.dream.service.ContactInfoService;
import sduwh.dream.util.DaoFactory;
import sduwh.dream.util.JDBCTools;

public class ContactInfoServiceImpl implements ContactInfoService {

	@Override
	public ContactInfo getContactInfo(String userid) {
		return DaoFactory.getContactInfoDao().getContactInfo(userid);
	}

}
