<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%@ taglib prefix="s"  uri="/struts-tags"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>  
        <h1>添加新用户</h1>  
        <s:form action="add" namespace="/" method="post">  
            <s:textfield label="用户名" name="user.username"></s:textfield>  
            <s:password label="密码" name="user.password"></s:password>  
            <s:submit value="提交"></s:submit>  
        </s:form>   
    </center>
</body>
</html>