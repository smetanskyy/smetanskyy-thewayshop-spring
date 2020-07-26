<%--
  Created by IntelliJ IDEA.
  User: methan
  Date: 16.07.2020
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>

<%@include file="templates/header.jsp"%>
<%@include file="templates/headerInternal.jsp"%>
<c:url value="/resources/" var="resources"/>

<!-- Start Wishlist  -->
<div class="wishlist-box-main">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="table-main table-responsive">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>Images</th>
                            <th>Product Name</th>
                            <th>Unit Price </th>
                            <th>Stock</th>
                            <th>Add Item</th>
                            <th>Remove</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td class="thumbnail-img">
                                <a href="#">
                                    <img class="img-fluid" src="${resources}images/img-pro-01.jpg" alt="" />
                                </a>
                            </td>
                            <td class="name-pr">
                                <a href="#">
                                    Lorem ipsum dolor sit amet
                                </a>
                            </td>
                            <td class="price-pr">
                                <p>$ 80.0</p>
                            </td>
                            <td class="quantity-box">In Stock</td>
                            <td class="add-pr">
                                <a class="btn hvr-hover" href="#">Add to Cart</a>
                            </td>
                            <td class="remove-pr">
                                <a href="#">
                                    <i class="fas fa-times"></i>
                                </a>
                            </td>
                        </tr>
                        <tr>
                            <td class="thumbnail-img">
                                <a href="#">
                                    <img class="img-fluid" src="${resources}images/img-pro-02.jpg" alt="" />
                                </a>
                            </td>
                            <td class="name-pr">
                                <a href="#">
                                    Lorem ipsum dolor sit amet
                                </a>
                            </td>
                            <td class="price-pr">
                                <p>$ 60.0</p>
                            </td>
                            <td class="quantity-box">In Stock</td>
                            <td class="add-pr">
                                <a class="btn hvr-hover" href="#">Add to Cart</a>
                            </td>
                            <td class="remove-pr">
                                <a href="#">
                                    <i class="fas fa-times"></i>
                                </a>
                            </td>
                        </tr>
                        <tr>
                            <td class="thumbnail-img">
                                <a href="#">
                                    <img class="img-fluid" src="${resources}images/img-pro-03.jpg" alt="" />
                                </a>
                            </td>
                            <td class="name-pr">
                                <a href="#">
                                    Lorem ipsum dolor sit amet
                                </a>
                            </td>
                            <td class="price-pr">
                                <p>$ 30.0</p>
                            </td>
                            <td class="quantity-box">In Stock</td>
                            <td class="add-pr">
                                <a class="btn hvr-hover" href="#">Add to Cart</a>
                            </td>
                            <td class="remove-pr">
                                <a href="#">
                                    <i class="fas fa-times"></i>
                                </a>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- End Wishlist -->

<%@include file="templates/instagramFeed.jsp"%>
<%@include file="templates/footer.jsp"%>