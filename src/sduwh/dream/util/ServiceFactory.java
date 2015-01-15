package sduwh.dream.util;

import sduwh.dream.service.CategoryService;
import sduwh.dream.service.ContactInfoService;
import sduwh.dream.service.OrderLineService;
import sduwh.dream.service.OrderService;
import sduwh.dream.service.OrderStatusService;
import sduwh.dream.service.PayWayService;
import sduwh.dream.service.ProductService;
import sduwh.dream.service.UserService;
import sduwh.dream.service.impl.CategoryServiceImpl;
import sduwh.dream.service.impl.ContactInfoServiceImpl;
import sduwh.dream.service.impl.OrderLineServiceImpl;
import sduwh.dream.service.impl.OrderServiceImpl;
import sduwh.dream.service.impl.OrderStatusServiceImpl;
import sduwh.dream.service.impl.PayWayServiceImpl;
import sduwh.dream.service.impl.ProductServiceImpl;
import sduwh.dream.service.impl.UserServiceimpl;

public  class ServiceFactory {
	
	public static UserService getUserService(){
		UserService userService=new UserServiceimpl();
		return userService;		
	}
	
	public static ContactInfoService getContactInfoService(){
		ContactInfoService contactInfoService=new ContactInfoServiceImpl();
		return contactInfoService;		
	}
	
	public static ProductService getProductService(){
		ProductService productService=new ProductServiceImpl();
		return productService;		
	}
	
	public static CategoryService getCategoryService(){
		CategoryService categoryService=new CategoryServiceImpl();
		return categoryService;		
	}
	
	public static OrderService getOrderService(){
		OrderService os=new OrderServiceImpl();
		return os;		
	}
	
	public static OrderLineService getOrderLineService(){
		OrderLineService ols=new OrderLineServiceImpl();
		return ols;
	}
	
	public static OrderStatusService getOrderStatusService(){
		OrderStatusService oss=new OrderStatusServiceImpl();
		return oss;
	}
	public static PayWayService getPayWayService (){
		PayWayService pws=new PayWayServiceImpl();
		return pws;
	}
	
}
