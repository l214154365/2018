<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'indicator.jsp' starting page</title>
    
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
     <script src="js/xlsx.core.min.js"></script>
     <script src="js/xlsx.full.min.js"></script>
     <script src="js/nav.js"></script>
     <script>
     function proJSON(oldArr,f_id) {
      var newArr = [];
     var self = this;
     oldArr.map(function(item) {
         if(item.f_id == f_id) {
             var obj = {
                 Id:item.id,
                 text: item.indicator_name,
                 in_type:item.in_type,
                 weight:item.weight,
                 F_id:item.f_id,
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


 
	//找到当前节点id
	var nodeid = $(target).attr('data-nodeid');
	var tree = $('#tree');
	//获取当前节点对象
	var node = tree.treeview('getNode', nodeid);
	$(".indicator_name2").text("当前选择的节点是:")
	$(".indicator_name2").append(node.text);
	$("#in_type").val(node.in_type);
	$("#F_id").val(node.Id);
	console.log("存入标签"+$("#F_id").val());
	
}
$(function(){

   $("#info").click(function(target){
   var indicator_name=$("#indicator_name").val();
   var weight=$("#weight").val();
   var F_id=$("#F_id").val();
   var in_type=$("#in_type").val();
   console.log("取出存入的值"+F_id);
   $.ajax({
   type:"POST",
   url:"/T_e_s/insertindicator",
   dataType:"json",
   
   data:{
   indicator_name:indicator_name,
   weight:weight,
   F_id:F_id,
   in_type:in_type,
   },
   
   success : Showsuccess
   });
   function Showsuccess(data){
   alert("添加成功！")
   }
   })
})
$(function(){
  
  $(".submit").click(function(){
	 $.ajax({
	     type: "POST",
	     url: "/T_e_s/selectindicator",
	     dataType: "json",
	     success : Showsuccess
	     });
	   function Showsuccess(data){
	        
	        var testdata = proJSON(data,0);
	       $('#tree').treeview({
	             data: testdata,//节点数据
	             levels:10,
	              state: { //描述节点的初始状态    Object
            checked: true, //是否选中节点
            /*disabled: true,*/ //是否禁用节点
            expanded: true, //是否展开节点
            selected: true, //是否选中节点
	        
        }
	             
	         })
	          
	          console.log(testdata)
		 
	 }

 })



  /**
     录入信息
   **/ 
  /* $("#upload").click(function(){
    $.ajax({
              type: "POST",
              url: "/T_e_s/insert_department",
              data:{
                  info:str2,
              },
              dataType: "json",
              success : Showsuccess,
             
     });
      function Showsuccess(data){
       alert("上传成功")
      } 
  })*/
  
 
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
          <h1 id="m_title_1">指标管理</h1>
          <hr style="border:1px solid black;"/>
          </div>
          <div class="row-fluid">
				<div class="span4">
				<h1 id="m_title">添加指定指标</h1>
				<hr style="border:1px solid black;"/>
				 <div>
                      <div>
                      <span class="indicator_name2" id="indicator_name2">当前选择的节点是:</span><input type="hidden" value="321" id="F_id"/><input type="hidden"  id="in_type"/>
                      <br/>
                      <input type="hidden" value="321" id="F_id"/><input type="hidden"  id="in_type"/>
                      <span class="indicator_name">指标名称:<input type="text" id="indicator_name"></span> <br/>
                      <span class="weight">指标权重:<input type="text" id="weight"></span><br>
                      <button class="add" id="info" style="margin-botton:5px">添加指标</button> 
                      </div>
                      <button class="submit" style="margin-top:5px">查看指标树形图</button>
                   
                </div>  
				</div>
				<div class="span4" style="width:65%">
				<h1 id="m_title" style="text-align:center">指标树形图</h1>
				<hr style="border:1px solid black;"/>
				 <div id="tree"></div>
				</div>
</div>
</div>
</div>
  </body>
</html>
