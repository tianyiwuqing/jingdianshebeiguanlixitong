<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>职工信息表单</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/xadmin.css">
    <script type="text/javascript" src="./js/jquery-2.1.1/jquery.min.js"></script>
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
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">基础信息管理</a>
        <a>
          <cite>员工信息列表</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <xblock>
        <button class="layui-btn" onclick="x_admin_show('添加员工','./management-employee-add.jsp',600,400)"><i class="layui-icon"></i>员工添加
        </button>
        <span class="x-right" style="line-height:40px">共有数据：${sessionScope.EmployeeCount} 条</span>
    </xblock>
    <table id="" class="layui-table x-admin">
        <thead>
        <tr>
            <th>序号</th>
            <th>员工编号</th>
            <th>员工姓名</th>
            <th>性别</th>
            <th>电话</th>
            <th>地址</th>
            <th>禁用状态</th>
            <th>领导人员</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="tbody">
        <%--ajax添加列表--%>
        </tbody>
    </table>
</div>
<script>
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
            elem: '#end' //指定元素
        });
    });

    /*员工-删除*/
    function delEmployee(obj) {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/EmployeeController/delEmployee",
            data: {"eid": obj},
            dataType: "json",
            success: function (returnData) {
                if (returnData) {
                    $("#tbody").find("tr[id=" + obj + "]").remove()
                }
            },
            error: function () {
                console.log("error！")
            }
        })
    }

    /*员工-禁用*/
    function updateEmployee(obj) {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/EmployeeController/uodateEmployee",
            data: {"eid": obj},
            dataType: "json",
            success: function (returnData) {
                if (returnData) {
                    window.location.reload();
                }
            },
            error: function () {
                console.log("error！")
            }
        })
    }

    //设备添加员工列表chaAddequipmentbills
    $(function () {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/EmployeeController/chaAllEmployee",
            dataType: "json",
            success: function (returnData) {
                var i = 0;
                console.log(returnData);
                $(returnData).each(function (index, item) {
                    i++;
                    var option = "<tr id='" + item.id + "'>" +
                        "<td>" + i + "</td>" +
                        "<td>" + item.id + "</td>" +
                        "<td>" + item.employeename.name + "</td>" +
                        "<td>" + item.sexStr + "</td>" +
                        "<td>" + item.telephone + "</td>" +
                        "<td>" + item.address + "</td>" +
                        "<td class='td-status'>" +item.isValidStr+"</td>" +
                        "<td class='td-status'>" +item.isLeaderStr+"</td>" +
                        "<td class='td-manage'>" +
                        "<a title='编辑'  onclick=\"x_admin_show('编辑','${pageContext.request.contextPath}/equipmentAddController/chaKeyAddEquipment?aid="+item.id+"')\" href='javascript:;'>" +
                        "<i class='layui-icon'>&#xe642;</i>" +
                        "</a> " +
                        "<a title='删除' onclick='member_del(this,'要删除的id')' href='javascript:delEmployee("+item.id +");'> " +
                        "<i class='layui-icon'>&#xe640;</i> " +
                        "</a> " +
                        "<a title='禁用' onclick='member_del(this,'要禁用的id')' href='javascript:updateEmployee("+item.id +");'> " +
                        "<i class='layui-icon'>&#xe640;</i> " +
                        "</a> " +
                        "</td> " +
                        "</tr>";
                    $("#tbody").append(option);
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
})();

</script>
</body>

</html>