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
import sduwh.dream.util.JDBCTools;

public class ProductServiceImpl implements ProductService {

	@Override
	public List getProductList() {
		List productList = new ArrayList();
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;

		try {

			conn = JDBCTools.getConnection();
			statement = conn.createStatement();

			String sql = "SELECT *"+"FROM product";
			System.out.println(sql);
			rs = statement.executeQuery(sql);

			while (rs.next()) {
				Product product =new Product();
				
				product.setAuthor(rs.getString("author"));
				product.setBasePrice(rs.getFloat("baseprice"));
				product.setCategoryId(rs.getInt("categoryid"));
				product.setDescription(rs.getString("description"));
				product.setImage(rs.getString("images"));
				product.setName(rs.getString("name"));
				product.setPages(rs.getInt("pages"));
				product.setProductId(rs.getInt("productid"));
				product.setPublish(rs.getString("publish"));
				
				productList.add(product);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			JDBCTools.releaseDB(rs, statement, conn);
		}

		return productList;
	}
}
