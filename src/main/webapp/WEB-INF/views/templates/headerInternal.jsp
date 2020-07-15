<%--
  Created by IntelliJ IDEA.
  User: methan
  Date: 15.07.2020
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<!-- Start All Title Box -->
<div class="all-title-box">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <h2>${title}</h2>
                <ul class="breadcrumb">
                    <li class="breadcrumb-item"><a href="<c:url value="/home"/>">Home</a></li>
                    <li class="breadcrumb-item active">${title}</li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!-- End All Title Box -->
