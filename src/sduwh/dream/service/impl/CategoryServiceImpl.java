package sduwh.dream.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import sduwh.dream.pojo.Category;
import sduwh.dream.pojo.ContactInfo;
import sduwh.dream.service.CategoryService;
import sduwh.dream.util.DaoFactory;
import sduwh.dream.util.JDBCTools;

public class CategoryServiceImpl implements CategoryService {

	@Override
	public Category getCategory(float categoryid) {
		return DaoFactory.getCategory().getCategory(categoryid);
	}

}
