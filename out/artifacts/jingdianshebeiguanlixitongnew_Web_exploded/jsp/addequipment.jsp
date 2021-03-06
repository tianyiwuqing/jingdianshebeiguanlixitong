<%--
  Created by IntelliJ IDEA.
  User: 天意无情
  Date: 2019/3/15
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>医疗设备管理系统</title>
    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="../jquery-easyui-1.3.5/themes/default/easyui.css">
    <link rel="stylesheet" href="../jquery-easyui-1.3.5/themes/icon.css">
    <script type="text/javascript" src="../jquery-easyui-1.3.5/jquery.min.js"></script>
    <script type="text/javascript" src="../jquery-easyui-1.3.5/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../jquery-easyui-1.3.5/locale/easyui-lang-zh_CN.js"></script>
    <link rel="stylesheet" href="../dist/metisMenu.css"/>
    <link rel="stylesheet" href="../test/demo.css"/>
    <link rel="stylesheet" href="../test/mini.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.2/css/font-awesome.min.css"/>
    <script type="text/javascript" src="../js/jquery-2.1.1/jquery.min.js"></script>
    <script type="text/javascript">
        function add() {
            alert("是否提交项目");
            $("#add").submit();
            $("#addEquipment").submit();
        }

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

        function employeeChang() {
            var obj = $("#departmentId").val();
            $.ajax({
                type: "POST",
                url: "${pageContext.request.contextPath}/equipmentAddController/departmentOfEmployee",
                data: {"did": obj},
                dataType: "json",
                success: function (returnData) {
                    $("#receptionperson").empty();
                    $("#receptionperson").append("<option value='0'>-请选择-</option>");
                    console.log("did on");
                    $(returnData).each(function (index, item) {
                        var option = "<option value=" + item.id + ">" + item.employeename + "</option>";
                        $("#receptionperson").append(option);

                    })
                },
                error: function () {
                    console.log("error！")
                }
            })


        }

    </script>
    <style>
        #xin a {
            text-decoration: none;
            color: #0f0f0f;
            font-size: 16px;
            margin-right: 10px;
        }

        #xin a:hover {
            color: #bfbfbf;
        }

        #xin-x {
            position: absolute;
            top: 2px;
            left: 72%;
        }

        #xin--x {
            position: absolute;
            font-size: 16px;
            top: 2px;
        }

        #shebeizengjia1 img {
            width: 20px;
            height: 20px;
            margin: 0 2px;

        }

        #danju input {
            margin-top: 1px;
            margin-bottom: 1px;
        }

        #jichu input {
            margin-top: 1px;
            margin-bottom: 1px;
        }
    </style>
