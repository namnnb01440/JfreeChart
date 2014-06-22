<%-- 
    Document   : Main
    Created on : Jun 21, 2014, 4:24:56 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<style type="text/css">
img {
float:right;
margin:0 0 15px 20px;
padding:15px;
text-align:center;
}
</style>
</head>
<body>
<s:url action="chart" id="url"/>
<img src="<s:property value="url"/>"/>
<p>
XML is an open standard for data exchange as well as the
...
</p>
</body>
</html>
