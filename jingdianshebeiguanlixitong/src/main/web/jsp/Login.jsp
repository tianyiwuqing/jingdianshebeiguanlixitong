<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/28 0028
  Time: 下午 3:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>重新登录</title>
    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../jquery-easyui-1.3.5/themes/default/easyui.css">
    <link rel="stylesheet" href="../jquery-easyui-1.3.5/themes/icon.css">
    <script type="text/javascript" src="../jquery-easyui-1.3.5/jquery.min.js"></script>
    <script type="text/javascript" src="../jquery-easyui-1.3.5/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../jquery-easyui-1.3.5/locale/easyui-lang-zh_CN.js"></script>
    <style>
        #p{
            text-align: center;
        }
        input{
            margin: 2px;
        }
        span{
            margin-top: 15px;
            margin-right: 20px;
            display: inline-block;
            width: 50px;
            height: 30px;
            line-height: 30px;
            border: #0f0f0f;
            background-color: #c7ddef;
            border-radius: 4px;
        }
        #p a{
            text-decoration: none;
        }
        #out{
            margin-left: 500px;
            margin-top: 100px;
        }
    </style>
</head>
<body>
<div id="out">
    <div id="p" style="padding:10px;" >
        <h2>医疗设备管理系统</h2>
        <br>
        <form action="LoginController/login">
            <input name="user"  type="text" value="Admin">
            <br>
            <input name="password"  type="password">
            <br>
            <span><input href="index.jsp"><img src="../jquery-easyui-1.3.5/themes/icons/ok.png"> 登录</input></span>
            <span><a href="index.jsp"><img src="../jquery-easyui-1.3.5/themes/icons/no.png"> 放弃</a></span>
        </form>

    </div>
</div>

<script>
    $('#p').panel({
        width:400,
        height:230,
        title: '系统登录',
        tools: [{
            iconCls:'icon-no',
        }]
    });
</script>

</body>
</html>
