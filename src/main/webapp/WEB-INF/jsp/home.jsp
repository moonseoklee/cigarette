<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page import="java.util.List"%>

<html>



<head>
    <link rel="stylesheet" href="css/home.css">
    <link rel="stylesheet" href="css/modal.css">
    <link rel="stylesheet" href="css/input.css">
    <script type="text/javascript" src="javascript/inputFunction.js"></script>

</head>
<body>
<div class="main">
    <div class="cost" id="cost"></div>
    <div class="mainImage">
        <img src="images/cigar.png">
    </div>
    <div class="howMuch">
        I smokes
        <input style="width:60px" type="input" class="form__field" placeholder="Name" name="name" id='name' required />
        a day
    </div>
    <div class="buttons">
    <div class="buttonsLeft">
            <% List some = (List)session.getAttribute("some");%>
            <c:forEach items="${some}" var = "t">

                <img src="${t.url}" onclick="imageClick(${t.price})">
            </c:forEach>
    </div>
    <div class="buttonsRight">

        <c:forEach items="${some}" var = "t">
            <img src="${t.url}" onclick="imageClick(${t.price})">
        </c:forEach>
    </div>
    </div>
    <div class="addButtonArea">
        <button id="addButton">click!</button>
    </div>
    <div id="modal" class="modal">        <!-- Modal content -->


            <div class="form__group field">
                <form style="display:grid" action="/submitSome" method="post" enctype="multipart/form-data">
                    <label for="title" class="form__label">Thing</label>
                    <input type="input" class="form__field" placeholder="Thing" autocomplete="off" name="title" id="title" required/>

                    <label for="price" class="form__label">Price</label>
                    <input type="input" class="form__field" placeholder="Price" autocomplete="off" name="price" id="price" required/>

                    <input type="file" name="file" id="file" class="inputFile" />
                    <label for="file" id="fileUploadLabel">Image Upload</label>
                <button class="submitButton"></button>
                </form>
            </div>


    </div>

</div>
<script src="https://code.jquery.com/jquery-2.2.4.js" integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI=" crossorigin="anonymous"></script>
<script type="text/javascript" src="./javascript/modal.js"></script>
</body>


</html>
