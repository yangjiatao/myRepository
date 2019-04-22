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
		function checkEmpty(addRole)
		{		
			if(document.getElementById("role.rolename").value == "")
			{
			window.alert("角色名不能为空");
			return false;
			}
		
			
		}	
</script>
	</head>
	
	<center>
	<h1>
		Role Register(带<font color="red">*</font>为必填项)
	</h1>
</center>
	<body bgcolor="#799ae1" background="images/registerbackground.jpg">
	<s:form  name="addRole" action="addRole" method="post" onsubmit="return checkEmpty(this)">
	<!-- 	<I><font
	face="楷体_GB2312" color="#FF0000"><s:fielderror/> </font> </I>  读取显示提示信息 -->
		<!-- 防止重复提交 -->
	
		<table align="center">
				
				<tr>
					<td>
						
						角色名：
					</td>
					<td>
						<input type="text" name="role.rolename" id="role.rolename"/><FONT color="red"><s:property value="message"/></FONT><font color="red">*</font>
						<span id="result">
						</span>
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