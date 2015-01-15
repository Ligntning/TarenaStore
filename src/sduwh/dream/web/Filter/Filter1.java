package sduwh.dream.web.Filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sduwh.dream.pojo.ContactInfo;
import sduwh.dream.pojo.Product;
import sduwh.dream.pojo.User;
import sduwh.dream.service.CategoryService;
import sduwh.dream.service.ContactInfoService;
import sduwh.dream.service.OrderService;
import sduwh.dream.service.ProductService;
import sduwh.dream.service.UserService;
import sduwh.dream.util.ServiceFactory;
//import sduwh.dream.service.impl.ServiceFactory;

public class Filter1 implements Filter {
	private FilterConfig config;
	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config = config;

	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		String path = ((HttpServletRequest)req).getServletPath();
		String path1 = path.substring(0,path.indexOf("."));
		String suffix = path1;
		System.out.println(suffix);
		if ("/userLoginS".equals(path1)||"/orderD".equals(path1)||"/orderC".equals(path1)||"/shoppingC".equals(path1)||"/userRegisterS".equals(path1)) {//加session
			System.out.println("222");
			((HttpServletResponse) resp).sendRedirect(config
					.getServletContext().getContextPath()
					+ path1);
		}
		else if ("/productL".equals(path1)) {
			ProductService productService = new ServiceFactory().getProductService();
			List<Product> list = productService.getProductList();
			
			//System.out.print("大小："+list.size());
			
			req.setAttribute("productList", list);
			req.getRequestDispatcher(path1).forward(req, resp);;
			
		}
		else if ("/orderL".equals(path1)){
			OrderService orderService = new ServiceFactory().getOrderService();
			
			List orderList = orderService.getOrderList();
			System.out.println();
			
			req.setAttribute("orderList", orderList);
			req.getRequestDispatcher(path1).forward(req, resp);;
			
		} 
		else if("/userModifyS".equals(path1)){
			try{
				
				String userid = req.getParameter("id");
				ContactInfoService contactInfoService = new ServiceFactory().getContactInfoService();
				
				ContactInfo contactInfo = contactInfoService.getContactInfo(userid);
				UserService userService = new ServiceFactory().getUserService();
				User user = userService.getUserByID(userid);
				
				req.setAttribute("contactInfo", contactInfo);
				req.setAttribute("user", user);
				req.getRequestDispatcher("/userModifyS").forward(req, resp);
				
			} catch (Exception e){
				req.setAttribute("message", e.getMessage());
				
				req.getRequestDispatcher("/error").forward(req, resp);
			}			
		}
		else if("/userManageS".equals(path1)){
			try{
				UserService userService = new ServiceFactory().getUserService();
				
				List userList = userService.getUserList();
				
				req.setAttribute("userList", userList);
				
				req.getRequestDispatcher("/userManageS").forward(req, resp);
				
			} catch (Exception e){
				req.setAttribute("message", e.getMessage());
				
				req.getRequestDispatcher("/error").forward(req, resp);
			}			
		}
		else if("/productD".equals(path1)){
			try{
			
				String id = req.getParameter("id");
				ProductService productService = new ServiceFactory().getProductService();
				List<Product> list = productService.getProductList();
				Product product = list.get(Integer.parseInt(id)-1);
				CategoryService categoryService = new ServiceFactory().getCategoryService();
				int CategoryId = product.getCategoryId();
				sduwh.dream.pojo.Category category = categoryService.getCategory(CategoryId);
				req.setAttribute("product", product);
				req.setAttribute("category", category);
				req.getRequestDispatcher("/productD").forward(req, resp);
				
			} catch (Exception e){
				req.setAttribute("message", e.getMessage());
				
				req.getRequestDispatcher("/error").forward(req, resp);
			}			
		}
		
		return;

//	

}}
