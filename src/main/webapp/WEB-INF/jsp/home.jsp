<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page import="java.util.List"%>

<html>

<% List some = (List)session.getAttribute("some");%>

<head>
    <link rel="stylesheet" href="css/home.css">
    <link rel="stylesheet" href="css/modal.css">
    <script type="text/javascript" src="javascript/inputFunction.js"></script>

</head>
<body>
<div class="main">
    <div class="mainImage">
        <img src="images/cigar.png">
    </div>
    <div class="howMuch">
        I smokes <input type="text" name="txt"  onkeypress="checkInput(this.value)"> a day
    </div>
    <div class="buttons">

            <c:forEach items="${some}" var = "t">
                <img src="${t.url}" onclick="imageClick()">
            </c:forEach>
    </div>
    <div class="addButtonArea">
        <button id="addButton">click!</button>
    </div>
    <div id="modal" class="modal">        <!-- Modal content -->
        <div class="modal-content">
            <span class="close">&times;</span>
            <%--@elvariable id="some" type=""--%>
            <form action="/submitSome" method="post" enctype="multipart/form-data">
                Title:<input name="title"/><br>
                Price:<input name="price"/><br>
                <input type="file" name="file" />
                <br>
                <input type="submit"/>
            </form>
        </div>

    </div>

</div>
<script type="text/javascript" src="./javascript/modal.js"></script>
</body>


</html>
