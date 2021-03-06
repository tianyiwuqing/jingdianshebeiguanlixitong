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
    <script type="javascript">
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


    <%--引人公共部分--%>
    <include src="./设备增加.jsp"></include>
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
                    //功能导航
                    <jsp:include page="daohanggongneng.jsp"/>
                    //
                    <div id="xin-y" data-options="region:'center',title:' '" style="padding:3px;background:white;">
                        <div id="xin--x">设备入库管理</div>
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
                                <input id="dd1" type="text"> 至 <input id="dd2" type="text">
                                <a href=""><img src="../fontimg/chaxun.png" alt="">查询</a>
                            </div>
                            <div>
                            </div>
                            <div style="border: 1px solid #0f0f0f;width: 100%;height: 100px">
                                <table border="1" style="width: 900px;height: 20px;text-align: center">
                                    <tr>
                                        <td>序号</td>
                                        <td>
                                            <select name="areaCode" style="width:100%;height:30px;">
                                                <option value="" selected="selected">单据编号</option>
                                            </select>
                                        </td>
                                        <td style="width: 200px">摘要</td>
                                        <td>
                                            <select name="areaCode" style="width:100%;height:30px;">
                                                <option value="" selected="selected">调入部门</option>
                                            </select>
                                        </td>
                                        <td><select name="areaCode" style="width:100%;height:30px;">
                                            <option value="" selected="selected">领用人员</option>

                                        </select>
                                        </td>
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
                                单据编号：<input type="text">
                                仓库名称：<input type="text">
                                仓库保管：<input type="text">
                                出库日期：<input type="text"><br>
                                入库人员：<input type="text">
                                入库部门：<input type="text">
                                制单人员：<input type="text">
                                制单日期：<input type="text"><br>
                                单据摘要：<input type="text" style="width: 790px"><br>
                                经办人员：<input type="text">
                                单据状态：<input type="text">
                                登账人员：<input type="text">
                                登账日期：<input type="text"><br>
                            </div>
                            <div style="border: 1px solid #eee8e5;width: 98%;height: 30px;text-align: center;line-height: 30px;font-size: 15px;">
                                设备明细
                            </div>
                            <div style="overflow:scroll; width:100%;height: 300px" id="jichu">
                                <table border="1" style="width: 1800px;">
                                    <tr>
                                        <td>序号</td>
                                        <td>设备编号</td>
                                        <td>设备名称</td>
                                        <td>单位</td>
                                        <td>规格型号</td>
                                        <td>责任人</td>
                                        <td>技术状态</td>
                                        <td>存放位置</td>
                                        <td>工程项目</td>
                                        <td>备注</td>
                                        <td>出厂编号</td>
                                        <td>生产日期</td>
                                        <td>详细配置</td>
                                        <td>设备现值</td>
                                        <td>品牌</td>
                                        <td>生产厂家</td>
                                        <td>购置日期</td>
                                        <td>供应商</td>
                                        <td>设备原值</td>
                                    </tr>
                                    <tr>
                                        <td>1</td>
                                        <td>2</td>
                                        <td>3</td>
                                        <td>4</td>
                                        <td>5</td>
                                        <td>6</td>
                                        <td>7</td>
                                        <td>8</td>
                                        <td>9</td>
                                        <td>10</td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                    </tr>

                                </table>
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
        required: true
    });
    $('#dd2').datebox({
        required: true
    });
    $('#dd3').draggable({
        handle: '#title'
    });
</script>
</body>
</html>