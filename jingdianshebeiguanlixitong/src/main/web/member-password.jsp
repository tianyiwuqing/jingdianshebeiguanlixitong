<%@ page import="com.lynu.bean.TableEmployee" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="x-admin-sm">

<head>
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.1</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/xadmin.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/cookie.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
<div class="x-body">
    <form>
        <div class="layui-form-item">
            <label for="L_username" class="layui-form-label">
                昵称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_username" name="username" disabled=""
                       value="${sessionScope.LoginUser.username}" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="name" class="layui-form-label">
                <span class="x-red">*</span>真实姓名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="name" name="name" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${sessionScope.LoginUser.employeename}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="sex" class="layui-form-label">
                <span class="x-red">*</span>性别${sessionScope.LoginUser.sex};
            </label>
            <div class="layui-form-item">
                <%
                    TableEmployee employee = (TableEmployee) session.getAttribute("LoginUser");
                    int sexid = employee.getSex();
                    if (sexid == 0) {
                        session.setAttribute("Sex", "男");
                    } else {
                        session.setAttribute("Sex", "女");
                    }
                %>
                <input type="text" id="sex" name="sex" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value='${sessionScope.Sex}'>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="telephone" class="layui-form-label">
                <span class="x-red">*</span>电话
            </label>
            <div class="layui-input-inline">
                <input type="text" id="telephone" name="telephone" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${sessionScope.LoginUser.telephone}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="department" class="layui-form-label">
                <span class="x-red">*</span>部门
            </label>
            <div class="layui-input-inline">
                <input type="text" id="department" name="department" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${sessionScope.LoginUser.department.name}">
            </div>
        </div>
    </form>
</div>
<script>

</script>
<script>

</script>
</body>

</html>