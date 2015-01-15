package sduwh.dream.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.Out;

import sduwh.dream.pojo.Product;
import sduwh.dream.pojo.User;
import sduwh.dream.service.ProductService;
import sduwh.dream.util.DaoFactory;
import sduwh.dream.util.JDBCTools;

public class ProductServiceImpl implements ProductService {

	@Override
	public List getProductList() {
		return DaoFactory.getProductDao().getProductList();
	}
}
