
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html lang="zh-CN">
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
    <script type="javascript">
    </script>
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
                    <div data-options="region:'west',title:'功能导航',split:true" style="width:200px;">
                        <div class="clearfix">
                            <aside class="sidebar">
                                <nav class="sidebar-nav">
                                    <ul class="metismenu" id="menu">
                                        <li>
                                            <a href="设备管理.html" aria-expanded="false" id="shebei">设备管理<span class="glyphicon arrow"></span></a>
                                            <ul aria-expanded="false">
                                                <li><a href="设备增加.jsp" >设备增加</a></li>
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
                            <a href="../html/cxdl.html">重新登录 </a>
                            <a href="xgmm.html">修改密码</a>
                            <a href="">帮助</a>
                            <a href="">关于</a>
                            <a href="../html/tcdl.html">退出</a>
                        </div>

                        <div id="shebeizengjia1">
                            <div id="dd3" style="width:100%;height:27px;background:#f9f9f9;">
                                <div id="title">
                                    <a href=""><img src="../fontimg/add.png" alt="">添加</a>
                                    <a href=""><img src="../fontimg/shanchu.png" alt="">删除</a>
                                    <a href=""><img src="../fontimg/baocun.png" alt="">保存</a>
                                    <a href=""><img src="../fontimg/dengzhang.png" alt="">登账</a>
                                    <a href=""><img src="../fontimg/dayin.png" alt="">打印</a>
                                    <a href=""><img src="../fontimg/sheji.png" alt="">设计</a>
                                    <a href="../html/newindex.html"><img src="../fontimg/fanhui.png" alt="">返回</a><br>
                                </div>
                            </div>
                            <div>
                                <input  id="dd1"  type="text">  至   <input  id="dd2"  type="text">
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
                                <div style="text-align: center;line-height: 100px"> 无数据显示 <div>
                            </div>
                        </div>
                    </div>
                            单据信息
                            <div style="border: 1px solid #0f0f0f;width: 100%;height: 130px" id="danju">
                                单据编号：<input type="text">
                                接收部门：<input type="text">
                                接收人员：<input type="text">
                                购置日期：<input type="text"><br>
                                增加方式：<input type="text">
                                供应厂商：<input type="text">
                                验收人员：<input type="text">
                                财务审核：<input type="text"><br>
                                单据摘要：<input type="text" style="width: 363px">
                                存放位置：<input type="text" style="width: 363px"><br>
                                经办人员：<input type="text">
                                单据状态：<input type="text">
                                登账人员：<input type="text">
                                登账日期：<input type="text"><br>
                                经费来源：<input type="text">
                                购置部门：<input type="text">
                                使用方向：<input type="text">
                                工程项目：<input type="text">
                            </div>
                            基础信息
                            <div style="border: 1px solid #0f0f0f;width: 100%;height: 105px" id="jichu">
                                设备名称：<input type="text">
                                规格型号：<input type="text">
                                拼音简码：<input type="text">
                                增加数量：<input type="text"><br>
                                设备分类：<input type="text">
                                设备品牌：<input type="text">
                                设备原值：<input type="text">
                                折旧方式：<input type="text"><br>
                                生产厂商：<input type="text">
                                生产日期：<input type="text">
                                启用日期：<input type="text">
                                净残值率：<input type="text">[%]
                                <br>
                                保修方式：<input type="text">
                                保修到期：<input type="text">
                                保修期限：<input type="text">
                                折旧年限：<input type="text"><br>
                            </div>
                            详细配置
                            <input style="border: 1px solid #0f0f0f;width: 100%;height: 35px">
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
    $('#dd3').draggable({
        handle:'#title'
    });
</script>
</body>
</html>