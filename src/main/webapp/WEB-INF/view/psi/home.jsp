<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FT PSI Tables</title>
        <!-- 載入資源 -->
        <%@include file="include/header.jspf"  %>
    </head>
    <body>
        <!-- 上方導航選單 -->
        <%@include file="include/navbar.jspf"  %>
        
        <!-- 中間主體內容 -->
        <div class="container">
            <!-- 頁面內容製作區 -->
            <h1>FT PSI Tables</h1>
            <img class="img-responsive" src="${pageContext.request.contextPath}/images/sample1.jpeg" />
        </div>
        
        <!-- 下方註腳 -->
        <%@include file="include/footer.jspf"  %>
            
    </body>
</html>