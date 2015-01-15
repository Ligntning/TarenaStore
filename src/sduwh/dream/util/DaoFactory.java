package sduwh.dream.util;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import sduwh.dream.dao.CategoryDao;
import sduwh.dream.dao.ContactInfoDao;
import sduwh.dream.dao.OrderDao;
import sduwh.dream.dao.OrderLineDao;
import sduwh.dream.dao.OrderStatusDao;
import sduwh.dream.dao.PayWayDao;
import sduwh.dream.dao.ProductDao;
import sduwh.dream.dao.UserDao;
import sduwh.dream.dao.impl.CategoryDaoImpl;
import sduwh.dream.dao.impl.ContactInfoDaoImpl;
import sduwh.dream.dao.impl.OrderDaoImpl;
import sduwh.dream.dao.impl.OrderLineDaoImpl;
import sduwh.dream.dao.impl.OrderStatusDaoImpl;
import sduwh.dream.dao.impl.PayWayDaoImpl;
import sduwh.dream.dao.impl.ProductDaoImpl;
import sduwh.dream.dao.impl.UserDaoImpl;


public class DaoFactory {
	private static CategoryDao categoryDao=new CategoryDaoImpl();
	private static ContactInfoDao contactInfoDao=new ContactInfoDaoImpl();
	private static OrderDao orderDao=new OrderDaoImpl();
	private static OrderLineDao orderLineDao=new OrderLineDaoImpl();
	private static OrderStatusDao orderStatusDao=new OrderStatusDaoImpl();
	private static PayWayDao  payWayDao=new PayWayDaoImpl();
	private static ProductDao productDao=new ProductDaoImpl();
	private static UserDao userDao=new UserDaoImpl();
	
	public static CategoryDao getCategory(){
		return categoryDao;		
	}
	
	public static ContactInfoDao getContactInfoDao(){
		return contactInfoDao;
	}
	
	public static OrderDao getOrderDao(){
		return orderDao;
	}
	
	public static OrderLineDao getOrderLineDao(){
		return orderLineDao;
	}
	
	public static OrderStatusDao getOrderStatusDao(){
		return orderStatusDao;
	}
	
	public static PayWayDao getPayWayDao(){
		return payWayDao;
	}
	
	public static ProductDao getProductDao(){
		return productDao;
	}
	
	public static UserDao getUserDao(){
		return userDao;
	}
	
	
}
