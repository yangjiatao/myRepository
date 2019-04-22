<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page import="com.hp.action.*,com.hp.entity.*" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<script language="javascript">
	function confirm(){
	alert('<%=session.getAttribute("message")%>');
	window.location='addHardwareInfor.jsp';
	}

		
		

  </script>
  <script type="text/javascript" src="js/calendar.js"></script>
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
		function checkEmpty(addSoftWare)
		{		
			if(document.getElementById("databasic.devCode").value == "")
			{
			window.alert("设备编码不能为空");
			return false;
			}
		
			
		}	
</script>
	</head>
	
	<center>
	<h1>
		 Register software(带<font color="red">*</font>为必填项)
	</h1>
</center>
	<body bgcolor="#799ae1" background="images/registerbackground.jpg">
	
	<!-- 	<I><font
	face="楷体_GB2312" color="#FF0000"><s:fielderror /> </font> </I>  读取显示提示信息 -->
		<!-- 防止重复提交 -->
	<form name="addSoftWare" action="addSoftWare" method="post" onsubmit="return checkEmpty(this)">

		<table align="center">
				<tr>
					<td>
						设备编码:
					</td>
					<td>
						<input type="text" name="databasic.devCode" id="databasic.devCode"/><FONT color="red"><s:property value="message"/></FONT><font color="red">*</font> 
					</td>
				</tr>
				<tr>
					<td>
						设备名称:
					</td>
					<td>
						<input type="text" name="databasic.devName"/>
					</td>
				</tr>
				<tr>
					<td>
						种类名称:
					</td>
					<td>
						<input type="text" name="assetTypeName" style="background-color:#808080" value="软件" readonly="readonly"/>
					</td>
				</tr>
				<tr>
					<td>
						品牌:
					</td>
					<td>
						<input type="text" name="databasic.brand"/>
					</td>
				</tr>
				<tr>
					<td>
						规格型号:
					</td>
					<td>
						<input type="text" name="databasic.model"/>
					</td>
				</tr>
				<tr>
					<td>
						生产商:
					</td>
					<td>
						<input type="text" name="databasic.fac"/>
					</td>
				</tr>
				<tr>
					<td>
						供应商:
					</td>
					<td>
						<input type="text" name="databasic.acc"/>
					</td>
				</tr>
				<tr>
					<td>
						价格:
					</td>
					<td>
						<input type="text" name="databasic.price"/>
					</td>
				</tr>
				<tr>
					<td>
						日期:
					</td>
					<td>
						<input type="text" name="databasic.date" onFocus="calendar()"/>
					</td>
				</tr>
				<tr>
					<td>
						数量:
					</td>
					<td>
						<input type="text" name="databasic.quantity"/>
					</td>
				</tr>
			<tr>
					<td>
						部门:
					</td>
					<td>
						<input type="text" name="databasic.department"/>
					</td>
				</tr>
				<tr>
					<td>
						所属类别：
					</td>
					<!-- 
					<td>
						 <s:select list="AssetSmallTypeListAll"  listValue="smalltypename" listKey="id"  name="assetSmallType.id" id="assetSmallType.id"
                         value="assetSmallType.id"></s:select>  
					</td>
					 -->
					 <td>
					
			   <select name=assetSmallType.id>
			   <s:iterator value="AssetSmallTypeListAll">
				   <option value=<s:property value="id"/>><s:property value="smalltypename"/></option>
				</s:iterator>
				 </select>
				 
				 </td>
				</tr>
				<tr>
						<td>
							<input type="submit" value="Add"/>
						</td>
						<td>
							<input type="reset" value="Reset"/>
						</td>
				</tr>
		</table>
	</form>
	</body>

</html>