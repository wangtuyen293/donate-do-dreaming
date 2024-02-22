<%-- 
    Document   : viewProject
    Created on : Feb 21, 2024, 3:46:41 PM
    Author     : quang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="./layout/header.jsp" />
<div class="row" style="display: flex; justify-content: center; align-items: center;">
    <div class="col-xl-12">
        <div class="section-tittle mb-70">
            <h2>Những dự án nổi bật</h2>
        </div>
    </div>
</div>
<div class="row">
    <div class="col-xl-4 col-lg-4 col-md-6 col-sm-6" style="max-width: 300px; text-align: center; margin-bottom: 30px;">
        <div class="single-new-pro mb-30 text-center">
            <div class="product-img">
                <img src="assets/img/gallery/new_product1.png" alt>
            </div>
            <div class="product-caption">
                <h3><a href="product_details.html">Project 1</a></h3>
                <div id="progress-container">
                    <progress id="my-progress" value="75" max="100"></progress>
                </div>
                <h4> Tiến trình dự án: </h4>
            </div>
        </div>
    </div>
    <div class="col-xl-4 col-lg-4 col-md-6 col-sm-6" style="max-width: 300px; text-align: center; margin-bottom: 30px;">
        <div class="single-new-pro mb-30 text-center">
            <div class="product-img">
                <img src="assets/img/gallery/new_product2.png" alt>
            </div>
            <div class="product-caption">
                <h3><a href="product_details.html">Thermo Ball Etip Gloves</a></h3>
                <div id="progress-container">
                    <progress id="my-progress" value="75" max="100"></progress>
                </div>
                <h4> Tiến trình dự án: </h4>
            </div>
        </div>
    </div>
    <div class="col-xl-4 col-lg-4 col-md-6 col-sm-6" style="max-width: 300px; text-align: center; margin-bottom: 30px;">
        <div class="single-new-pro mb-30 text-center">
            <div class="product-img">
                <img src="assets/img/gallery/new_product3.png" alt>
            </div>
            <div class="product-caption">
                <h3><a href="product_details.html">Thermo Ball Etip Gloves</a></h3>
                <div id="progress-container">
                    <progress id="my-progress" value="75" max="100"></progress>
                </div>
                <h4> Tiến trình dự án: </h4>
            </div>
        </div>
    </div>
</div>

<jsp:include page="./layout/footer.jsp" />

