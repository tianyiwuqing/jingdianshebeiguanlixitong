<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>部门信息列表</title>
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
    <script type="text/javascript">
        //仓库列表数量
        $(function () {
            $.ajax({
                type: "GET",
                url: "${pageContext.request.contextPath}/departmentController/departCount",
                dataType: "json",
                success: function (returnData) {
                    console.log(returnData);
                },
                error: function () {
                    console.log("error！")
                }
            })
        });
    </script>
</head>

<body>
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">基础信息管理</a>
        <a>
          <cite>组织管理</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <xblock>
        <button class="layui-btn" onclick="x_admin_show('添加设备','./management-department-add.jsp',600,400)"><i class="layui-icon"></i>添加
        </button>
        <span class="x-right" style="line-height:40px">共有数据：${sessionScope.departCount} 条</span>
    </xblock>
    <table id="" class="layui-table x-admin">
        <thead>
        <tr>
            <th>序号</th>
            <th>部门名称</th>
            <th>部门地址</th>
            <th>部门电话</th>
            <th>负责人</th>
            <th>状态</th>
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

    /*部门-删除*/
    function departmentDelete(obj) {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/departmentController/delDepartment",
            data: {"did": obj},
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

    //部门列表chadepartment
    $(function () {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/departmentController/chaAllDepartment",
            dataType: "json",
            success: function (returnData) {
                var i = 0;
                $(returnData).each(function (index, item) {
                    i++;
                    var option = "<tr id='" + item.id + "'>" +
                        "<td>" + i + "</td>" +
                        "<td>" + item.name + "</td>" +
                        "<td>" + item.address + "</td>" +
                        "<td>" + item.telephone + "</td>" +
                        "<td>" + item.employee.employeename + "</td>" +
                        "<td class='td-status'>" +item.isDeleteStr+"</td>" +
                        "<td class='td-manage'>" +
                        "<a title='编辑'  onclick=\"x_admin_show('编辑','${pageContext.request.contextPath}/departmentController/chaOfKeyEquipment?did="+item.id+"')\" href='javascript:;'>" +
                        "<i class='layui-icon'>" +
                        "&#xe642;" +
                        "</i>" +
                        "<a title='废除' onclick='member_del(this,'要删除的id')' href='javascript:departmentDelete("+item.id +");'> " +
                        "<i class='layui-icon'>&#xe640;</i> " +
                        "</a> " +
                        "</td> " +
                        "<td></td> " +
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