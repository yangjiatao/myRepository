<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

  
		<title>My JSP 'index.jsp' starting page</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<script type="text/javascript" src="jslib/jquery.js"></script>
		<script type="text/javascript" src="jslib/verify.js"></script>
		<script language="javascript">
		function checkEmpty(user)
		{		
			if(document.getElementById("user.username").value == "")
			{
			window.alert("用户名不能为空");
			return false;
			}
		
			if(document.getElementById("user.password").value == "")
			{
			window.alert("密码不能为空");
			return false;
			}
		}	
</script>
	</head>
	
	<center>
	<h1>
		User Register(带<font color="red">*</font>为必填项)
	</h1>
</center>
	<body bgcolor="#799ae1" background="images/registerbackground.jpg">
	<s:form  name="user" action="addUser" method="post" onsubmit="return checkEmpty(this)">
	<!-- 	<I><font
	face="楷体_GB2312" color="#FF0000"><s:fielderror /> </font> </I>  读取显示提示信息 -->
		<!-- 防止重复提交 -->
	
		<table align="center">
				
				<tr>
					<td>
						
						用户名：
					</td>
					<td>
						<input type="text" name="user.username" id="user.username"
							/><FONT color="red"><s:property value="message"/></FONT><font color="red">*</font>
						<span id="result">
						</span>
					</td>
				</tr>
				<tr>
					<td>
						密码：
					</td>
					<td>
						<input type="text" id="user.password" name="user.password" /><font color="red">*</font>
					</td>
				</tr>
				<tr>
					<td>
						年龄：
					</td>
					<td>
						<input type="text" id="user.age" name="user.age" />
					</td>
				</tr>
				<tr>
					<td>
						邮箱：
					</td>
					<td>
						<input type="text" id="user.email" name="user.email" />
					</td>
				</tr>
				<tr>
					<td>
						电话：
					</td>
					<td>
						<input type="text" id="user.phone" name="user.phone" />
					</td>
				</tr>
				<tr>
					<td>
						角色名：
					</td>
					<td>
					 <select name=role.id>
			   		<s:iterator value="roleListAll">
				   <option value=<s:property value="id"/>><s:property value="rolename"/></option>
					</s:iterator>
				 </select>
				 
				 </td>
				</tr>
				<tr>
						<td colspan="2" align="center">
							<input type="submit" value="submit" />
							<input type="reset" value="reset" />
						</td>
						
			</tr>
			
		</table>
	</s:form>
	</body>

</html>