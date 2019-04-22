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
        <th align=center colspan=16 style="height: 23px">用户结果显示</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan="16" align="center" class=txlrow>&nbsp;</td>
      </tr>
      <tr align="center" bgcolor="#799AE1">
        <td width="6%" align="center" class="txlHeaderBackgroundAlternate">用户名</td>
        <td width="7%" align="center" class=txlHeaderBackgroundAlternate>密码</td>
        <td width="6%" align="center" class="txlHeaderBackgroundAlternate">年龄</td>
        <td width="7%" align="center" class=txlHeaderBackgroundAlternate>邮箱</td>
        <td width="7%" align="center" class=txlHeaderBackgroundAlternate>电话</td>
        <td width="9%" align="center" class=txlHeaderBackgroundAlternate>角色名</td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><a>修改</a></td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><a>删除</a></td>
      </tr>
   <s:iterator value="#session.userList">
      <tr align="center" bgcolor="#799AE1">
        <td width="6%" align="center" class="txlHeaderBackgroundAlternate"><s:property value="username"/></td>
        <td width="7%" align="center" class=txlHeaderBackgroundAlternate><s:property value="password"/></td>
        <td width="6%" align="center" class="txlHeaderBackgroundAlternate"><s:property value="age"/></td>
        <td width="7%" align="center" class=txlHeaderBackgroundAlternate><s:property value="email"/></td>
        <td width="7%" align="center" class=txlHeaderBackgroundAlternate><s:property value="phone"/></td>
       	<td width="6%" align="center" class=txlHeaderBackgroundAlternate><s:property value="role.rolename"/></td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><a href="modifyUserPre?user.id=<s:property value="id"/>">修改</a></td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><a href="deleteUser?user.id=<s:property value="id"/>" onclick="javascript:return confirm('确定删除吗?');">删除</a></td>
      </tr>
 </s:iterator>
 </BODY>
  </HTML>