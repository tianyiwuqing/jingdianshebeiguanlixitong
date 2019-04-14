<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>添加订单</title>
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
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <script type="text/javascript">

        function add() {
            alert("是否提交报废单");
            $("#addscrap").submit();
            //获得frame索引
            var index = parent.layer.getFrameIndex(window.name);
            //关闭当前frame
            parent.layer.close(index);
        }

        //报废处理
        function baofeidianji (obj,obj1,obj2) {
            var did;
            var nr=$("#tbody").find("td[id="+obj+"]").text();
            var shopdepartmentId=$("#shopdepartmentId").val();
            $("#equipmentcode").val(nr);
            $("#equipmentid").val(obj2);
            if (obj1===0){
                $("#departmentId").val(shopdepartmentId);
                did=shopdepartmentId;
            } else{
                $("#departmentId").val(obj1);
                did=obj1;
            }
            $("#auditor").find('option').remove();
            var option = "<option value='0'>-请选择-</option>";
            $("#auditor").append(option);
            $.ajax({
                type: "GET",
                url: "${pageContext.request.contextPath}/equipmentAddController/departmentOfEmployee",
                data: {
                    "did": did
                },
                dataType: "json",
                success: function (returnData) {
                    $(returnData).each(function (index, item) {
                        var option = "<option value=" + item.id + ">" + item.employeename + "</option>";
                        $("#responsible").append(option);
                    })
                },
                error: function (error) {
                    console.log("error!")
                }
            });
            //审核人员ajax
            $(function () {
                $.ajax({
                    type: "GET",
                    url: "${pageContext.request.contextPath}/srcapController/chaOfKeyEmployee",
                    dataType: "json",
                    success: function (returnData) {
                        console.log(returnData)
                        $(returnData).each(function (index, item) {
                            var option = "<option value=" + item.id + ">" + item.employeename + "</option>";
                            $("#auditor").append(option);
                        })
                    },
                    error: function () {
                        console.log("error！")
                    }
                })
            });
        }

        //查询
        function souceRepertory() {
            var sbfl = $("#equipmentType").val();
            var bmid = $("#shopdepartmentId").val();
            $("#tbody").find('tr').remove();
            var optiontitle = "<tr>" +
                "<td>编号</td>" +
                "<td>设备编号</td>" +
                "<td>设备名</td>" +
                "<td>仓库</td>" +
                "<td>设备状态</td>" +
                "<td>操作</td>" +
                "</tr>";
            $("#tbody").append(optiontitle);
            $.ajax({
                type: "GET",
                url: "${pageContext.request.contextPath}/srcapController/chaSoure",
                data: {
                    "sbfl": sbfl,
                    "bmid": bmid
                },
                dataType: "json",
                success: function (returndate) {
                    if (returndate !== null) {
                        var i = 0;
                        $(returndate).each(function (index, item) {
                            i++;
                            var option = " <tr >" +
                                "<td>" + i + "</td>\n" +
                                "<td id='" + item.id + "' >" + item.equipmentuniquecode + "</td>\n" +
                                "<td>" + item.equipment.equipmentName + "</td>\n" +
                                "<td>" + item.storage.name + "</td>\n" +
                                "<td>" + item.startstr + "</td>\n" +
                                "<td class='td-status'>" +
                                "<span class='layui-btn layui-btn-normal layui-btn-mini' onclick='baofeidianji("+item.id+","+item.departmentOutId+","+item.equipmentId+")' id='button'>报废处理</span></td>" +
                                "</tr>";
                            $("#tbody").append(option);
                        });
                    }
                },
                error: function (returndate) {
                    console.log(returndate + "error!")
                }
            });
        }


        //根据部门id查找人员信息
        function employeeChang() {
            var receivedepartmentid = $("#receivedepartmentid").val();
            $.ajax({
                type: "GET",
                url: "${pageContext.request.contextPath}/equipmentAddController/departmentOfEmployee",
                data: {
                    "did": receivedepartmentid
                },
                dataType: "json",
                success: function (returnData) {
                    $(returnData).each(function (index, item) {
                        var option = "<option value=" + item.id + ">" + item.employeename + "</option>";
                        $("#auditor").append(option);
                    })
                },
                error: function (error) {
                    console.log("error!")
                }
            })
        }


    </script>
</head>

