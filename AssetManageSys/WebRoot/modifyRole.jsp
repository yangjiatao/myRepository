<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
 <script language="javascript">
 var email_Flag = false;
 
 
	function checkEmpty(userForm)
	{	

		if(document.userForm.userName.value == "")
		{
			window.alert("用户名不能为空!");
			return false;
		}
		
		if(document.userForm.passWord.value == "")
		{
			window.alert("密码不能为空!");
			return false;
		}
		
		if(document.userForm.confirmedPassWord.value == "")
		{
			window.alert("请重复输入密码!");
			return false;
		}
		if (document.userForm.passWord.value != document.userForm.confirmedPassWord.value)
		{
			window.alert("您两次输入的密码不一致，请重新输入");
			return false;
		}
		if(document.userForm.question.value == "")
		{
			window.alert("请输入密码找回问题!");
			return false;
		}
		if(document.userForm.answer.value == "")
		{
			window.alert("请输入问题答案!");
			return false;
		}
		if(document.userForm.email.value == "")
		{
			window.alert("请输入邮箱地址!");
			return false;
		}
		
		//验证邮箱 (正则表达式)
		var strEmail = document.getElementById("email").value;
		var reg = /^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/;
		if(!(reg.test(strEmail))){
		window.alert("邮箱格式不正确，请重新输入！");
					return false;
		}
		
		if(document.userForm.myFile.value == "")
		{
			window.alert("请选择所上传图片!");
			return false;
		}
		
		
		
		if (isNaN(document.userForm.qq.value))
		{
			window.alert("只能为数字");
			return false;
		}
		
		
	}	
  </script>
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
	</head>
	
	<center>
	<h1>
		 Modify Role
	</h1>
</center>
	<body bgcolor="#799ae1" background="images/registerbackground.jpg">
	
	<!-- 	<I><font
	face="楷体_GB2312" color="#FF0000"><s:fielderror /> </font> </I>  读取显示提示信息 -->
		<!-- 防止重复提交 -->
	<form action="modifyRole" method="post">

		<table align="center">
				
				<tr>
					
					<td>
						<input type="hidden" name="role.id" value="${role.id }">
						角色名:
					</td>
					<td>
						<input type="text" name="role.rolename"  value="${role.rolename}"/>
					</td>
				</tr>
				
				<tr>
						<td>
							<input type="submit" value="Modify"/>
						</td>
						<td>
							<input type="reset" value="Reset"/>
						</td>
				</tr>
		</table>
	</form>
	</body>

</html>