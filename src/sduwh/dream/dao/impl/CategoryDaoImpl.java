package sduwh.dream.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import sduwh.dream.dao.CategoryDao;
import sduwh.dream.pojo.Category;
import sduwh.dream.util.JDBCTools;


public class CategoryDaoImpl implements CategoryDao {

	@Override
	public Category getCategory(float categoryid) {
		Category category=new Category();
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		
		try {
			
			conn = JDBCTools.getConnection();		
			statement = conn.createStatement();
			
			String sql = "SELECT * " +
					"FROM category where categoryid = "+categoryid;
			System.out.println(sql);	
			rs = statement.executeQuery(sql);
		
			
			while(rs.next()){
				category.setCategoryid(rs.getInt("categoryid"));
				category.setDescription(rs.getString("description"));
				category.setName(rs.getString("name"));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			 
			JDBCTools.releaseDB(rs, statement, conn);
		}
		return category;
	}

}
