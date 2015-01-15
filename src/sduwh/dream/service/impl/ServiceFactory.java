package sduwh.dream.service.impl;

import sduwh.dream.service.CategoryService;
import sduwh.dream.service.ContactInfoService;
import sduwh.dream.service.OrderLineService;
import sduwh.dream.service.OrderService;
import sduwh.dream.service.OrderStatusService;
import sduwh.dream.service.PayWayService;
import sduwh.dream.service.ProductService;
import sduwh.dream.service.UserService;

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
