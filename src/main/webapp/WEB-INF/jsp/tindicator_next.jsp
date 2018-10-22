<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tindicator_next.jsp' starting page</title>
    
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
     <script src="js/jquery.cookie.js"></script>
     <script src="js/bootstrap-treeview.js"></script>
     <script src="js/xlsx.core.min.js"></script>
     <script src="js/xlsx.full.min.js"></script>
     <script src="js/nav.js"></script>
    <script src="js/test_nav.js"></script>
    <script>
       function readTree(node, ul) {
             
           var count=0; 
            
            var nodes = node.nodes; 
      
 
            if (nodes!=null && nodes.length!=0) { 
                     var li = $(["<li>" + 
                     	node.text + 
                    "</li>"].join("")).appendTo(ul); 
                   // ul = $("<ul></ul>").appendTo(li); 
                for (var i=0 ; i < nodes.length; i++) { 
                         
                  if(nodes[i].text.indexOf("A")!=-1||nodes[i].text.indexOf("B")!=-1||nodes[i].text.indexOf("C")!=-1||nodes[i].text.indexOf("D")!=-1){
                           console.log("nodes[i]="+nodes[i].text+"i="+i)
                         var li = $(["<li><input type='radio' name='"+nodes[i].F_id+"' value='"+nodes[i].weight+"' />" + 
                    nodes[i].text + 
                    "</li>"].join("")).appendTo(ul);
                      }                     
                       readTree(nodes[i], ul); 
                           count++;
                      }    
                } 
           
        
        } 
      
      
      
      
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
 $(function(){
 window.onload($(function(){
 $.ajax({
             type: "GET",
             url: "/T_e_s/selecttindicator",
             dataType: "json",
             success : Showsuccess
             });
  
        function Showsuccess(data){
        console.log(data)
        var x=0;
        var html="";
        var html1="";
        var n_id=1;
        var F_id=new Array();
         console.log(proJSON(data,0))
            readTree(proJSON(data,0)[0],$("#load")); 
            var btn = $(["<li><input type='button' id='btn' value='提交'/></li>"].join("")).appendTo($("#load"));
        }
        
        
   })
 )})
$(function(){
 $("#load").on("click","#btn",function(){
         var f=0;
  $.ajax({
             type: "GET",
             url: "/T_e_s/selecttindicator",
             dataType: "json",
             success : Showsuccess
             });
             function Showsuccess(data){
             console.log(data);
       	for(var i = 0 ;i<data.length;i++){
       	if(data[i].f_id=="1"){
       			console.log(data[i].weight)
       			console.log( $("input[name='"+data[i].id+"']:checked").val())
       			console.log("123")
       			f=f+data[i].weight*$("input[name='"+data[i].id+"']:checked").val()
       			console.log(f)
       		}
       		
       	} 
        }   setTimeout(function () {

$.ajax({
             type: "POST",
             url: "/T_e_s/inserscsore",
             dataType: "json",
              data:{
              f:f,
              tid:$.cookie('tid')
   },
             success : Showsuccess
             });
    }, 500);
          	alert("评教成功！")
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
          <h1 id="m_title_1">教师评教</h1>
          <hr style="border:1px solid black;"/>
          </div>
          <div class="row-fluid">
				<div class="span4" style="width:100%">
				 <div id="tree">
				 <ul id="load" style="float:left;margin-left:500px"></ul>
				 </div>
				</div>
</div>
</div>
</div>
  </body>
</html>
