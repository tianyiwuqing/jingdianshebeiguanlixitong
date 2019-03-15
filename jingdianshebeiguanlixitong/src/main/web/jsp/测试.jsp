<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <title>超出部分隐藏滚动条</title>
   <script type="text/javascript" src="../js/jquery-2.1.1/jquery.min.js"/>
    <script type="text/javascript">
        function save() {
            $("#form1").submit();
        }
    </script>
</head>

<style type="text/css">
    #box {
        width: 500px;
        height: 300px;
        overflow-x: hidden;
        overflow-y: scroll;
        line-height: 30px;
        text-align: center;
        border: 1px solid red;
    }

    #box::-webkit-scrollbar {
        display: none;
    }

    #table {
        width: 600px;
        overflow-x: scroll;
        border: 1px solid black;
    }

    #table tr {
        display: block;
        width: 100px;
        background-color: rgba(255, 0, 0, 0.3);
        color: #00ee00;
        overflow-x: scroll;
        height: 130px;
    }

    #table tr td {
        display: inline-block;
        width: 120px;
        height: 30px;
        border: 1px solid red;
    }
</style>
<body>
<!-- 兼容所有浏览器的超出部分滚动不显示滚动条 -->

<a href="${pageContext.request.contextPath}/equipmentAddController/addEquipment" >点击</a>

<form id="form1" action="${pageContext.request.contextPath}/equipmentAddController/test">
    <input name="name" type="text"><br>
    <input name="passwords" type="text"><br>
</form>
<a href="javascript:save()">添加</a>

</body>
</html>