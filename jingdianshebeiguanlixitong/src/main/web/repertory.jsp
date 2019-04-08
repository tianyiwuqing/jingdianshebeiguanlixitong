<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>库存界面-向阳花医疗设备管理系统</title>
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
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <script type="text/javascript">
        //仓库列表数量
        $(function () {
            $.ajax({
                type: "GET",
                url: "${pageContext.request.contextPath}/repertoryController/chaCount",
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
        <a href="">库存管理</a>
        <a>
          <cite>仓库设备列表</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <%--<div class="layui-row">--%>
        <%--<form class="layui-form layui-col-md12 x-so">--%>
            <%--<input class="layui-input" autocomplete="off" placeholder="开始日" name="start" id="start" type="date">--%>
            <%--<input class="layui-input" autocomplete="off" placeholder="截止日" name="end" id="end" type="date">--%>
            <%--<button class="layui-btn" lay-submit="" onclick="sreach()" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>--%>
        <%--</form>--%>
    <%--</div>--%>
    <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <button class="layui-btn" onclick="x_admin_show('添加设备','./repertory-add.jsp',600,400)"><i class="layui-icon"></i>入库
        </button>
        <span id="count" class="x-right" style="line-height:40px">共有数据：${sessionScope.count} 条</span>
    </xblock>
    <table id="" class="layui-table x-admin">
        <thead >
        <tr>
            <th>
                <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i
                        class="layui-icon">&#xe605;</i></div>
            </th>
            <th>序号</th>
            <th>设备编号</th>
            <th>设备名称</th>
            <th>状态</th>
            <th>所属部门</th>
            <th>责任人</th>
            <th>存放位置</th>
            <th>生产日期</th>
            <th>详细配置</th>
            <th>品牌</th>
            <th>生产厂家</th>
            <th>购置日期</th>
            <th>供应商</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="tbody">
        <%--ajax添加列表--%>
        </tbody>
    </table>
    <%--<div class="page">--%>
        <%--<div>--%>
            <%--<a class="prev" href="">&lt;&lt;</a>--%>
            <%--<a class="num" href="">1</a>--%>
            <%--<span class="current">2</span>--%>
            <%--<a class="num" href="">3</a>--%>
            <%--<a class="num" href="">489</a>--%>
            <%--<a class="next" href="">&gt;&gt;</a>--%>
        <%--</div>--%>
    <%--</div>--%>

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
    /*库存-时间-查询*/
    function sreach() {
       var start= $("#start").val();
       var end= $("#end").val();
       console.log(start+":"+end);
        $(function () {
            $.ajax({
                type: "GET",
                url: "${pageContext.request.contextPath}/repertoryController/chaDateAddEquipmentbills",
                data:{"startTime":start,"endTime":end},
                dataType: "json",
                success: function (returnData) {
                    var i = 0;
                    console.log(returnData);
                    $("#tbody").find("tr").remove();
                    $(returnData).each(function (index, item) {
                        i++;
                        var option = "<tr id='" + item.id + "'>" +
                            "<td>" +
                            "<div class='layui-unselect layui-form-checkbox' lay-skin='primary' data-id='2'><i class='layui-icon'>&#xe605;</i></div>" +
                            "</td>" +
                            "<td>" + i + "</td>" +
                            "<td>" + item.billsnumber + "</td>" +
                            "<td>" + item.furnish.name + "</td>" +
                            "<td>" + item.abstractdetails + "</td>" +
                            "<td>" + item.createTime + "</td>" +
                            "<td>" + item.billsEmployee.employeename + "</td>" +
                            "<td class='td-status'>" +item.isDelate+"</td>" +
                            "<td class='td-manage'>" +
                            "<a title='编辑'  onclick='x_admin_show('编辑','member-edit.html',600,400)' href='javascript:;'>" +
                            "<i class='layui-icon'>" +
                            "&#xe642;" +
                            "</i>" +
                            "<a title='删除' onclick='member_del(this,'要删除的id')' href='javascript:addBillsDelete("+item.id +");'> " +
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
    }

    /*库存-删除*/
    function repertoryDelete(obj) {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/repertoryController/delRepertory",
            data: {"rid": obj},
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

    //仓库列表chaAllRepertory
    $(function () {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/repertoryController/chaAllRepertory",
            dataType: "json",
            success: function (returnData) {
                var i = 0;
                console.log(returnData);
                $(returnData).each(function (index, item) {
                    i++;
                    var option = "<tr id="+item.id+">" +
                        " <th>" +
                        "<div class=\"layui-unselect header layui-form-checkbox\" lay-skin=\"primary\"><i\n" +
                        "                        class=\"layui-icon\">&#xe605;</i></div>" +
                        "</th>" +
                        "<th>"+i+"</th>\n" +
                        "<th>"+item.equipmentuniquecode+"</th>" +
                        "<th>"+item.equipment.equipmentName+"</th>" +
                        "<th>"+item.state+"</th>\n" +
                        "<th>"+item.department.name+"</th>" +
                        "<th>"+item.functionaryEmployee.employeename+"</th>" +
                        "<th>"+item.storage.name+"</th>\n" +
                        "<th>"+item.equipment.equipmentDetalis.productdate+"</th>" +
                        "<th>"+item.equipment.equipmentDetalis.equipmentDetails+"</th>" +
                        "<th>"+item.equipment.equipmentDetalis.equipmentBrand+"</th>" +
                        "<th>"+item.equipment.equipmentDetalis.tableManufacturer.name+"</th>" +
                        "<th>"+item.shopTime+"</th>" +
                        "<th>"+item.furnish.name+"</th>" +
                        "<th class='td-manage'>" +
                        "<a title='编辑'  onclick=\"x_admin_show('编辑','${pageContext.request.contextPath}/equipmentAddController/chaKeyAddEquipment?aid="+item.id+"')\" href='javascript:;'>" +
                        "<i class='layui-icon'>" +
                        "&#xe642;" +
                        "</i>" +
                        "</th> " +
                        "</tr>";
                    $("#tbody").append(option);
                })
            },
            error: function () {
                console.log("error！")
            }
        })
    });


    //删除全部
    function delAll() {
            $.ajax({
                type: "GET",
                url: "${pageContext.request.contextPath}/repertoryController/delAllRepertory",
                dataType: "json",
                success: function (returnData) {
                    if (returnData) {
                        layer.msg('删除成功', {icon: 1});
                        $("#tbody").find("tr").remove();
                    }
                },
                error: function () {
                    console.log("error！")
                }
            })
        }
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