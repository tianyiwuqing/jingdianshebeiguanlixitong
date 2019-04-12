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
            alert("是否提交项目");
            $("#chaCheckingperson").submit();
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
    <form class="layui-form" id="addemployee" method="post"
          action="${pageContext.request.contextPath}/equipmentAddController/chaCheckingperson">
        <div class="layui-form-item">
            <%--@declare id="employeeid"--%><label for="employeeid" class="layui-form-label">
                <span class="x-red">*</span>员工编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="employeeid" name="employeeid" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <%--@declare id="employeename"--%><label for="employeename" class="layui-form-label">
                <span class="x-red">*</span>员工姓名
            </label>
            <div class="layui-input-inline" onblur="employeeChang()">
                <input type="text" id="employeename" name="employeename" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <%--@declare id="username"--%><label for="username" class="layui-form-label">
                <span class="x-red">*</span>用户名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="username" name="username" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <%--@declare id="employeesex"--%><label for="employeesex" class="layui-form-label">
                <span class="x-red">*</span>性别
            </label>
            <div class="layui-input-inline">
                <select id="employeesex" name="employeesex" class="valid">
                    <option value="">-请选择-</option>
                    <option value="0">-男-</option>
                    <option value="1">-女-</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <%--@declare id="employeepassword"--%><label for="employeepassword" class="layui-form-label">
                <span class="x-red">*</span>密码
            </label>
            <div class="layui-input-inline">
                <input type="text" id="employeepassword" name="employeepassword" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <%--@declare id="employeetelephone"--%><label for="employeetelephone" class="layui-form-label">
                <span class="x-red">*</span>电话
            </label>
            <div class="layui-input-inline">
                <input type="text" id="employeetelephone" name="employeetelephone" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <%--@declare id="is_valid"--%><label for="is_valid" class="layui-form-label">
                <span class="x-red">*</span>是否禁用
            </label>
            <div class="layui-input-inline">
                <select name="is_valid" id="is_valid">
                    <option value="">-请选择-</option>
                    <option value="0">-是-</option>
                    <option value="1">-否-</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <%--@declare id="is_leader"--%><label for="is_leader" class="layui-form-label">
                <span class="x-red">*</span>是否是领导
            </label>
            <div class="layui-input-inline">
                <select name="is_leader" id="is_leader">
                    <option value="">-请选择-</option>
                    <option value="0">-是-</option>
                    <option value="1">-否-</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <%--@declare id="employeetype"--%><label for="employeetype" class="layui-form-label">
                <span class="x-red">*</span>用户类型
            </label>
            <div class="layui-input-inline">
                <select name="employeetype" id="employeetype">
                    <option value="">-请选择-</option>
                    <option value="0">-有权限-</option>
                    <option value="1">-无权限-</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <%--@declare id="photograph"--%><label for="photograph" class="layui-form-label">
            <span class="x-red">*</span>删除标志
        </label>
            <div class="layui-input-inline">
                <select name="isDelate" id="isDelate">
                    <option value="">-请选择-</option>
                    <option value="0">正常</option>
                    <option value="1">已删除</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <%--@declare id="photograph"--%><label for="photograph" class="layui-form-label">
                <span class="x-red">*</span>照片
            </label>
            <div class="layui-input-inline">
                <textarea placeholder="请上传至此" id="photograph" name="photograph"
                          class="layui-textarea"></textarea>
            </div>
        </div>
        <div class="layui-form-item">
            <%--@declare id="create_time"--%><label for="create_time" class="layui-form-label">
                <span class="x-red">*</span>生成时间
            </label>
            <div class="layui-input-inline">
                <input placeholder="年/月/日" type="text" id="create_time" name="create_time" required="" lay-verify="required"
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>
            </div>
        </div>
        <div class="layui-form-item">
            <%--@declare id="update_time"--%><label for="update_time" class="layui-form-label">
                <span class="x-red">*</span>更新时间
            </label>
            <div class="layui-input-inline">
                <input placeholder="年/月/日" type="text" id="update_time" name="update_time" required=""
                       autocomplete="off" class="layui-input">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>
            </div>
        </div>
            <div class="layui-form-item layui-form-text">
                <%--@declare id="employeedetails"--%><label for="employeeDetails" class="layui-form-label">
                    描述
                </label>
                <div class="layui-input-block">
                <textarea placeholder="请输入内容" id="equipmentDetails" name="equipmentDetails"
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
    </form>
</div>
<script>
    // layui.use(['form', 'layer'], function () {
    //     $ = layui.jquery;
    //     var form = layui.form
    //         , layer = layui.layer;

    //自定义验证规则
    //          form.verify({
    //            nikename: function(value){
    //              if(value.length < 5){
    //                return '昵称至少得5个字符啊';
    //              }
    //            }
    //            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
    //            ,repass: function(value){
    //                if($('#L_pass').val()!=$('#L_repass').val()){
    //                    return '两次密码不一致';
    //                }
    //            }
    //          });


    //          //监听提交
    //          form.on('submit(add)', function(data){
    //            console.log(data);
    //            //发异步，把数据提交给php
    //            layer.alert("增加成功", {icon: 6},function () {
    //                // 获得frame索引
    //                var index = parent.layer.getFrameIndex(window.name);
    //                //关闭当前frame
    //                parent.layer.close(index);
    //            });
    //            return false;
    //          });
    //     });

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

    //接收人员ajax
    //选择select控件
    <%--$(function () {--%>
    <%--console.log("employeechang ok");--%>
    <%--$.ajax({--%>
    <%--type: "POST",--%>
    <%--url: "${pageContext.request.contextPath}/equipmentAddController/departmentOfEmployee",--%>
    <%--data: {"did": "110"},--%>
    <%--dataType: "json",--%>
    <%--success: function (returnData) {--%>
    <%--console.log(returnData);--%>
    <%--$(returnData).each(function (index, item) {--%>
    <%--var option = "<option value=" + item.id + ">" + item.employeename + "</option>";--%>
    <%--$("#receptionperson").append(option);--%>
    <%--})--%>
    <%--},--%>
    <%--error: function () {--%>
    <%--console.log("error！")--%>
    <%--}--%>
    <%--})--%>
    <%--})--%>


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