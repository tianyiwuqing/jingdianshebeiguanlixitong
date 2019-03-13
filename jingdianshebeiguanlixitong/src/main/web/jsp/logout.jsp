<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/28 0028
  Time: 下午 3:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>退出登录</title>

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
        #p p{
            margin-top: 80px;
        }
        #p a{
            text-decoration: none;
        }
        #p a:hover{
            color: #985f0d;
            font-size: 16px;
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
        真的要退出系统吗？
        <br>
        <p>
            <a href="newindex.html" style="margin: 10px">确认</a>
            <a href="" style="margin: 10px">放弃</a>
        </p>

    </div>
</div>

<script>
    $('#p').panel({
        width:350,
        height:200,
        title: '提示信息',
        tools: [{
            iconCls:'icon-no',
        }]
    });
</script>

</body>
</html>