<body>
<div class="x-body">
    <div class="layui-form-item">
        <label for="shopdepartmentId" class="layui-form-label">
            <span class="x-red">*</span>所属部门
        </label>
        <div class="layui-input-inline">
            <select name="shopdepartmentId" id="shopdepartmentId">
                <option value="0">-请选择-</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label for="equipmentType" class="layui-form-label">
            <span class="x-red">*</span>设备分类
        </label>
        <div class="layui-input-inline">
            <select name="equipmentType" id="equipmentType">
                <option value="0">-请选择-</option>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label for="sourcebutton" class="layui-form-label">
        </label>
        <button id="sourcebutton" onclick="souceRepertory()" class="layui-btn">
            查询
        </button>
    </div>
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
                    <td>仓库</td>
                    <td>设备状态</td>
                    <td>加入单据</td>
                    <td>备注</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
    <form id="addscrap" method="post"
          action="${pageContext.request.contextPath}/srcapController/addScrapbills">
        <div class="layui-form-item">
            <label for="scrapbills" class="layui-form-label">
                <span class="x-red">*</span>单据编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="scrapbills" name="scrapbills" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="display: none">
            <label for="equipmentid" class="layui-form-label">
                <span class="x-red">*</span>设备id
            </label>
            <div class="layui-input-inline">
                <input type="text" id="equipmentid" name="equipmentid" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="equipmentcode" class="layui-form-label">
                <span class="x-red">*</span>设备唯一码
            </label>
            <div class="layui-input-inline">
                <input type="text" id="equipmentcode" name="equipmentcode" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div  class="layui-form-item" style="display: none">
            <label for="departmentId" class="layui-form-label">
                <span class="x-red">*</span>审核部门
            </label>
            <div class="layui-input-inline">
                <input type="text" id="departmentId" name="departmentId" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div  class="layui-form-item">
            <label for="responsible" class="layui-form-label">
                <span class="x-red">*</span>经办人
            </label>
            <div class="layui-input-inline">
                <select name="responsible" id="responsible">
                    <option value="0">-请选择-</option>
                </select>
            </div>
        </div>
        <div  class="layui-form-item">
            <label for="auditor" class="layui-form-label">
                <span class="x-red">*</span>审核人员
            </label>
            <div class="layui-input-inline">
                <select name="auditor" id="auditor">
                    <option value="0">-请选择-</option>
                </select>
            </div>
        </div>
        <div  class="layui-form-item">
            <label for="auditTime" class="layui-form-label">
                <span class="x-red">*</span>审核日期
            </label>
            <div class="layui-input-inline">
                <input type="date" id="auditTime" name="auditTime" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div  class="layui-form-item">
            <label for="scrapTime" class="layui-form-label">
                <span class="x-red">*</span>报废时间
            </label>
            <div class="layui-input-inline">
                <input type="date" id="scrapTime" name="scrapTime" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div  class="layui-form-item">
            <label for="createbillsemployeeid" class="layui-form-label">
                <span class="x-red">*</span>制单人
            </label>
            <div class="layui-input-inline">
                <select name="createbillsemployeeid" id="createbillsemployeeid">
                    <option value="0">-请选择-</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="scrapAbstract" class="layui-form-label">
                <span class="x-red">*</span>单据摘要
            </label>
            <div class="layui-input-inline">
                <input type="text" id="scrapAbstract" name="scrapAbstract" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div  class="layui-form-item">
            <label for="createTime" class="layui-form-label">
                <span class="x-red">*</span>创建时间
            </label>
            <div class="layui-input-inline">
                <input type="date" id="createTime" name="createTime" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
    </form>
    <div class="layui-form-item">
        <label for="addbutton" class="layui-form-label">
        </label>
        <button id="addbutton" onclick="add()" class="layui-btn">
            报废单提交
        </button>
    </div>
</div>
<script type="text/javascript">
    //部门ajax
    $(function () {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/equipmentAddController/chaAllDepartment",
            dataType: "json",
            success: function (returnData) {
                $(returnData).each(function (index, item) {
                    var option = "<option value=" + item.id + ">" + item.name + "</option>";
                    $("#receivedepartmentid").append(option);
                    $("#shopdepartmentId").append(option);
                })
            },
            error: function () {
                console.log("error！")
            }
        })
    });
    //设备分类ajax
    $(function () {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/equipmentAddController/chaEquipmentType",
            dataType: "json",
            success: function (returnData) {
                $(returnData).each(function (index, item) {
                    var option = "<option value=" + item.id + ">" + item.name + "</option>";
                    $("#equipmentType").append(option);
                })
            },
            error: function () {
                console.log("error！")
            }
        })
    });
    //登账人员ajax
    $(function () {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/delRepertoryController/chaOfKeyStong",
            dataType: "json",
            success: function (returnData) {
                $(returnData).each(function (index, item) {
                    var option = "<option value=" + item.id + ">" + item.employeename + "</option>";
                    $("#createbillsemployeeid").append(option);
                })
            },
            error: function () {
                console.log("error！")
            }
        })
    });

</script>

</body>

</html>