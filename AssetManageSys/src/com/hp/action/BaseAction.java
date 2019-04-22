package com.hp.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.hp.entity.DataBasic;
import com.hp.service.AssetSmallTypeService;
import com.hp.service.AssetSmallTypeServiceImpl;
import com.hp.service.AssetTypeService;
import com.hp.service.AssetTypeServiceImpl;
import com.hp.service.DataBasicService;
import com.hp.service.DataBasicServiceImpl;
import com.hp.service.RoleService;
import com.hp.service.RoleServiceImpl;
import com.hp.service.UserService;
import com.hp.service.UserServiceImpl;
import com.hp.service.VinassetService;
import com.hp.service.VinassetServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.HttpContext;

/**
 * @className BaseAction
 * @description Gets the object associated servletApi
 * @version $Revision: 4.0 $
 * @author
 * 
 */

public class BaseAction extends ActionSupport implements ServletRequestAware,
		SessionAware, RequestAware, ServletResponseAware {
	public DataBasicService databasicService = new DataBasicServiceImpl();
	public AssetSmallTypeService assetSmallTypeService = new AssetSmallTypeServiceImpl();
	public AssetTypeService assetTypeService = new AssetTypeServiceImpl(); 
	public RoleService roleService = new RoleServiceImpl();
	public UserService userService = new UserServiceImpl();
	public VinassetService vinassetService = new VinassetServiceImpl();
	private static final long serialVersionUID = 1L;
	private HttpServletRequest httpRequest = null;
	private HttpServletResponse httpResponse = null;
	private HttpContext httpContext = null;
	private Map<String, Object> request = null;
	private Map<String, Object> session;
	private DataBasic dataBasic;
	
	public String CheckDevCode() throws IOException {
		
		
		PrintWriter	out = getHttpResponse().getWriter();
		out.println("<message>");
		if(databasicService.findByDataBasicDevCode(dataBasic.getDevCode())!=null) {
			out.println("true");
			// System.out.println("exist");
			// 4。和传统应用不同之处。这一步需要将用户感兴趣的数据返回给页面段，而不是将一个新的页面发送给用户
			// 写法没有变化，本质发生了改变

			// out.println("username exist,please change username");
		} else {
			out.println("false");
			// out.println("username not exist,you can use it");
		}
		return null;
	} 

	
	public DataBasic getDataBasic() {
		return dataBasic;
	}


	public void setDataBasic(DataBasic dataBasic) {
		this.dataBasic = dataBasic;
	}


	public HttpContext getHttpContext() {
		return httpContext;
	}

	public void setHttpContext(HttpContext httpContext) {
		this.httpContext = httpContext;
	}

	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}

	public void setServletRequest(HttpServletRequest req) {
		this.httpRequest = req;
	}

	public HttpServletRequest getServletRequest() {
		return httpRequest;
	}

	public Map<String, Object> getRequest() {
		return request;
	}

	public void setSession(Map<String, Object> ses) {
		this.session = ses;

	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	public HttpSession getHttpSession() {
		return httpRequest.getSession(false);
	}

	public void setServletResponse(HttpServletResponse res) {

		this.httpResponse = res;
	}

	public HttpServletResponse getHttpResponse() {
		return httpResponse;
	}

}
