<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!doctype html>
<html  class="x-admin-sm">
<head>
	<meta charset="UTF-8">
	<title>医疗设备管理系统</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/font.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript"src="https://cdn.bootcss.com/blueimp-md5/2.10.0/js/md5.min.js"></script>
    <script src="${pageContext.request.contextPath}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/xadmin.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/cookie.js"></script>
    <script>
        //需要入库的人数ajax
        function equipmentCount() {
            $.ajax({
                type: "GET",
                url: "${pageContext.request.contextPath}/equipmentAddController/chaAddequipmentbills",
                dataType: "json",
                success: function (returnData) {
                    console.log("ajax on cs")
                    console.log(returnData)
                },
                error: function () {
                    console.log("error！")
                }
            })
        }
    </script>
</head>
<body>
    <!-- 顶部开始 -->
    <div class="container">
        <div class="logo"><a href="./index.html">向阳花设备管理系统</a></div>
        <div class="left_open">
            <i title="展开左侧栏" class="iconfont">&#xe699;</i>
        </div>

        <ul class="layui-nav right" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">${sessionScope.LoginUser.username}</a>
            <dl class="layui-nav-child"> <!-- 二级菜单 -->
              <dd><a onclick="x_admin_show('个人信息','${pageContext.request.contextPath}/member-password.jsp')">个人信息</a></dd>
              <dd><a href="${pageContext.request.contextPath}/loginController/returnLogin">切换帐号</a></dd>
              <dd><a href="${pageContext.request.contextPath}/loginController/returnLogin">退出</a></dd>
            </dl>
          </li>
        </ul>
    </div>
    <!-- 顶部结束 -->
    <!-- 中部开始 -->
     <!-- 左侧菜单开始 -->
    <div class="left-nav">
      <div id="side-nav">
        <ul id="nav">
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b8;</i>
                    <cite>设备管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li date-refresh="1">
                        <a _href="${pageContext.request.contextPath}/member-list.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>设备增加列表</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath}/repertory.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>库存管理</cite>
                        </a>
                    </li >
                    <li date-refresh="1">
                        <a _href="${pageContext.request.contextPath}/repertory_out.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>出库管理</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>运行管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/run_faultRegister.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>设备故障登记</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath}/order-list.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>故障维修管理</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath}/order-list.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>维修记录查询</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath}/order-list.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>设备封存管理</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="${pageContext.request.contextPath}/order-list.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>封存记录查询</cite>
                        </a>
                    </li >

                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>报废管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/srcap.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>设备报废管理</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>基础信息管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/management-department.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>组织管理</cite>
                        </a>
                    </li >
                </ul>
                <ul class="sub-menu">
                    <li>
                        <a _href="${pageContext.request.contextPath}/management-employee.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>员工管理</cite>
                        </a>
                    </li >
                </ul>
                <ul class="sub-menu">
                    <li>
                        <a _href="city.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>生产商管理</cite>
                        </a>
                    </li >
                </ul>
                <ul class="sub-menu">
                    <li>
                        <a _href="city.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>供应商管理</cite>
                        </a>
                    </li >
                </ul>
            </li>

        </ul>
      </div>
    </div>
    <!-- <div class="x-slide_left"></div> -->
    <!-- 左侧菜单结束 -->
    <!-- 右侧主体开始 -->
    <div class="page-content">
        <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
          <ul class="layui-tab-title">
            <li class="home"><i class="layui-icon">&#xe68e;</i>我的桌面</li>
          </ul>
          <div class="layui-unselect layui-form-select layui-form-selected" id="tab_right">
                <dl>
                    <dd data-type="this">关闭当前</dd>
                    <dd data-type="other">关闭其它</dd>
                    <dd data-type="all">关闭全部</dd>
                </dl>
          </div>
          <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='${pageContext.request.contextPath}/welcome.jsp' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
          </div>
          <div id="tab_show"></div>
        </div>
    </div>
    <div class="page-content-bg"></div>
    <!-- 右侧主体结束 -->
    <!-- 中部结束 -->
    <!-- 底部开始 -->
    <div class="footer">
        <div class="copyright">Copyright ©2019 天意无情 All Rights Reserved</div>
    </div>
    <!-- 底部结束 -->
    <script>
    //百度统计可去掉
    var _hmt = _hmt || [];
    (function() {
      var hm = document.createElement("script");
      hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
      var s = document.getElementsByTagName("script")[0]; 
      s.parentNode.insertBefore(hm, s);
    })();


    </script>
</body>
</html>