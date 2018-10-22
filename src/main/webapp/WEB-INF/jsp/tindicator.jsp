<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'tindicator.jsp' starting page</title>
    
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
 $(".push").click(function(){
 alert("a123")
 $.cookie('tid', $("#tid").val())
  $(window).attr('location',"${pageContext.request.contextPath }/tindicator_next");
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
        <!-- 内容 -->
        <div>
          	<table>
          		<thead>
                   <th>教师</th>
                   <th>教师编号</th>
                   <th>状态</th>
 </thead>
 <tbody>
 
        <c:forEach items="${ger}" var="item">
        <input type="hidden" value="${item.getT_id()}" id="tid" />
				<tr>
					<td>${item.getT_Name()}</td>
					<td>${item.getT_id()}</td>
					<td><button type="button" class="push">评教</button></td>
        </c:forEach>
 </tbody>
          	</table>
          	<ul id="load" style="float:left;margin-left:500px"></ul>
        </div>
  </body>
</html>
