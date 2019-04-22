<%@page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>

<link rel="stylesheet" href="inc/css.css" type="text/css" />
</head>


<body>
 <table width="1052" border=0 align=center cellpadding=2 cellspacing=1 bordercolor="#799AE1" class=tableBorder>
    <tbody>
    
      <tr>
        <th align=center colspan=16 style="height: 23px">角色结果显示</th>
      </tr>
      <tr><td><font color="red"><s:property value="#session.message" /></font></td></tr>
      <tr bgcolor="#DEE5FA">
        <td colspan="16" align="center" class=txlrow>&nbsp;</td>
      </tr>
      <tr align="center" bgcolor="#799AE1">
        <td width="6%" align="center" class="txlHeaderBackgroundAlternate">角色名</td>
       	<td width="6%" align="center" class=txlHeaderBackgroundAlternate><a>修改</a></td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><a>删除</a></td>
      </tr>
   <s:iterator value="#session.roleListAll">
      <tr align="center" bgcolor="#799AE1">
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><s:property value="rolename"/></td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><a href="modifyRolePre?role.id=<s:property value="id"/>">修改</a></td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><a href="deleteRole?role.id=<s:property value="id"/>" onclick="javascript:return confirm('确定删除吗?');">删除</a></td>
      </tr>
 </s:iterator>

 </BODY>
  </HTML>