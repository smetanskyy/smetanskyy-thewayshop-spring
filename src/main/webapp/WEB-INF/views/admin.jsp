<%--
  Created by IntelliJ IDEA.
  User: methan
  Date: 26.07.2020
  Time: 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="templates/header.jsp"%>
<%@include file="templates/headerInternal.jsp"%>
<c:url value="/resources/" var="resources"/>
<div class="container">
    <div class="row">
        <div class="col ">
            <h1>Administrator area</h1>
            <a href="<c:url value="/admin/productInventory"/>">Product inventory</a>
        </div>
    </div>
</div>
<%@include file="templates/instagramFeed.jsp"%>
<%@include file="templates/footer.jsp"%>
