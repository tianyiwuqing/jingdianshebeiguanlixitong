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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.1/jquery.min.js"></script>
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
                url: "${pageContext.request.contextPath}/delRepertoryController/chacount",
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
        <a href="">出库管理</a>
        <a>
          <cite>出库订单列表</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <button class="layui-btn" onclick="x_admin_show('添加设备','./repertory-addout.jsp',600,400)"><i class="layui-icon"></i>借出出库</button>
        <button class="layui-btn" onclick="x_admin_show('添加设备','./repertory-scrapout.jsp',600,400)"><i class="layui-icon"></i>报废出库</button>
        <span id="count" class="x-right" style="line-height:40px">共有数据：${sessionScope.deRepertorycount} 条</span>
    </xblock>
    <table id="" class="layui-table x-admin">
        <thead >
        <tr>
            <th>
                <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i
                        class="layui-icon">&#xe605;</i></div>
            </th>
            <th>序号</th>
            <th>单据编号</th>
            <th>摘要</th>
            <th>领用部门</th>
            <th>领用人员</th>
            <th>制单时间</th>
            <th>制单人</th>
            <th>单据状态</th>
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


    /*库存-删除*/
    function repertoryDelete(obj) {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/delRepertoryController/delKeyIdDelRepertory",
            data: {"did": obj},
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

    //出库列表chaAllRepertoryOut
    $(function () {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/delRepertoryController/chaAllRepertoryOut",
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
                        "<th>"+item.repertoryoutbills+"</th>" +
                        "<th>"+item.codeabstract+"</th>" +
                        "<th>"+item.receiveDepartment.name+"</th>\n" +
                        "<th>"+item.receiveEmployee.employeename+"</th>" +
                        "<th>"+item.createTime+"</th>\n" +
                        "<th>"+item.createEmployee.employeename+"</th>" +
                        "<th>"+item.isDelate+"</th>" +
                        "<th class='td-manage'>" +
                        "<a title='删除' onclick='member_del(this,'要删除的id')' href='javascript:repertoryDelete("+item.id +");'> " +
                        "<i class='layui-icon'>&#xe640;</i> " +
                        "</a> " +
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
                url: "${pageContext.request.contextPath}/delRepertoryController/delAllDelRepertory",
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