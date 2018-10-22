<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
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
      function proJSON(oldArr,f_id) {
      var newArr = [];
     var self = this;
     oldArr.map(function(item) {
         if(item.f_id == f_id) {
             var obj = {
                 Id:item.id,
                 text: item.indicator_name,
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
 // var val1=$('input:radio[name="role"]:checked').val();
  //var val=$('input:radio[name="f_s"]:checked').val();
 var result=confirm("确定删除本节点？");

 var menu_id;
 var nav_id;
 var parent_id;
 var F_id;
	//找到当前节点id
	var nodeid = $(target).attr('data-nodeid');
	var tree = $('#tree');
	//获取当前节点对象
	var node = tree.treeview('getNode', nodeid);
	
	data2={
	Id:node.Id,
	nav_id:node.nav_id,
	parent_id:node.parent_id,
	role_menu:node.role_menu,
	}
	console.log(data2)
	if(result){	
	$.ajax({
	url:"/T_e_s/deleteM",
	dataType:"json",
	data:data2,
	success:showsuccess
	})
	function showsuccess(data){
	 alert("成功")
	$('.submit').trigger("click");
	}
 
 
 }
 

	
	/*if(node.state.expanded){ 
	    //处于展开状态则折叠
	    tree.treeview('collapseNode', node.nodeId);  
	} else {
	    //展开
	    tree.treeview('expandNode', node.nodeId);
	}*/
} 

function itemOnclick(target){



	//找到当前节点id
	var nodeid = $(target).attr('data-nodeid');
	var tree = $('#tree');
	//获取当前节点对象
	var node = tree.treeview('getNode', nodeid);
	
	if(node.state.expanded){ 
	    //处于展开状态则折叠
	    tree.treeview('collapseNode', node.nodeId);  
	} else {
	    //展开
	    tree.treeview('expandNode', node.nodeId);
	}
}
  $(function(){
  
   $(".submit").click(function(){
	 $.ajax({
	     type: "POST",
	     url: "/T_e_s/a2",
	     dataType: "json",
	     success : Showsuccess
	     });
	   function Showsuccess(data){
	        
	        var testdata = proJSON(data,0);
	        
	       $('#tree').treeview({
	             data: testdata//节点数据
	         })
	          
	          console.log(testdata)
		 
	 }

 })



 
 })
 </script>
  </head>
  
  <body>
    <div id="tree"></div>
    <button class="submit">1231231321</button>
  </body>
</html>
