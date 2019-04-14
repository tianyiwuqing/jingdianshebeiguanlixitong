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
        //表单提交
        function update() {
            alert("是否保存修改");
            $("#addequipment").submit();
//                 获得frame索引
            var index = parent.layer.getFrameIndex(window.name);
            //关闭当前frame
            parent.layer.close(index);
        }

        //选择select控件
        function employeeChang() {
            var obj = $("#departmentId").val();
            console.log(obj+"employeechang ok");
            $.ajax({
                type: "POST",
                url: "${pageContext.request.contextPath}/equipmentAddController/departmentOfEmployee",
                data: {"did": obj},
                dataType: "json",
                success: function (returnData) {
                    // $("#receptionperson").empty();
                    // $("#receptionperson").append("<option value='0'>-请选择-</option>");
                    console.log(returnData);
                    $(returnData).each(function (index, item) {
                        var option = "<option value='" + item.id + "'>" + item.employeename + "</option>";
                        $("#receptionperson").append(option);
                    })
                },
                error: function () {
                    console.log("error！")
                }
            })
        }

        function employeeChang1() {
            console.log("employeechang1 ok");
        }
    </script>
</head>

<body>
<div class="x-body">
    <form  id="addequipment" method="post"
          action="${pageContext.request.contextPath}/equipmentAddController/updateEquipment">
        <div class="layui-form-item">
            <label for="billsnumber" class="layui-form-label">
                <span class="x-red">*</span>单据编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="billsnumber" name="billsnumber" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${addequipmentbills.billsnumber}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="departmentId" class="layui-form-label">
                <span class="x-red">*</span>接收部门
            </label>
            <div class="layui-input-inline" onblur="employeeChang()">
                <select name="departmentId" id="departmentId" lay-verify="required">
                    <option value="${addequipmentbills.departmentId}">${addequipmentbills.department.name}</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="receptionperson" class="layui-form-label">
                <span class="x-red">*</span>接收人员
            </label>
            <div class="layui-input-inline">
                <select name="receptionperson" id="receptionperson">
                    <option value="${addequipmentbills.receptionperson}">${addequipmentbills.receptionEmployee.employeename}</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="purchaseTime" class="layui-form-label">
                <span class="x-red">*</span>购置日期
            </label>
            <div class="layui-input-inline">
                <input type="date" id="purchaseTime" name="purchaseTime" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${addequipmentbills.purchaseTime}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="equipmentFurnish" class="layui-form-label">
                <span class="x-red">*</span>供应厂商
            </label>
            <div class="layui-input-inline">
                <select id="equipmentFurnish" name="equipmentFurnish" class="valid">
                    <option value="${addequipmentbills.equipmentFurnish}">${addequipmentbills.furnish.name}</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="checkingperson" class="layui-form-label">
                <span class="x-red">*</span>验收人员
            </label>
            <div class="layui-input-inline">
                <select name="checkingperson" id="checkingperson">
                    <option value="${addequipmentbills.checkingperson}">${addequipmentbills.checkingpersonEmployee.employeename}</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="address" class="layui-form-label">
                <span class="x-red">*</span>存放位置
            </label>
            <div class="layui-input-inline">
                <select name="address" id="address">
                    <option value="${addequipmentbills.address}">${addequipmentbills.storage.name}</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="operatorperson" class="layui-form-label">
                <span class="x-red">*</span>经办人员
            </label>
            <div class="layui-input-inline">
                <select name="operatorperson" id="operatorperson">
                    <option value="${addequipmentbills.operatorperson}">${addequipmentbills.operatorpersonEmployee.employeename}</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="billsperson" class="layui-form-label">
                <span class="x-red">*</span>登账人员
            </label>
            <div class="layui-input-inline">
                <select name="billsperson" id="billsperson">
                    <option value="${addequipmentbills.billsperson}">${addequipmentbills.billsEmployee.employeename}</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="createTime" class="layui-form-label">
                <span class="x-red">*</span>登账日期
            </label>
            <div class="layui-input-inline">
                <input type="date" id="createTime" name="createTime" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${addequipmentbills.createTime}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="isDelate" class="layui-form-label">
                <span class="x-red">*</span>单据状态
            </label>
            <div class="layui-input-inline">
                <select name="isDelate" id="isDelate">
                    <option value="0">正常</option>
                    <option value="1">已删除</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_email" class="layui-form-label">
                <span class="x-red">*</span>经费来源
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_email" name="money" required=""
                       autocomplete="off" class="layui-input" value="${addequipmentbills.money}">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="abstractdetails" class="layui-form-label">
                <span class="x-red">*</span>订单摘要
            </label>
            <div class="layui-input-inline">
                <input type="text" id="abstractdetails" name="abstractdetails" required=""
                       autocomplete="off" class="layui-input" value="${addequipmentbills.money}">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="shopdepartmentId" class="layui-form-label">
                <span class="x-red">*</span>购置部门
            </label>
            <div class="layui-input-inline">
                <select name="shopdepartmentId" id="shopdepartmentId">shopdepartment
                    <option value="${addequipmentbills.shopdepartmentId}">${addequipmentbills.shopdepartment.name}</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="usedir" class="layui-form-label">
                <span class="x-red">*</span>使用方向
            </label>
            <div class="layui-input-inline">
                <input type="text" id="usedir" name="usedir" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${addequipmentbills.usedir}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="equipmentName" class="layui-form-label">
                <span class="x-red">*</span>设备名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="equipmentName" name="equipmentName" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${addequipmentbills.equipment.equipmentName}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="equipmentStandard" class="layui-form-label">
                <span class="x-red">*</span>规格型号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="equipmentStandard" name="equipmentStandard" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${addequipmentbills.equipment.equipmentStandard}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="count" class="layui-form-label">
                <span class="x-red">*</span>
            </label>
            <div class="layui-input-inline">
                <input type="text" id="count" name="count" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${addequipmentbills.count}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="equipmentType" class="layui-form-label">
                <span class="x-red">*</span>设备分类
            </label>
            <div class="layui-input-inline">
                <select name="equipmentType" id="equipmentType">
                    <option value="${addequipmentbills.equipmentType}">${addequipmentbills.tableEquipmentType.name}</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="depreciationtype" class="layui-form-label">
                <span class="x-red">*</span>折旧方式
            </label>
            <div class="layui-input-inline">
                <select name="depreciationtype" id="depreciationtype">
                    <option value="0">直线法</option>
                    <option value="1">产量法</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="equipmentType" class="layui-form-label">
                <span class="x-red">*</span>生产厂商
            </label>
            <div class="layui-input-inline">
                <select name="manufacturer" id="manufacturer">
                    <option value="${addequipmentbills.manufacturer}">${addequipmentbills.tableManufacturer.name}</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="productdate" class="layui-form-label">
                <span class="x-red">*</span>生产日期
            </label>
            <div class="layui-input-inline">
                <input type="date" id="productdate" name="productdate" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${addequipmentbills.equipment.equipmentDetalis.productdate}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="usedate" class="layui-form-label">
                <span class="x-red">*</span>启用日期
            </label>
            <div class="layui-input-inline">
                <input type="date" id="usedate" name="usedate" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${addequipmentbills.equipment.equipmentDetalis.usedate}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="fixType" class="layui-form-label">
                <span class="x-red">*</span>保修方式
            </label>
            <div class="layui-input-inline">
                <input type="text" id="fixType" name="fixType" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${addequipmentbills.equipment.equipmentDetalis.fixType}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="fixenddate" class="layui-form-label">
                <span class="x-red">*</span>保修到期
            </label>
            <div class="layui-input-inline">
                <input type="date" id="fixenddate" name="fixenddate" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${addequipmentbills.equipment.equipmentDetalis.fixenddate}">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="fixtime" class="layui-form-label">
                <span class="x-red">*</span>保修期限
            </label>
            <div class="layui-input-inline">
                <input type="text" id="fixtime" name="fixtime" required="" lay-verify="required"
                       autocomplete="off" class="layui-input" value="${addequipmentbills.equipment.equipmentDetalis.fixtime}">
            </div>
        </div>
        <div class="layui-form-item layui-form-text">
            <label for="equipmentDetails" class="layui-form-label">
                描述
            </label>
            <div class="layui-input-block">
                <textarea placeholder="请输入内容" id="equipmentDetails" name="equipmentDetails"
                          class="layui-textarea" ><s:property value="${addequipmentbills.equipment.equipmentDetalis.equipmentDetails}"/></textarea>
            </div>
        </div>
    </form>
    <div class="layui-form-item">
        <label for="addbutton" class="layui-form-label">
        </label>
        <button id="addbutton" onclick="update()" class="layui-btn">
            修改
        </button>
    </div>
    </form>
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
                    $("#shopdepartmentId").append(option);
                })
            },
            error: function () {
                console.log("error！")
            }
        })
    });

    //检验演员ajax
    $(function () {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/equipmentAddController/chaCheckingperson",
            dataType: "json",
            success: function (returnData) {
                console.log("ajax on");
                $(returnData).each(function (index, item) {
                    var option = "<option value=" + item.id + ">" + item.employeename + "</option>";
                    $("#checkingperson").append(option);
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
            url: "${pageContext.request.contextPath}/equipmentAddController/chaOperatorpersonAddBillsperson",
            dataType: "json",
            success: function (returnData) {
                console.log("ajax on");
                $(returnData).each(function (index, item) {
                    var option = "<option value=" + item.id + ">" + item.employeename + "</option>";
                    $("#operatorperson").append(option);
                    $("#billsperson").append(option);
                })
            },
            error: function () {
                console.log("error！")
            }
        })
    });


    //仓库ajax
    $(function () {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/equipmentAddController/chaStorage",
            dataType: "json",
            success: function (returnData) {
                $(returnData).each(function (index, item) {
                    var option = "<option value=" + item.id + ">" + item.name + "</option>";
                    $("#address").append(option);
                })
            },
            error: function () {
                console.log("error！")
            }
        })
    });
    //供应商ajax
    $(function () {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/equipmentAddController/chaFurnish",
            dataType: "json",
            success: function (returnData) {
                $(returnData).each(function (index, item) {
                    var option = "<option value=" + item.id + ">" + item.name + "</option>";
                    $("#equipmentFurnish").append(option);
                })
            },
            error: function () {
                console.log("error！")
            }
        })
    });
    //生产商ajax
    $(function () {
        $.ajax({
            type: "GET",
            url: "${pageContext.request.contextPath}/equipmentAddController/chaAllManufacturer",
            dataType: "json",
            success: function (returnData) {
                $(returnData).each(function (index, item) {
                    var option = "<option value=" + item.id + ">" + item.name + "</option>";
                    $("#manufacturer").append(option);
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