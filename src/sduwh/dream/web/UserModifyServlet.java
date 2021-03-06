package sduwh.dream.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sduwh.dream.pojo.ContactInfo;
import sduwh.dream.pojo.User;

public class UserModifyServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UserModifyServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8"); 
		PrintWriter out = response.getWriter();
		ContactInfo contactInfo = (ContactInfo) request.getAttribute("contactInfo");
		User user = (User) request.getAttribute("user");
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<html>");
		out.println("	<head>");
		out.println("		<title>达内电子商务门户</title>");
		out.println("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
		out.println("		<meta name=\"description\" content=\"达内电子商务门户\">");
		out.println("		<link href=\"css/tarena.css\" rel=stylesheet>");
		out.println("	</head>");
		out.println("	<body topmargin=\"0\" leftmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\">");
		out.println("");
		out.println("<!-- Header Start -->");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" id=\"table2\">");
		out.println("			<tr>");
		out.println("				<td align=\"left\" width=\"7%\" background=\"images/top_bg.gif\"><img src=\"images/logo.gif\" width=\"286\" height=\"58\"></td>");
		out.println("				<td width=\"62%\" background=\"images/top_bg.gif\">　</td>");
		out.println("				<td width=\"31%\" background=\"images/top_bg.gif\" align=\"right\"><img src=\"images/top_r.gif\" width=\"352\" height=\"58\" border=\"0\"></td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
		out.println("");
		out.println("			<tr>");
		out.println("				<td background=\"images/dh_bg.gif\" align=\"left\" height=\"12\">");
		out.println("					<table width=\"100\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.println("						<tr>");
		out.println("							<td width=\"5%\"></td>");
		out.println("							");
		out.println("							");
        out.println("          <td width=\"10%\"><a href=\"/TarenaStore/productL.func\"><img name=\"Image1\" border=\"0\" src=\"images/index.gif\" width=\"90\" height=\"36\"></a></td>");
        out.println("							");
        out.println("          <td width=\"10%\"><a href=\"/TarenaStore/userManageS.func\"><img name=\"Image2\" border=\"0\" src=\"images/reg.gif\" width=\"92\" height=\"36\"></a></td>");
        out.println("							");
        out.println("          <td width=\"10%\"><a href=\"/TarenaStore/shoppingC.func\"><img name=\"Image4\" border=\"0\" src=\"images/cart.gif\" width=\"92\" height=\"36\"></a></td>");
        out.println("							");
        out.println("          <td width=\"10%\"><a href=\"/TarenaStore/orderL.func\"><img name=\"Image5\" border=\"0\" src=\"images/order.gif\" width=\"92\" height=\"36\"></a></td>");
        out.println("							");
        out.println("          <td width=\"10%\"><a href=\"/TarenaStore/productL.func\"><img name=\"Image6\" border=\"0\" src=\"images/exit.gif\" width=\"92\" height=\"36\"></a></td>");
		out.println("						</tr>");
		out.println("					</table>");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" border=\"0\" width=\"98%\">");
		out.println("			<tr>");
		out.println("				<td width=\"65%\"><br>");
		out.println("");
		out.println("					>> 欢迎访问 <b>达内电子商务门户</b>");
		out.println("				</td>");
		out.println("				<td width=\"35%\" align=\"right\">");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("</html>");
		out.println("<!-- Header End -->");
		out.println("<!-- Body Start -->");
		out.println("<form method=\"post\" name=\"reg\"  action=\"/ecport/user/modify.do\">");
		out.println("	<input type=\"hidden\" name=\"userid\" value=\"admin\"/>");
		out.println("");
		out.println("	<input type=\"hidden\" name=\"contactid\" value=\"1\"/>");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableBorder2\">");
		out.println("");
		out.println("			<tr>");
		out.println("				<td height=\"25\" valign=\"middle\">");
		out.println("					<img src=\"images/Forum_nav.gif\" align=\"absmiddle\">");
		out.println("					<a href=../../index.jsp>达内电子商务门户</a> →用户信息修改");
		out.println("				</td>");
		out.println("			</tr>");
		out.println("		</table>");
		out.println("		<br>");
		out.println("		<table cellspacing=\"1\" cellpadding=\"3\" align=\"center\" class=\"tableBorder1\">");
		out.println("			<tr>");
		out.println("				 <td colspan=\"2\" align=\"center\" valign=\"middle\" background=\"images/bg2.gif\" width=\"60%\"> &nbsp;&nbsp;<font><b>用户信息修改</b></font> ");
		out.println("   				 </td>");
		out.println("			<tr>");
		out.println("			<tr>");
		out.println("				<td width=\"40%\" class=\"tablebody1\"><b>用户名</b>：<br>英文字母或数字，最大长度为8位</td>");
		out.println("				<td width=\"60%\" class=\"tablebody1\">");
		out.println("				<input type=\"text\" maxLength=\"12\" size=\"32\"  value=\""+contactInfo.getUserId()+"\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("				<font color=\"#FF0000\">*</font></td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td width=\"40%\" class=\"tablebody1\"><b>密码</b>：<br>数字，6到8位</td>");
		out.println("				<td width=\"60%\" class=\"tablebody1\">");
		out.println("				<input type=\"password\" maxLength=\"12\" size=\"32\" name=\"password\" value=\" "+user.getPassword()+"\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("				<font color=\"#FF0000\">*</font></td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td width=\"40%\" class=\"tablebody1\"><b>确认密码</b>：<br>数字，6到8位</td>");
		out.println("				<td width=\"60%\" class=\"tablebody1\">");
		out.println("				<input type=\"password\" maxLength=\"12\" size=\"32\" name=\"password2\" value=\""+user.getPassword()+" \" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("				<font color=\"#FF0000\">*</font></td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td width=\"40%\" class=\"tablebody1\"><b>所在地区</b>：</td>");
		out.println("				<td width=\"60%\" class=\"tablebody1\">");
		out.println("					<select name=\"country\" onchange=\"javascript:initProvince(this.value)\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000\">");
		out.println("    						<option value=\"1\"  selected>中国</option>");
		out.println("    						<option value=\"2\" >中国香港</option>");
		out.println("    						<option value=\"3\" >中国台湾</option>");
		out.println("					</select>");
		out.println("					<select name=\"province\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000\">");
		out.println("               		  	");
		out.println("	    					<option value=\"1\" >安徽</option>");
		out.println("	    					<option value=\"2\" >北京</option>");
		out.println("	    					<option value=\"3\" >重庆</option>");
		out.println("	    					<option value=\"4\" >福建</option>");
		out.println("	    					<option value=\"5\" >广东</option>");
		out.println("	    					<option value=\"6\" >甘肃</option>");
		out.println("	    					<option value=\"7\" >广西</option>");
		out.println("	    					<option value=\"8\" >贵州</option>");
		out.println("	    					<option value=\"9\" >河南</option>");
		out.println("	    					<option value=\"10\" >湖北</option>");
		out.println("	    					<option value=\"11\" >河北</option>");
		out.println("	    					<option value=\"12\" >海南</option>");
		out.println("	    					<option value=\"13\" >香港</option>");
		out.println("	    					<option value=\"14\" >黑龙江</option>");
		out.println("	    					<option value=\"15\" >湖南</option>");
		out.println("	    					<option value=\"16\" >吉林</option>");
		out.println("	    					<option value=\"17\" >江苏</option>");
		out.println("	    					<option value=\"18\" >江西</option>");
		out.println("	    					<option value=\"19\" >辽宁</option>");
		out.println("	    					<option value=\"20\" >澳门</option>");
		out.println("	    					<option value=\"21\" >内蒙古</option>");
		out.println("	    					<option value=\"22\" >宁夏</option>");
		out.println("	    					<option value=\"23\" >青海</option>");
		out.println("	    					<option value=\"24\" >四川</option>");
		out.println("	    					<option value=\"25\" >山东</option>");
		out.println("	    					<option value=\"26\"  selected>上海</option>");
		out.println("	    					<option value=\"27\" >陕西</option>");
		out.println("	    					<option value=\"28\" >山西</option>");
		out.println("	    					<option value=\"29\" >天津</option>");
		out.println("	    					<option value=\"30\" >台湾</option>");
		out.println("	    					<option value=\"31\" >新疆</option>");
		out.println("	    					<option value=\"32\" >西藏</option>");
		out.println("	    					<option value=\"33\" >云南</option>");
		out.println("	    					<option value=\"34\" >浙江</option>");
		out.println("	    					<option value=\"35\" >其它</option>");
		out.println("	    					<option value=\"36\" >中国香港</option>");
		out.println("	    					<option value=\"37\" >中国台湾</option>");
		out.println("				</select>省");
		out.println("				<input type=\"text\" size=\"8\" name=\"city\" value=\"黄埔\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000\"/>市/县</td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>联系地址1</b>：</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input type=\"text\" size=\"64\" maxlength=\"32\" name=\"street1\" value=\""+contactInfo.getStreet1()+"\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("			</td>");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>联系地址2</b>：</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input type=\"text\" size=\"64\" maxlength=\"32\" name=\"street2\" value=\""+contactInfo.getStreet2()+"\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("			</td>");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>邮编</b>：</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input type=\"text\" size=\"32\" maxlength=\"8\" name=\"zip\" value=\""+contactInfo.getZip()+"\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("			</td>");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>家庭电话</b>：</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input type=\"text\" size=\"32\" maxlength=\"16\" name=\"homephone\" value=\""+contactInfo.getHomePhone()+"\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("			</td>");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>办公室电话</b>：</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input type=\"text\" size=\"32\" maxlength=\"16\" name=\"officephone\" value=\""+contactInfo.getOfficePhone()+"\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("			</td>");
		out.println("			<tr>");
		out.println("				<td class=\"tablebody1\"><b>手机</b>：</td>");
		out.println("				<td class=\"tablebody1\">");
		out.println("				<input type=\"text\" size=\"32\" maxlength=\"16\" name=\"officephone\" value=\""+contactInfo.getCellPhone()+"\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000\"/>");
		out.println("			</td>");
		out.println("			<tr>");
		out.println("");
		out.println("			<td class=\"tablebody1\"><b>Email地址</b>：<br>	请输入有效的邮件地址</td>");
		out.println("			<td class=\"tablebody1\">");
		out.println("			<input maxLength=\"50\" size=\"32\" maxlength=\"32\" name=\"email\" value=\""+contactInfo.getEmail()+"\" style=\"font-family: Tahoma,Verdana,宋体; font-size: 12px; line-height: 15px; color: #000000\"/></td>");
		out.println("			</tr>");
		out.println("			<tr>");
		out.println("			<td class=\"tablebody2\" valign=\"middle\" colspan=\"2\" align=\"center\">");
		out.println("			<input type=\"button\" value=\"修&nbsp;改\" onclick=\"javascript:checkReg()\"/>");
		out.println("			</td>");
		out.println("		</tr>");
		out.println("		</table>");
		out.println("</form>");
		out.println("<html>");
		out.println("	<body>");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\" height=\"28\">");
		out.println("		  <tr>");
		out.println("");
		out.println("		    <td height=\"17\" background=\"/ecport/images/bot_bg.gif\"></td>");
		out.println("		  </tr>");
		out.println("		</table>");
		out.println("		");
		out.println("		<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">");
		out.println("		  <tr>");
		out.println("		    <td bgcolor=\"#f1f1f6\" height=\"53\" valign=\"center\">");
		out.println("			<p align=\"center\">");
		out.println("				Copyright &copy;2004 - 2005 <a href=\"http://www.tarena.com.cn\">");
		out.println("");
		out.println("				<b><font face=\"Verdana,\">Tarena</font></b>");
		out.println("				<font color=#CC0000>.com.cn</font>");
		out.println("			</a></p><br>");
		out.println("		    </td>");
		out.println("		  </tr>");
		out.println("		</table>");
		out.println("	</body>");
		out.println("</html>");

	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
