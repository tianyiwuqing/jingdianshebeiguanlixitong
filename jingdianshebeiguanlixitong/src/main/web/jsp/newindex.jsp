<%--
  Created by IntelliJ IDEA.
  User: 天意无情
  Date: 2019/3/11
  Time: 13:56
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
    <script type="application/javascript" src="../js/jquery-2.1.1/jquery.min.js"/>
    <script type="text/javascript" src="../jquery-easyui-1.3.5/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="../jquery-easyui-1.3.5/locale/easyui-lang-zh_CN.js"></script>
    <link rel="stylesheet" href="../dist/metisMenu.css"/>
    <link rel="stylesheet" href="../test/demo.css"/>
    <link rel="stylesheet" href="../test/mini.css"/>
    <link rel="stylesheet" href="../test/设备增加.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.2/css/font-awesome.min.css"/>
    <style>
        #xin a{
            text-decoration: none;
            color: #0f0f0f;
            font-size: 16px;
            margin-right: 10px;
        }
        #xin a:hover{
            color: #bfbfbf;
        }
        #xin-x{
            position: absolute;
            top: 2px;
            left: 72%;
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
                    <h2 class="panel-title"style="color: #ffffff;font-size: 22px">医疗设备管理系统</h2>
                </div>
                <div class="easyui-layout" style="height: 521px;width: 100%" id="xin">
                    <div data-options="region:'west',title:'功能导航',split:true" style="width:200px;">
                        <div class="clearfix">
                            <aside class="sidebar">
                                <nav class="sidebar-nav">
                                    <ul class="metismenu" id="menu">
                                        <li>
                                            <a href="#" aria-expanded="false" id="shebei">设备管理<span class="glyphicon arrow"></span></a>
                                            <ul aria-expanded="false">
                                                <li><a href="设备增加.html" id="shebeizengjia">设备增加</a></li>
                                                <li><a href="出库管理.html">出库管理</a></li>
                                                <li><a href="出库查询.html">出库查询</a></li>
                                                <li><a href="#">入库管理</a></li>
                                                <li><a href="#">入库查询</a></li>
                                                <li><a href="../jsp/设备盘点.html">设备盘点</a></li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="#" aria-expanded="false">运行管理<span class="glyphicon arrow"></span></a>
                                            <ul aria-expanded="false">
                                                <li><a href="t设备故障登记.html">设备故障登记</a></li>
                                                <li><a href="#">故障维修管理</a></li>
                                                <li><a href="#">维修记录查询</a></li>
                                                <li><a href="#">设备启用管理</a></li>
                                                <li><a href="#">启用记录查询</a></li>
                                                <li><a href="#">设备封存管理</a></li>
                                                <li><a href="#">封存记录查询</a></li>
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
                    <div id="xin-y" data-options="region:'center',title:' '" style="padding:5px;background:white;">
                        <div id="xin-x">
                            <a href="cxdl.html">重新登录 </a>
                            <a href="xgmm.html">修改密码</a>
                            <a href="">帮助</a>
                            <a href="">关于</a>
                            <a href="tcdl.html">退出</a>
                        </div>
                        <div id="context">
                            <img src="../img/1234.png" style="margin-left: 230px">
                        </div>
                        <div id="shebeiguanli" style="display: none">
                            <img src="../img/设备管理/head.png" style="margin-left: 200px">
                            <a href="设备增加.jsp" id="shebeizengjia2"><img src="../img/设备管理/设备增加.png" style="margin-left: 200px"></a>
                            <a href="设备盘点.html" id="shebeipandian2"><img src="../img/设备管理/设备盘点.png" style="margin-left: 200px"></a>
                            <img src="../img/设备管理/入库查询.png" style="margin-left: 200px">
                            <img src="../img/设备管理/入库管理.png" style="margin-left: 200px">
                            <img src="../img/设备管理/出库查询.png" style="margin-left: 200px">
                            <img src="../img/设备管理/出库管理.png" style="margin-left: 200px">
                        </div>
                    </div>
                    <div data-options="region:'south',title:'试用版'" style="height:20px;"></div>
                </div>

            </div>
        </div>
    </div>
</div>
<script src="../js/bootstrap.min.js"></script>
<script src="../dist/metisMenu.min.js"></script>
<script src="../js/context.js"></script>
<script>
    $(function () {
        $('#menu').metisMenu();
    });
</script>
</body>
</html>
