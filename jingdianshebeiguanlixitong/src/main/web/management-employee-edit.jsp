<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>添加员工</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    <script type="text/javascript" src="./js/jquery-2.1.1/jquery.min.js"></script>
    <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
    <script type="text/javascript" src="./js/cookie.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
        //表单提交
        function add() {
            alert("是否修改员工");
            $("#addemployee").submit();
//                 获得frame索引
            var index = parent.layer.getFrameIndex(window.name);
            //关闭当前frame
            parent.layer.close(index);
        }

    </script>
</head>

<body>
<div class="x-body">
    <form  id="addemployee" method="post"
          action="${pageContext.request.contextPath}/EmployeeController/addEmployee">
        <div class="layui-form-item" style="display: none">
            <label for="id" class="layui-form-label">
                <span class="x-red">*</span>员工编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="id" name="id" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${sessionScope.tableEmployee.id}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="employeename" class="layui-form-label">
                <span class="x-red">*</span>员工姓名
            </label>
            <div class="layui-input-inline" >
                <input type="text" id="employeename" name="employeename" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${sessionScope.tableEmployee.employeename}">
            </div>
        </div>
        <div class="layui-form-item">
            <%--@declare id="username"--%><label for="username" class="layui-form-label">
            <span class="x-red">*</span>用户名
        </label>
            <div class="layui-input-inline">
                <input type="text" id="username" name="username" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${sessionScope.tableEmployee.username}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="newsex" class="layui-form-label">
                <span class="x-red">*</span>性别
            </label>
            <div class="layui-input-inline">
                <input name="sex" value="${sessionScope.tableEmployee.sex}">
                <select id="newsex" name="newsex" class="valid">
                    <option value="0">-男-</option>
                    <option value="1">-女-</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="password" class="layui-form-label">
                <span class="x-red">*</span>密码
            </label>
            <div class="layui-input-inline">
                <input type="text" id="password" name="password" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${sessionScope.tableEmployee.password}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="telephone" class="layui-form-label">
                <span class="x-red">*</span>电话
            </label>
            <div class="layui-input-inline">
                <input type="text" id="telephone" name="telephone" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="address" class="layui-form-label">
                <span class="x-red">*</span>地址
            </label>
            <div class="layui-input-inline">
                <input type="text" id="address" name="address" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="departmentId" class="layui-form-label">
                <span class="x-red">*</span>部门
            </label>
            <div class="layui-input-inline">
                <select name="departmentId" id="departmentId">
                    <option value="0">-请选择-</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="isLeader" class="layui-form-label">
            <span class="x-red">*</span>是否是领导
        </label>
            <div class="layui-input-inline">
                <select name="isLeader" id="isLeader">
                    <option value="0">-否-</option>
                    <option value="1">-是-</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="isValid" class="layui-form-label">
                <span class="x-red">*</span>是否禁用
            </label>
            <div class="layui-input-inline">
                <select name="isValid" id="isValid">
                    <option value="0">-正常-</option>
                    <option value="1">-禁用-</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="delFlag" class="layui-form-label">
                <span class="x-red">*</span>删除标志
            </label>
            <div class="layui-input-inline">
                <select name="delFlag" id="delFlag">
                    <option value="0">正常</option>
                    <option value="1">已删除</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item layui-form-text">
            <label for="description" class="layui-form-label">
                描述
            </label>
            <div class="layui-input-block">
                <textarea placeholder="请输入内容" id="description" name="description"
                          class="layui-textarea"></textarea>
            </div>
        </div>
    </form>
    <div class="layui-form-item">
        <label for="addbutton" class="layui-form-label">
        </label>
        <button id="addbutton" onclick="add()" class="layui-btn">
            增加
        </button>
    </div>
</div>
<script>

    //部门ajax
    $(function () {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/equipmentAddController/chaAllDepartment",
            dataType: "json",
            success: function (returnData) {
                console.log("ajax on");
                $(returnData).each(function (index, item) {
                    var option = "<option value=" + item.id + ">" + item.name + "</option>";
                    $("#departmentId").append(option);
                })
            },
            error: function () {
                console.log("error！")
            }
        })
    });


</script>
<script>var _hmt = _hmt || [];
(function () {
    var hm = document.createElement("script");
    hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();</script>
</body>

</html>