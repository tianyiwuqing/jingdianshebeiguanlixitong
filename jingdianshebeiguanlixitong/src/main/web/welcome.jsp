<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html class="x-admin-sm">
    <head>
        <meta charset="UTF-8">
        <title>欢迎页面-向阳花医疗设备管理系统</title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <link rel="stylesheet" href="./css/font.css">
        <link rel="stylesheet" href="./css/xadmin.css">
    </head>
    <body>
    <div class="x-body">
        <blockquote class="layui-elem-quote">${sessionScope.LoginUser.username}：
            <% Date nowDate = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String format = sdf.format(nowDate);
            request.setAttribute("nowDate", format); %>
            <span class="x-red">你好</span>！当前时间:${nowDate};
        </blockquote>
        <fieldset class="layui-elem-field">
            <legend>数据统计</legend>
            <div class="layui-field-box">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-body">
                            <div class="layui-carousel x-admin-carousel x-admin-backlog" lay-anim="" lay-indicator="inside" lay-arrow="none" style="width: 100%; height: 90px;">
                                <div carousel-item="">
                                    <ul class="layui-row layui-col-space10 layui-this">
                                        <li class="layui-col-xs2">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>员工人数</h3>
                                                <p>
                                                    <cite>${sessionScope.EmployeeCount}</cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs2">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>设备总数</h3>
                                                <p>
                                                    <cite>${sessionScope.count}</cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs2">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>待入库数</h3>
                                                <p>
                                                    <cite>${sessionScope.InRepertory}</cite></p>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </fieldset>
        <fieldset class="layui-elem-field">
            <legend>系统通知</legend>
            <div class="layui-field-box">
                <table class="layui-table" lay-skin="line">
                    <tbody>
                        <tr>
                            <td >
                                <a class="x-a" href="/" target="_blank">新版jingdianxitong2.0即将上线了</a>
                            </td>
                        </tr>
                        <tr>
                            <td >
                                <a class="x-a" href="/" target="_blank">交流qq号:(2844911608)</a>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </fieldset>
        <fieldset class="layui-elem-field">
            <legend>系统信息</legend>
            <div class="layui-field-box">
                <table class="layui-table">
                    <tbody>
                        <tr>
                            <th>jingdianshebeiguanlixitong</th>
                            <td>1.0.0</td></tr>
                        <tr>
                            <th>服务器地址</th>
                            <td>http://localhost:8080/</td></tr>
                        <tr>
                            <th>操作系统</th>
                            <td>JAVA</td></tr>
                        <tr>
                            <th>运行环境</th>
                            <td>Apache/Tomcat 8.5.331</td></tr>
                        <tr>
                            <th>java运行方式</th>
                            <td>cgi-fcgi</td></tr>
                        <tr>
                            <th>MYSQL版本</th>
                            <td>5.5.53</td></tr>
                    </tbody>
                </table>
            </div>
        </fieldset>
        <fieldset class="layui-elem-field">
            <legend>开发团队</legend>
            <div class="layui-field-box">
                <table class="layui-table">
                    <tbody>
                        <tr>
                            <th>版权所有</th>
                            <td>tianyiwuqing(tianyiwuqing)
                                <a href="http://x.xuebingsi.com/" class='x-a' target="_blank">访问官网</a></td>
                        </tr>
                        <tr>
                            <th>开发者</th>
                            <td>鲍庆涛(2844911608@qq.com)</td></tr>
                    </tbody>
                </table>
            </div>
        </fieldset>
        <blockquote class="layui-elem-quote layui-quote-nm">感谢layui,jquery,</blockquote>
    </div>
        <script>
        var _hmt = _hmt || [];
        (function() {
          var hm = document.createElement("script");
          hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
          var s = document.getElementsByTagName("script")[0]; 
          s.parentNode.insertBefore(hm, s);
        })();

        //查询员工人数
        function employeeCount() {
            $.ajax({
                type: "GET",
                url: "${pageContext.request.contextPath}/EmployeeController/chaEmployeeCount",
                dataType: "json",
                success: function (returnData) {
                    console.log(returnData)
                },
                error: function () {
                    console.log("error！")
                }
            })
        }

        //设备数ajax
        function equipmentCount() {
            $.ajax({
                type: "GET",
                url: "${pageContext.request.contextPath}/repertoryController/chaCount",
                dataType: "json",
                success: function (returnData) {
                    console.log(returnData)
                },
                error: function () {
                    console.log("error！")
                }
            })
        }
        //设备数ajax
        function equipmentCount() {
            $.ajax({
                type: "GET",
                url: "${pageContext.request.contextPath}/equipmentAddController/chaAddequipmentbills",
                dataType: "json",
                success: function (returnData) {
                    console.log(returnData)
                },
                error: function () {
                    console.log("error！")
                }
            })
        }


        </script>
    </body>
</html>