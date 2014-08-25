<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link href="js/dwz/themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="js/dwz/themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>
<link href="js/dwz/themes/css/print.css" rel="stylesheet" type="text/css" media="print"/>
<link href="js/dwz/uploadify/css/uploadify.css" rel="stylesheet" type="text/css" media="screen"/>
<script src="js/dwz/js/jquery-1.7.2.js" type="text/javascript"></script>
<script src="js/dwz/js/jquery.cookie.js" type="text/javascript"></script>
<script src="js/dwz/js/jquery.validate.js" type="text/javascript"></script>
<script src="js/dwz/js/jquery.bgiframe.js" type="text/javascript"></script>
<script src="js/dwz/xheditor/xheditor-1.2.1.min.js" type="text/javascript"></script>
<script src="js/dwz/xheditor/xheditor_lang/zh-cn.js" type="text/javascript"></script>
<script src="js/dwz/uploadify/scripts/jquery.uploadify.js" type="text/javascript"></script>
<script type="text/javascript" src="js/dwz/chart/raphael.js"></script>
<script type="text/javascript" src="js/dwz/chart/g.raphael.js"></script>
<script type="text/javascript" src="js/dwz/chart/g.bar.js"></script>
<script type="text/javascript" src="js/dwz/chart/g.line.js"></script>
<script type="text/javascript" src="js/dwz/chart/g.pie.js"></script>
<script type="text/javascript" src="js/dwz/chart/g.dot.js"></script>
<script src="js/dwz/bin/dwz.min.js" type="text/javascript"></script>
<script src="js/dwz/js/dwz.regional.zh.js" type="text/javascript"></script>
