<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>资产管理系统</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-color: #016aa9;
	overflow:hidden;
}
.STYLE1 {
	color: #000000;
	font-size: 12px;
}
-->
</style></head>
<script language="javascript">
	function checkEmpty(user)
	{		
		if(document.getElementById("user.username").value == "")
		{
			window.alert("用户名不能为空!");
			return false;
		}
		
		if(document.getElementById("user.password").value == "")
		{
			window.alert("密码不能为空!");
			return false;
		}
	}	
</script>
<body>
<s:form name="user" method="post" action="login" onsubmit="return checkEmpty(this)">
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td><table width="962" border="0" align="center" cellpadding="0" cellspacing="0">
      <tr>
        <td height="235" background="images/login_03.gif">&nbsp;</td>
      </tr>
      <tr>
        <td height="53"><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="394" height="53" background="images/login_05.gif">&nbsp;</td>
            <td width="206" background="images/login_06.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="16%" height="25"><div align="right"><span class="STYLE1">用户</span></div></td>
                <td width="57%" height="25"><div align="center">
                  <input type="text" name="user.username" id="user.username" style="width:105px; height:17px; background-color:#292929; border:solid 1px #7dbad7; font-size:12px; color:#6cd0ff">
                </div></td>
                <td width="27%" height="25">&nbsp;</td>
              </tr>
              <tr>
                <td height="25"><div align="right"><span class="STYLE1">密码</span></div></td>
                <td height="25"><div align="center">
                  <input type="password" name="user.password" id="user.password" style="width:105px; height:17px; background-color:#292929; border:solid 1px #7dbad7; font-size:12px; color:#6cd0ff">
                </div></td>
                <td height="25"><div align="left"><input name="Submit" type="image" src="images/dl.gif" width="49" height="18" border="0"></div></td>
              </tr>
               
         
          
            </table></td>
            <td width="362" background="images/login_07.gif"></td>
          </tr>
         
        </table></td>
      </tr>
      <tr>
        <td height="213" background="images/login_08.gif">
 <div id="message"><FONT color="red"><s:property value="message"/></FONT></div>
    </table></td>
    
  </tr>
 
</table>

</s:form>
</body>
</html>