</head>
<body>
<div id="win" class="easyui-window" title="医疗设备管理系统 - [功能导航]" style="width:1300px;height:600px"
     data-options="iconCls:'icon-save',modal:true">
    <div class="easyui-layout" data-options="fit:true">
        <div data-options="region:'center'">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h2 class="panel-title" style="color: #ffffff;font-size: 22px">医疗设备管理系统</h2>
                </div>
                <div class="easyui-layout" style="height: 521px;width: 100%" id="xin">
                    <div data-options="region:'west',title:'功能导航',split:true" style="width:200px;">
                        <div class="clearfix">
                            <aside class="sidebar">
                                <nav class="sidebar-nav">
                                    <ul class="metismenu" id="menu">
                                        <li>
                                            <a href="../html/设备管理.html" aria-expanded="false" id="shebei">设备管理<span
                                                    class="glyphicon arrow"></span></a>
                                            <ul aria-expanded="false">
                                                <li><a href="设备增加.html">设备增加</a></li>
                                                <li><a href="出库管理.html">出库管理</a></li>
                                                <li><a href="出库查询.html">出库查询</a></li>
                                                <li><a href="入库管理.html">入库管理</a></li>
                                                <li><a href="入库查询.html">入库查询</a></li>
                                                <li><a href="设备盘点.html">设备盘点</a></li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="#" aria-expanded="false">运行管理<span class="glyphicon arrow"></span></a>
                                            <ul aria-expanded="false">
                                                <li><a href="t设备故障登记.html">设备故障登记</a></li>
                                                <li><a href="t故障维修管理.html">故障维修管理</a></li>
                                                <li><a href="维修记录查询.html">维修记录查询</a></li>
                                                <li><a href="t设备启用管理.html">设备启用管理</a></li>
                                                <li><a href="t启用记录查询.html">启用记录查询</a></li>
                                                <li><a href="t设备封存管理.html">设备封存管理</a></li>
                                                <li><a href="t封存记录查询.html">封存记录查询</a></li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="#" aria-expanded="false">报废管理<span class="glyphicon arrow"></span></a>
                                            <ul aria-expanded="false">
                                                <li><a href="#">到期设备查询</a></li>
                                                <li><a href="#">设备报废管理</a></li>
                                                <li><a href="#">报废设备查询</a></li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="#" aria-expanded="false">预防维护<span class="glyphicon arrow"></span></a>
                                            <ul aria-expanded="false">
                                                <li><a href="#">到期维护设备查询</a></li>
                                                <li><a href="#">设备预防维护计划</a></li>
                                                <li><a href="#">设备预防维护管理</a></li>
                                                <li><a href="#">设备预防维护查询</a></li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="#" aria-expanded="false">基础信息<span class="glyphicon arrow"></span></a>
                                            <ul aria-expanded="false">
                                                <li><a href="#">系统参数设置</a></li>
                                                <li><a href="#">组织机构设置</a></li>
                                                <li><a href="#">职工档案设置</a></li>
                                                <li><a href="#">所在仓库管理</a></li>
                                                <li><a href="#">供应厂商维护</a></li>
                                                <li><a href="#">生产厂商维护</a></li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="#" aria-expanded="false">系统维护<span class="glyphicon arrow"></span></a>
                                            <ul aria-expanded="false">
                                                <li><a href="#">角色授权管理</a></li>
                                                <li><a href="#">查询操作记录</a></li>
                                                <li><a href="#">操作数据清理</a></li>
                                                <li><a href="#">数据备份恢复</a></li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="#" aria-expanded="false">权限管理<span class="glyphicon arrow"></span></a>
                                            <ul aria-expanded="false">
                                                <li><a href="#">角色授权管理</a></li>
                                                <li><a href="#">查询操作记录</a></li>
                                                <li><a href="#">操作数据清理</a></li>
                                                <li><a href="#">数据备份恢复</a></li>
                                            </ul>
                                        </li>
                                    </ul>
                                </nav>
                            </aside>
                        </div>

                    </div>
                    <div id="xin-y" data-options="region:'center',title:' '" style="padding:3px;background:white;">
                        <div id="xin--x">设备增加管理</div>
                        <div id="xin-x">
                            <a href="cxdl.html">重新登录 </a>
                            <a href="xgmm.html">修改密码</a>
                            <a href="">帮助</a>
                            <a href="">关于</a>
                            <a href="tcdl.html">退出</a>
                        </div>

                        <div id="shebeizengjia1">
                            <div id="dd3" style="width:100%;height:27px;background:#f9f9f9;">
                                <div id="title">
                                    <a href="JavaScript:add()"><img src="../fontimg/add.png" alt="">添加</a>
                                    <a href=""><img src="../fontimg/shanchu.png" alt="">删除</a>
                                    <a href=""><img src="../fontimg/baocun.png" alt="">保存</a>
                                    <a href=""><img src="../fontimg/dengzhang.png" alt="">登账</a>
                                    <a href=""><img src="../fontimg/dayin.png" alt="">打印</a>
                                    <a href=""><img src="../fontimg/sheji.png" alt="">设计</a>
                                    <a href="newindex.html"><img src="../fontimg/fanhui.png" alt="">返回</a><br>
                                </div>
                            </div>
                            <div>
                                <input id="dd1" type="text"> 至 <input id="dd2" type="text">
                                <a href=""><img src="../fontimg/chaxun.png" alt="">查询</a>
                            </div>
                            <div style="border: 1px solid #0f0f0f;width: 100%;height: 100px">
                                <table border="1" style="width: 900px;height: 20px">
                                    <tr>
                                        <td>序号</td>
                                        <td>
                                            <select name="areaCode" style="width:100%;height:30px;">
                                                <option value="" selected="selected">单据编号</option>

                                            </select>
                                        </td>
                                        <td>
                                            <select name="areaCode" style="width:100%;height:30px;">
                                                <option value="" selected="selected">供应商</option>

                                            </select>
                                        </td>
                                        <td style="width: 200px">摘要</td>
                                        <td>
                                            <select name="areaCode" style="width:100%;height:30px;">
                                                <option value="" selected="selected">制单日期</option>

                                            </select>
                                        </td>
                                        <td>
                                            <select name="areaCode" style="width:100%;height:30px;">
                                                <option value="" selected="selected">制单人</option>

                                            </select>
                                        </td>
                                        <td>
                                            <select name="areaCode" style="width:100%;height:30px;">
                                                <option value="" selected="selected">单据状态</option>

                                            </select>
                                        </td>
                                    </tr>
                                </table>
                                <div style="text-align: center;line-height: 100px"> 无数据显示
                                    <div>
                                    </div>
                                </div>
                            </div>
                            单据信息
                            <div style="border: 1px solid #0f0f0f;width: 100%;height: 130px" id="danju">
                                <form id="add" method="post"
                                      action="${pageContext.request.contextPath}/equipmentAddController/addEquipment">
                                    单据编号：<input name="billsnumber" type="text">
                                    接收部门：
                                    <select name="departmentId" id="departmentId" onblur="employeeChang()">
                                        <option value="0">-请选择-</option>
                                    </select>
                                    接收人员：
                                    <select name="receptionperson" id="receptionperson">
                                        <option value="0">-请选择-</option>
                                    </select>
                                    购置日期：<input name="purchaseTime" type="date"><br>

                                    供应厂商：
                                    <select name="equipmentFurnish" id="equipmentFurnish">
                                        <option value="0">-请选择-</option>
                                    </select>
                                    验收人员：
                                    <select name="checkingperson" id="checkingperson">
                                        <option value="0">-请选择-</option>
                                    </select>

                                    单据摘要：<input name="abstractdetails" type="text" style="width: 363px">
                                    存放位置：
                                    <select name="address" id="address">
                                        <option value="0">-请选择—</option>
                                    </select><br>
                                    经办人员：
                                    <select name="operatorperson" id="operatorperson">
                                        <option value="0">请选择</option>
                                    </select>
                                    单据状态：
                                    <select name="isDelate" id="isDelate">
                                        <option value="0">正常</option>
                                        <option value="1">已删除</option>
                                    </select>
                                    登账人员：
                                    <select name="billsperson" id="billsperson">
                                        <option value="0">请选择</option>
                                    </select>
                                    登账日期：<input name="createTime" type="date"><br>
                                    经费来源：<input name="money" type="text">
                                    购置部门：
                                    <select name="shopdepartmentId" id="shopdepartmentId">
                                        <option value="0">-请选择-</option>
                                    </select>
                                    使用方向：<input name="usedir" type="text">

                                </form>
                            </div>
                            <form id="addEquipment" method="post"
                                  action="${pageContext.request.contextPath}/equipmentAddController/addEquipment">
                                <div style="border: 1px solid #0f0f0f;width: 100%;height: 105px" id="jichu">
                                    设备名称：<input name="equipmentName" type="text">
                                    规格型号：<input name="equipmentStandard" type="text">
                                    增加数量：<input name="count" type="text"><br>
                                    设备分类：
                                    <select name="equipmentType" id="equipmentType">
                                        <option value="0">-请选择-</option>
                                    </select>
                                    设备品牌：<input name="equipmentBrand" type="text">
                                    折旧方式：
                                    <select name="depreciationtype" id="depreciationtype" >
                                        <option value="0">直线法</option>
                                        <option value="1">产量法</option>
                                    </select><br>
                                    生产厂商：
                                    <select name="manufacturer" id="manufacturer">
                                        <option value="0">-请选择</option>
                                    </select>
                                    生产日期：<input name="productdate" type="date">
                                    启用日期：<input name="usedate" type="date">
                                    <br>
                                    保修方式：<input name="fixType" type="text">
                                    保修到期：<input name="fixenddate" type="date">
                                    保修期限：<input name="fixtime" type="text">
                                </div>
                            </form>
                            详细配置
                            <input style="border: 1px solid #0f0f0f;width: 100%;height: 35px">
                        </div>
                        基础信息
                    </div>
                    <div data-options="region:'south',title:'试用版'" style="height:20px;"></div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="../js/bootstrap.min.js"></script>
<script src="../dist/metisMenu.min.js"></script>
<script>
    $(function () {
        $("#menu").metisMenu();
    });
    $(function () {
        $("#dd1").required = true
    });

    $(function () {
        $("#dd2").required = true
    });
    $(function () {
        $("#dd3").required = true
    });

</script>

</body>
</html>
