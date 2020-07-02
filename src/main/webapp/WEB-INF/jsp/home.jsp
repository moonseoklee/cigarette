<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="./css/home.css">
    <link rel="stylesheet" href="./css/modal.css">
    <script type="text/javascript" src="./javascript/inputFunction.js"></script>

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
        <img src="images/car.png" onclick="imageClick()">
        <img src="images/car.png" onclick="">
        <img src="images/car.png" onclick="">
    </div>
    <div class="addButtonArea">
        <button id="addButton">click!</button>
    </div>
    <div id="modal" class="modal">        <!-- Modal content -->
        <div class="modal-content">
            <span class="close">&times;</span>
            <p>Some text in the Modal..</p>
        </div>

    </div>

</div>
<script type="text/javascript" src="./javascript/modal.js"></script>
</body>


</html>
