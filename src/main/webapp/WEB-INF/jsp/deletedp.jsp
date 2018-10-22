<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	<link rel="stylesheet" type="text/css" href="css/bootstrap-treeview.css"/>
	<link rel="stylesheet" type="text/css" href="css/main.css"/>
	<link rel="stylesheet" type="text/css" href="css/menu.css"/>
	<link rel="stylesheet" type="text/css" href="css/inputstyle.css"/>
     <script src="js/jquery-3.2.1.min.js"></script>
     <script src="js/bootstrap.min.js"></script>
     <script src="js/bootstrap-treeview.js"></script>
     <script src="js/nav.js"></script>
      <script>
      function proJSON(oldArr,department_id) {
      var newArr = [];
     var self = this;
     oldArr.map(function(item) {
         if(item.department_id == department_id) {
             var obj = {
                 Id:item.id,
                 text: item.department_name,
             }
             var childs = self.proJSON(oldArr, item.id);
             if(childs.length > 0) {
                 obj.nodes = childs
             }
             newArr.push(obj)
         }

     })
     return newArr;
 };
 
 function itemOnclick(target){
       var result=confirm("确定删除该部门？");
	//找到当前节点id
	var nodeid = $(target).attr('data-nodeid');
	var tree = $('#departtree');
	//获取当前节点对象
	var node = tree.treeview('getNode', nodeid);
	  depar={
	   Id:node.Id,
	   }
	 
	  if(result){
	   $.ajax({
        url:"/T_e_s/delete_dp",
      data:depar,
      dataType:"json",
      success:showsuccess
     })
     
     function showsuccess(data){
       alert("删除成功")
     }
	  }
    
}
 

 $(function(){
  
  $(".submit").click(function(){ 
	 $.ajax({
	     type: "POST",
	     url: "/T_e_s/select_depar",
	     dataType: "json",
	     success : Showsuccess
	     });
	   function Showsuccess(data){
	        var testdata = proJSON(data,0);
	        console.log(data)
	        console.log(testdata)
	        $('#departtree').treeview({
	             data: testdata//节点数据
	         })
 
	 }

 }) 
 })
      </script>
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
          <h1 id="m_title_1">部门管理</h1>
          <hr style="border:1px solid black;"/>
               <div class="row-fluid">
				<div class="span7">
				<h1 id="m_title">删除部门</h1>
				<hr style="border:1px solid black;"/>
				<button class="submit">查看部门树形图</button> 
				</div>
				<div class="span5">
				<h1 id="m_title">部门树形图</h1>
				<hr style="border:1px solid black;"/>
				 <div id="departtree"></div>
				</div>
			</div>
        
        </div>
       
    </div>
</div>
</div>
</div>
  </body>
</html>
