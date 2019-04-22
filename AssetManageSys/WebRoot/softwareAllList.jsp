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
        <th align=center colspan=16 style="height: 23px">软件结果显示</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan="16" align="center" class=txlrow>&nbsp;</td>
      </tr>
      <tr align="center" bgcolor="#799AE1">
        <td width="6%" align="center" class="txlHeaderBackgroundAlternate">设备编码</td>
        <td width="7%" align="center" class=txlHeaderBackgroundAlternate>设备名称</td>
        <td width="9%" align="center" class=txlHeaderBackgroundAlternate>种类名称</td>
        <td width="8%" align="center" class=txlHeaderBackgroundAlternate>品牌</td>
        <td align="center" class=txlHeaderBackgroundAlternate>规格型号</td>
        <td colspan="2" align="center" class=txlHeaderBackgroundAlternate>生产商</td>
        <td colspan="2" align="center" class=txlHeaderBackgroundAlternate>供应商</td>
        <td width="9%" align="center" class=txlHeaderBackgroundAlternate>价格</td>
        <td width="7%" align="center" class=txlHeaderBackgroundAlternate>日期</td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate>数量</td>
        <td width="7%" align="center" class=txlHeaderBackgroundAlternate>部门</td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate>所属类别</td>
        <%
           if(!session.getAttribute("roleId").equals(1)&&!session.getAttribute("roleId").equals(4)){
        %> 
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><a>修改</a></td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><a>删除</a></td>
        <%} %>
      </tr>
   <s:iterator value="#session.dataBasicList">
      <tr align="center" bgcolor="#799AE1">
        <td width="6%" align="center" class="txlHeaderBackgroundAlternate"><s:property value="devCode"/></td>
        <td width="7%" align="center" class=txlHeaderBackgroundAlternate><s:property value="devName"/></td>
        <td width="9%" align="center" class=txlHeaderBackgroundAlternate>软件</td>
        <td width="8%" align="center" class=txlHeaderBackgroundAlternate><s:property value="brand"/></td>
        <td align="center" class=txlHeaderBackgroundAlternate><s:property value="model"/></td>
        <td colspan="2" align="center" class=txlHeaderBackgroundAlternate><s:property value="fac"/></td>
        <td colspan="2" align="center" class=txlHeaderBackgroundAlternate><s:property value="acc"/></td>
        <td width="9%" align="center" class=txlHeaderBackgroundAlternate><s:property value="price"/></td>
        <td width="7%" align="center" class=txlHeaderBackgroundAlternate><s:property value="date"/></td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><s:property value="quantity"/></td>
        <td width="7%" align="center" class=txlHeaderBackgroundAlternate><s:property value="department"/></td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><s:property value="assetSmallType.smalltypename"/></td>
        <%
           if(!session.getAttribute("roleId").equals(1)&&!session.getAttribute("roleId").equals(4)){
        %> 
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><a href="modifySoftWarePre?devCode=<s:property value="devCode"/>">修改</a></td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><a href="deleteSoftWare?devCode=<s:property value="devCode"/>" onclick="javascript:return confirm('确定删除吗?');">删除</a></td>
      <%} %>
      </tr>
       </s:iterator>
 </BODY>
  </HTML>