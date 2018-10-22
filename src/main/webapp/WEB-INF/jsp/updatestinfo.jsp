<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'main.jsp' starting page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="fronts_css/font-awesome.min.css"/>
	<link rel="stylesheet" type="text/css" href="css/bootstrap1.min.css"/>
	<link rel="stylesheet" type="text/css" href="css/main.css"/>
	<link rel="stylesheet" type="text/css" href="css/inputstyle.css"/>
     <script src="js/jquery-3.2.1.min.js"></script>
     <script src="js/bootstrap.min.js"></script>
     <script src="js/nav.js"></script>
     <script src="js/updateifo.js"></script>
    
        
</head>
  
  <body>
<div class="container-fluid">

    <div class="row-fluid">
        <!--头部-->
        <div class="span12" style="height: 140px;">
            <span class="row-tit">教师综合评价系统</span>
            <span class="fa fa-sign-out" style="font-size:50px" title="退出登录">
                <p>退出</p>
            </span>
        </div>
    </div>

    <div class="row-fluid">
         <!--侧边导航-->
        <div class="span2">
          <div id="userinfo">
        用户信息
				</div>
          <div class="top_bar">
             <ul id="one_bar1">
       
             </ul>
          </div>
           
        </div>
         <!--内容-->
        <div class="span10">
          <div id="span10_title">
          <h1 id="m_title_1">信息修改</h1>
          <hr style="border:1px solid black;"/>
          </div>
          <div class="row-fluid">
				
				<div class="span12">
			     <div id="updateteainfo1" style="width: 100%;">
				 <i class="fa fa-times" aria-hidden="true" id="cross"></i>
        
				<div style="width: 35%; margin: auto;">
				<input class="input-medium search-query" type="hidden" id="t_i" name="t_i">
				<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名称:<input class="input-medium search-query" readonly="readonly" type="text" id="t_n" name="t_name">
				<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;号账:<input class="input-medium search-query" readonly="readonly" type="text" id="t_i1" name="t_id">
				<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密码:<input class="input-medium search-query"  type="text" id="t_p" name="t_pass">
				<div style="width: 60px; margin-left: 30%;"><button class="btn" contenteditable="true" id="queding" >确定</button></div>
				</p>  
				</div>
		
				</div>
				</div>
			</div>
               
        
      
</div>
</div>
</div>





  </body>
</html>
