package sduwh.dream.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
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

//import cn.com.tarena.service.StudentService;
//import cn.com.tarena.service.impl.StudentServiceImpl;



public class ControllerServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String path = req.getServletPath();
		String path2,path1;
		path1 = path.substring(0,path.indexOf("."));
		//path2=path.substring(0,path.indexOf("?"));
		if("/orderL".equals(path1)){
			try{
				OrderService orderService = new ServiceFactory().getOrderService();
				
				List orderList = orderService.getOrderList();
				
				req.setAttribute("orderList", orderList);
				
				getServletContext().getRequestDispatcher("/orderL").forward(req, resp);
				
			} catch (Exception e){
				req.setAttribute("message", e.getMessage());
				
				getServletContext().getRequestDispatcher("/error").forward(req, resp);
			}			
		} 
		else if("/orderD".equals(path1)){
			try{
				//StudentService studentService = new StudentServiceImpl();
				
				//List studentList = studentService.getStudentList();
				
				//req.setAttribute("studentList", studentList);
				
				getServletContext().getRequestDispatcher("/orderD").forward(req, resp);
				
			} catch (Exception e){
				req.setAttribute("message", e.getMessage());
				
				getServletContext().getRequestDispatcher("/error").forward(req, resp);
			}			
		}
		else if("/orderC".equals(path1)){
			try{
				//StudentService studentService = new StudentServiceImpl();
				
				//List studentList = studentService.getStudentList();
				
				//req.setAttribute("studentList", studentList);
				
				getServletContext().getRequestDispatcher("/orderC").forward(req, resp);
				
			} catch (Exception e){
				req.setAttribute("message", e.getMessage());
				
				getServletContext().getRequestDispatcher("/error").forward(req, resp);
			}			
		}
		else if("/productD".equals(path1)){
			try{
				//StudentService studentService = new StudentServiceImpl();
				
				//List studentList = studentService.getStudentList();
				
				//req.setAttribute("studentList", studentList);
				String id = req.getParameter("id");
				ProductService productService = new ServiceFactory().getProductService();
				List<Product> list = productService.getProductList();
				Product product = list.get(Integer.parseInt(id)-1);
				CategoryService categoryService = new ServiceFactory().getCategoryService();
				int CategoryId = product.getCategoryId();
				sduwh.dream.pojo.Category category = categoryService.getCategory(CategoryId);
				req.setAttribute("product", product);
				req.setAttribute("category", category);
				getServletContext().getRequestDispatcher("/productD").forward(req, resp);
				
			} catch (Exception e){
				req.setAttribute("message", e.getMessage());
				
				getServletContext().getRequestDispatcher("/error").forward(req, resp);
			}			
		}
		else if("/productL".equals(path1)){
			try{
				ProductService productService = new ServiceFactory().getProductService();
				List<Product> list = productService.getProductList();
				
				System.out.print("大小："+list.size());
				
				req.setAttribute("productList", list);
				
				getServletContext().getRequestDispatcher("/productL").forward(req, resp);
				
			} catch (Exception e){
				req.setAttribute("message", e.getMessage());
				
				getServletContext().getRequestDispatcher("/error").forward(req, resp);
			}			
		}
		else if("/shoppingC".equals(path1)){
			try{
				//StudentService studentService = new StudentServiceImpl();
				
				//List studentList = studentService.getStudentList();
				
				//req.setAttribute("studentList", studentList);
				
				getServletContext().getRequestDispatcher("/shoppingC").forward(req, resp);
				
			} catch (Exception e){
				req.setAttribute("message", e.getMessage());
				
				getServletContext().getRequestDispatcher("/error").forward(req, resp);
			}			
		}
		else if("/userLoginS".equals(path1)){
			try{
				//StudentService studentService = new StudentServiceImpl();
				
				//List studentList = studentService.getStudentList();
				
				//req.setAttribute("studentList", studentList);
				
				getServletContext().getRequestDispatcher("/userLoginS").forward(req, resp);
				
			} catch (Exception e){
				req.setAttribute("message", e.getMessage());
				
				getServletContext().getRequestDispatcher("/error").forward(req, resp);
			}			
		}
		else if("/userManageS".equals(path1)){
			try{
				UserService userService = new ServiceFactory().getUserService();
				
				List userList = userService.getUserList();
				
				req.setAttribute("userList", userList);
				
				getServletContext().getRequestDispatcher("/userManageS").forward(req, resp);
				
			} catch (Exception e){
				req.setAttribute("message", e.getMessage());
				
				getServletContext().getRequestDispatcher("/error").forward(req, resp);
			}			
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
				getServletContext().getRequestDispatcher("/userModifyS").forward(req, resp);
				
			} catch (Exception e){
				req.setAttribute("message", e.getMessage());
				
				getServletContext().getRequestDispatcher("/error").forward(req, resp);
			}			
		}
		else if("/userRegisterS".equals(path1)){
			try{
				//StudentService studentService = new StudentServiceImpl();
				
				//List studentList = studentService.getStudentList();
				
				//req.setAttribute("studentList", studentList);
				
				getServletContext().getRequestDispatcher("/userRegisterS").forward(req, resp);
				
			} catch (Exception e){
				req.setAttribute("message", e.getMessage());
				
				getServletContext().getRequestDispatcher("/error").forward(req, resp);
			}			
		}
		
		
		else {
			resp.sendError(resp.SC_NOT_FOUND);
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req,resp);
	}
}