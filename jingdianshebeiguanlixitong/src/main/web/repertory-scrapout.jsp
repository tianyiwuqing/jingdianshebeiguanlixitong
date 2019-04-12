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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-2.1.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/xadmin.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/cookie.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript">
        //表单提交
        function scrapRepertory(obj) {
            alert("是否入库");
            $.ajax({
                type:"GET",
                url:"${pageContext.request.contextPath}/srcapController/delOutRepertory",
                data:{"rid":obj},
                dataType:"json",
                success:function (returndate) {
                    if (returndate){
                        $("#tbody").find("tr[id="+obj+"]").remove();
                    }
                },
                error:function (returndate) {
                    console.log(returndate+"error!")
                }
            });
            var index = parent.layer.getFrameIndex(window.name);
            parent.layer.close(index);
        }
    </script>
</head>

<body>
<div class="x-body">
    <div class="layui-form-item layui-form-text">
        <label for="" class="layui-form-label">
            添加列单
        </label>
        <div class="layui-input-block">
            <table class="layui-table">
                <tbody id="tbody">
                <tr>
                    <td>编号</td>
                    <td>设备编号</td>
                    <td>设备名</td>
                    <td>设备状态</td>
                    <td>操作</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<script>
    $(function () {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/srcapController/chaOfDeleterScrap",
            dataType: "json",
            success: function (returnData) {
                var i = 0;
                console.log(returnData);
                $(returnData).each(function (index, item) {
                    i++;
                    var option = "<tr id="+item.id+">" +
                        "<td>" + i + "</td>" +
                        "<td>" + item.equipmentuniquecode + "</td>" +
                        "<td>" + item.equipment.equipmentName + "</td>" +
                        "<td>" + item.isDeleterStr + "</td>" +
                        "<td>" +
                        "<button id='addbutton' onclick='scrapRepertory(" + item.id + ")' class='layui-btn'>" +
                        "报废" +
                        "</button>" +
                        "</td>" +
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
})();</script>
</body>

</html>