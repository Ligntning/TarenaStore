package sduwh.dream.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import sduwh.dream.pojo.Category;
import sduwh.dream.pojo.ContactInfo;
import sduwh.dream.pojo.Order;
import sduwh.dream.pojo.OrderLine;
import sduwh.dream.pojo.OrderStatus;
import sduwh.dream.pojo.PayWay;
import sduwh.dream.pojo.Product;
import sduwh.dream.pojo.User;
import sduwh.dream.service.CategoryService;
import sduwh.dream.service.ContactInfoService;
import sduwh.dream.service.OrderLineService;
import sduwh.dream.service.OrderService;
import sduwh.dream.service.OrderStatusService;
import sduwh.dream.service.PayWayService;
import sduwh.dream.service.impl.ContactInfoServiceImpl;
import sduwh.dream.service.impl.OrderServiceImpl;
import sduwh.dream.util.JDBCTools;
import sduwh.dream.util.ServiceFactory;

public class JDBCTest {

	@Test
	public void testConnection() throws IOException {

		ContactInfoService contactInfoService = new ContactInfoServiceImpl();
		ContactInfo contactInfo = contactInfoService.getContactInfo("admin");
		System.out.println(contactInfo.toString());
	}

	@Test
	public void testProduct() throws IOException {
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;

		try {

			conn = JDBCTools.getConnection();
			statement = conn.createStatement();

			String sql = "SELECT *" + "FROM product";
			System.out.println(sql);
			rs = statement.executeQuery(sql);

			while (rs.next()) {
				Product product = new Product();

				product.setAuthor(rs.getString("author"));
				product.setBasePrice(rs.getFloat("baseprice"));
				product.setCategoryId(rs.getInt("categoryid"));
				product.setDescription(rs.getString("description"));
				// product.setImage(rs.get)
				product.setName(rs.getString("name"));
				product.setPages(rs.getInt("pages"));
				product.setProductId(rs.getInt("productid"));
				product.setPublish(rs.getString("publish"));

				System.out.println(product.toString());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			JDBCTools.releaseDB(rs, statement, conn);
		}

	}

	@Test
	public void testCategory() throws IOException{
		CategoryService cs=ServiceFactory.getCategoryService();
		Category category=cs.getCategory(2);
		System.out.println(category);
	}
	
	@Test
	public void testOrderList() throws IOException{
		OrderService orderService =ServiceFactory.getOrderService();
		List orderList=orderService.getOrderList();
		for(Iterator<Order> it = orderList.iterator();it.hasNext();){
			Order order=it.next();
			System.out.println(order);
			
		}
	}

	@Test
	public void testOrderLineList() throws IOException{
		OrderLineService ols=ServiceFactory.getOrderLineService();
		List orderLineList=ols.getOrderLine(9);
		for(Iterator<OrderLine> it=orderLineList.iterator();it.hasNext();){
			OrderLine ol=it.next();
			System.out.println(ol.toString());
		}
	}


	@Test
	public void testOrderStatus() throws IOException{
		OrderStatusService oss=ServiceFactory.getOrderStatusService();
		OrderStatus os=oss.getOrderStaus(2);
		System.out.println(os.toString());
			
	}

	@Test
	public void testPayWay() throws IOException{
		PayWayService pws=ServiceFactory.getPayWayService();
		PayWay pw=pws.getPayWay(2);
		System.out.println(pw.toString());
	}

}
