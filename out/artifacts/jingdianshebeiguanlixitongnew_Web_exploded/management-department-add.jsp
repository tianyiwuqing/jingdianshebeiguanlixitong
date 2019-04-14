<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>添加订单</title>
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
            alert("是否添加该部门");
            $("#adddepartment").submit();
//                 获得frame索引
            var index = parent.layer.getFrameIndex(window.name);
            //关闭当前frame
            parent.layer.close(index);
        }

    </script>
</head>

<body>
<div class="x-body">
    <form  id="adddepartment" method="post"
          action="${pageContext.request.contextPath}/departmentController/addDepartment">
        <div class="layui-form-item" style="display: none">
            <label for="id" class="layui-form-label">
                <span class="x-red">*</span>组织机构id
            </label>
            <div class="layui-input-inline">
                <input type="text" id="id" name="id" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="name" class="layui-form-label">
            <span class="x-red">*</span>部门名称
        </label>
            <div class="layui-input-inline">
                <input type="text" id="name" name="name" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="address" class="layui-form-label">
                <span class="x-red">*</span>部门地址
            </label>
            <div class="layui-input-inline">
                <input type="text" id="address" name="address" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="telephone" class="layui-form-label">
                <span class="x-red">*</span>部门电话
            </label>
            <div class="layui-input-inline">
                <input type="text" id="telephone" name="telephone" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="departmentdescribe" class="layui-form-label">
                <span class="x-red">*</span>部门概要
            </label>
            <div class="layui-input-inline">
                <input type="text" id="departmentdescribe" name="departmentdescribe" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="ownemployee" class="layui-form-label">
                <span class="x-red">*</span>负责人
            </label>
            <div class="layui-input-inline">
                <select name="ownemployee" id="ownemployee">
                    <option value="0">-请选择-</option>
                </select>
            </div>
        </div>
    </form>
    <div class="layui-form-item">
        <label for="addbutton" class="layui-form-label">
        </label>
        <button id="addbutton" onclick="add()" class="layui-btn">
            增加部门
        </button>
    </div>
    </form>
</div>
<script>



    //员工ajax
    $(function () {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/departmentController/chaAllEmployee",
            dataType: "json",
            success: function (returnData) {
                $(returnData).each(function (index, item) {
                    var option = "<option value=" + item.id + ">" + item.employeename + "</option>";
                    $("#ownemployee").append(option);
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