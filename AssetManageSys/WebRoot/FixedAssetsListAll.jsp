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
        <th align=center colspan=16 style="height: 23px">资产维护结果显示</th>
      </tr>
      <tr bgcolor="#DEE5FA">
        <td colspan="16" align="center" class=txlrow>&nbsp;</td>
      </tr>
      <tr align="center" bgcolor="#799AE1">
        <td width="6%" align="center" class="txlHeaderBackgroundAlternate">设备编码</td>
        <td width="7%" align="center" class=txlHeaderBackgroundAlternate>维护费用</td>
        <td width="9%" align="center" class=txlHeaderBackgroundAlternate>维护时间</td>
        <td width="8%" align="center" class=txlHeaderBackgroundAlternate>规格型号</td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate>所属类别</td>
        <%
           if(!session.getAttribute("roleId").equals(1)&&!session.getAttribute("roleId").equals(4)){
        %> 
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><a>修改</a></td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><a>删除</a></td>
        <%} %>
      </tr>
   <s:iterator value="#session.vinassetList">
      <tr align="center" bgcolor="#799AE1">
        <td width="6%" align="center" class="txlHeaderBackgroundAlternate"><s:property value="dataBasic.devCode"/></td>
        <td width="8%" align="center" class=txlHeaderBackgroundAlternate><s:property value="vinCost"/></td>
        <td align="center" class=txlHeaderBackgroundAlternate><s:property value="vinDate"/></td>
        <td width="9%" align="center" class=txlHeaderBackgroundAlternate><s:property value="dataBasic.model"/></td>
       	<td width="6%" align="center" class=txlHeaderBackgroundAlternate><s:property value="dataBasic.assetSmallType.smalltypename"/></td>
       	 <%
           if(!session.getAttribute("roleId").equals(1)&&!session.getAttribute("roleId").equals(4)){
        %> 
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><a href="modifyFixedAssetsPre?vinasset.id=<s:property value="id"/>">修改</a></td>
        <td width="6%" align="center" class=txlHeaderBackgroundAlternate><a href="deleteFixedAssets?vinasset.id=<s:property value="id"/>" onclick="javascript:return confirm('确定删除吗?');">删除</a></td>
      <%} %>
      </tr>
       </s:iterator>
 </BODY>
  </HTML>