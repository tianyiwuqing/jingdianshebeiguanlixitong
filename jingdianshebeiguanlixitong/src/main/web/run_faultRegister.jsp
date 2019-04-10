<%--
  Created by IntelliJ IDEA.
  User: geek
  Date: 2019/4/8
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html class="x-admin-sm">

<head>
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.1</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
    <script type="text/javascript" src="./js/cookie.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
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
        #xin--x{
            position: absolute;
            font-size: 16px;
            top: 2px;
        }
        #shebeizengjia1 img{
            width: 20px;
            height: 20px;
            margin: 0 2px ;

        }
        #danju input{
            margin-top: 1px;
            margin-bottom: 1px;
        }
        #jichu input{
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
                    <h2 class="panel-title"style="color: #ffffff;font-size: 22px">医疗设备管理系统</h2>
                </div>
                <div class="easyui-layout" style="height: 521px;width: 100%" id="xin">

                    <div id="xin-y" data-options="region:'center',title:' '" style="padding:3px;background:white;">

                        <%--<div id="xin-x">
                            <a href="cxdl.html">重新登录 </a>
                            <a href="xgmm.html">修改密码</a>
                            <a href="">帮助</a>
                            <a href="">关于</a>
                            <a href="tcdl.html">退出</a>
                        </div>--%>

                        <div id="shebeizengjia1">
                            <div style="border: 1px solid #0f0f0f;width: 100%;height: 200px;overflow-y: scroll">
                                <!--<table border="1" style="width: 900px;height: 20px;text-align: center">-->
                                <table border="1" style="width: 100%;height: 20px;text-align: center">
                                    <tr>
                                        <td>序号</td>
                                        <td>
                                            <select name="areaCode" style="width:100%;height:30px;">
                                                <option value="" selected="selected">单据编号</option>

                                            </select>
                                        </td>
                                        <td style="width: 200px">故障现象</td>
                                        <td style="width: 200px">设备编号</td>
                                        <td>
                                            <select name="areaCode" style="width:100%;height:30px;">
                                                <option value="" selected="selected">设备名称</option>

                                            </select>
                                        </td>
                                        <td>
                                            <select name="areaCode" style="width:100%;height:30px;">
                                                <option value="" selected="selected">规格型号</option>

                                            </select>
                                        </td>
                                        <td>
                                            <select name="areaCode" style="width:100%;height:30px;">
                                                <option value="" selected="selected">单位</option>

                                            </select>
                                        </td>
                                        <td>
                                            <select name="areaCode" style="width:100%;height:30px;">
                                                <option value="" selected="selected">出厂编号</option>

                                            </select>
                                        </td>
                                        <td>
                                            <select name="areaCode" style="width:100%;height:30px;">
                                                <option value="" selected="selected">制单日期</option>

                                            </select>
                                        </td>
                                        <td>
                                            <select name="areaCode" style="width:100%;height:30px;">
                                                <option value="" selected="selected">制单人员</option>

                                            </select>
                                        </td>
                                        <td>
                                            <select name="areaCode" style="width:100%;height:30px;">
                                                <option value="" selected="selected">单据状态</option>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>1</td>
                                        <td>1</td>
                                        <td>1</td>
                                        <td>1</td>
                                        <td>1</td>
                                        <td>1</td>
                                        <td>1</td>
                                        <td>1</td>
                                        <td>1</td>
                                        <td>1</td>
                                        <td>1</td>
                                    </tr>

                                </table>
                                <!--<div style="text-align: center;line-height: 100px"> 无数据显示<div>-->
                                <div style="text-align: center;"> <div><!--无数据显示-->
                                </div>
                                </div>
                            </div>
                            故障信息
                            <div style="border: 1px solid #0f0f0f;width: 100%;height: 73px" id="gzxx">
                                单据编号：<input type="text">
                                发现人员：<input type="text">
                                审核人员：<input type="text">
                                审核日期：<input type="text" class="data" style="width: 100px"><br>
                                单据状态：<input type="text" style="width: 363px">
                                <!--领用部门：<input type="text">-->
                                制单人员：<input type="text">
                                制单日期：<input type="text" class="data" style="width: 100px"><br>
                                故障日期：<input type="text" class="data" style="width: 135px">
                                送修日期：<input type="text"class="data" style="width: 135px">
                                送修人员：<input type="text">
                                预修日期：<input type="text"class="data" style="width: 130px">

                            </div>

                            <div style="border: 1px solid #eee8e5;width: 98%;height: 30px;text-align: center;line-height: 30px;font-size: 15px;">
                                设备信息
                            </div>
                            <div style="border: 1px solid #0f0f0f;width: auto;height: 71px" id="sbxx">
                                设备编号：<input type="text">
                                设备名称：<input type="text">
                                规格型号：<input type="text">
                                计量单位：<input type="text"><br>
                                <!--单据状态：<input type="text">-->
                                <!--领用部门：<input type="text">-->
                                出厂编号：<input type="text">
                                所属部门：<input type="text">
                                责任人员：<input type="text">
                                设备品牌：<input type="text"><br>
                                详细配置：<input type="text" style="width: 577px;">
                                设备状态：<input type="text">
                            </div>
                            <div style="border: 1px solid #eee8e5;width: 98%;height: 30px;text-align: center;line-height: 30px;font-size: 15px;">
                                故障现象
                            </div>
                            <div id="gzxx1">
                                <textarea style="width: 100%"></textarea>
                            </div>
                            <div style="border: 1px solid #eee8e5;width: 98%;height: 30px;text-align: center;line-height: 30px;font-size: 15px;">
                                故障原因
                            </div>
                            <div id="gzyy">
                                <textarea style="width: 100%"></textarea>
                            </div>
                            <div style="border: 1px solid #eee8e5;width: 98%;height: 30px;text-align: center;line-height: 30px;font-size: 15px;">
                                处理意见
                            </div>
                            <div id="clyj">
                                <textarea style="width: 100%"></textarea>
                            </div>
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
<script>
    $(function () {
        $('#menu').metisMenu();
    });
    $('#dd1').datebox({
        required:true
    });
    $('#dd2').datebox({
        required:true
    });
    $('.data').datebox({
        required:true
    });

    $('#dd3').draggable({
        handle:'#title'
    });
</script>
</body>
</html>