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
	<link rel="stylesheet" type="text/css" href="css/clazzAcourse.css"/>
     <script src="js/jquery-3.2.1.min.js"></script>
     <script src="js/bootstrap.min.js"></script>
     <script src="js/xlsx.core.min.js"></script>
     <script src="js/xlsx.full.min.js"></script>
     <script src="js/nav.js"></script>
     <script src="js/teachAcourse.js"></script>  
     <script>

 $(function(){

  /**
     录入信息
   **/ 
   $("#upload").click(function(){
    $.ajax({
              type: "POST",
              url: "/T_e_s/inserttea_cou",
              data:{
                  info:str2,
              },
              dataType: "json",
              success : Showsuccess,
             
     });
      function Showsuccess(data){
       alert("上传成功")
      } 
  })
  
 
 })
      </script>
      <style>
          label{
          float: left;
          width: 35%;
          }
      </style>
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
          <h1 id="m_title_1">教师课程管理</h1>
          <hr style="border:1px solid black;"/>
          </div>
          <div class="row-fluid">
				<div class="span4" id="aaa">
				
		  <div  id="selectcourse">   
			<i class="fa fa-times" aria-hidden="true" id="cross"></i>
		   <h1 style="text-align: center;">课程选择</h1>  
                          课程:<input id="txt_1" list="datalist_1" placeholder="请选择课程"/>
            <datalist id="datalist_1">
                   
             </datalist>
            <button id="aa" class="btn">添加</button>
        </div>  
        <div  id="selectclazz">   
			<i class="fa fa-times" aria-hidden="true" id="cross1" style=" position: absolute;right: 20px;top: 8px;	"></i>
		   <h1 style="text-align: center;">班级选择</h1>  
                          班级:<input id="txt_2" list="datalist_2" placeholder="请选择班级"/>
            <datalist id="datalist_2">
                   
             </datalist>
            <button id="bb" class="btn">添加</button>
        </div> 
        
				<h1 id="m_title">教师新增课程</h1>
				<hr style="border:1px solid black;"/>
				<form action="queryallteacher">
				<div style="width: 100%; margin: auto;">
				<p>搜索教师:<input class="input-medium search-query" type="text" id="clazz_name" name="title">
				<button type="submit" class="btn" contenteditable="true" id="searche">查找</button></p>
				</div>
				</form>
				<div class="view">
                <table class="table" >
                  <thead>
                    <tr>
                      <th>教师编号</th>
                      <th>教师名称</th>
                      <th>部门编号</th>
                      <th style="text-align: center;">操作</th>
                    </tr>
                    
                  </thead>
                  <tbody>
                    <c:forEach items="${teacher}" var="t">
						<tr>
							<td>${t.t_id}</td>
							<td>${t.t_Name}</td>
							<td>${t.d_id}</td>
							<td>
							<a href="javascirpt:void(0)" onclick="addcourse1(${t.t_id})">添加课程</a>
							<a href="javascirpt:void(0)" onclick="addclazz(${t.t_id})">添加班级</a>
						    </td>
						</tr>
                   		</c:forEach>
                  </tbody>
                </table>
                
                 <table style="width: 100%;">
                 <tr class="trlast" style="width: 100%"> 
               	 <td>
               	 共${pageCount}页,当前第${page}页
				<a href="queryallteacher?cpage=1">首页</a>
				    <c:choose>
					<c:when test="${page-1==0 }">
						上一页
					</c:when>
					<c:otherwise>
						<a href="queryallteacher?cpage=${page-1}">上一页</a>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${page+1>pageCount}">
						下一页
					</c:when>
					<c:otherwise>
						<a href="queryallteacher?cpage=${page+1}">下一页</a>
					</c:otherwise>
				</c:choose>
				<a href="queryallteacher?cpage=${pageCount}">末页</a>	
			</td>
		</tr>
		</table>
              </div>
				</div>
				<div class="span5">
				<h1 id="m_title">教师课表</h1>
				<hr style="border:1px solid black;"/>
		
				<div style="width: 80%; margin: auto;">
				<p>搜索教师课表:<input class="input-medium search-query" placeholder="请输入班级名称" 
				type="text" id="clazz_name1" name="title">
				<button  class="btn" contenteditable="true" id="searche1">查找</button></p>
				</div>
				
               <div class="view">
                <table class="table">
                  <thead id="keb">
                    <tr>
                      <th>班级名称</th>
                      <th>课程名</th>
                    </tr>
                   
                  </thead>
                </table> 
              </div>
				</div>
				<div class="span3">
					<h1 id="m_title">批量新增课程</h1>
				<hr style="border:1px solid black;"/>
				 <a href="javascript:;" class="file">选择文件
                <input type="file" name="" id=""  onchange="importf(this)">
                </a>
                <div id="demo"></div>
                <button id="upload" class="btn">上传</button>
        
				</div>
			</div>
          
       
        
      
</div>
</div>
</div>




<!--  文件上传代码 -->

<script>
    var wb;//读取完成的数据
    var rABS = false; //是否将文件读取为二进制字符串
    var str2="";
    function importf(obj) {//导入
        if(!obj.files) {
            return;
        }
        var f = obj.files[0];
        console.log("obj.files[0]"+obj.files[0]);
        var reader = new FileReader();
        reader.onload = function(e) {
            var data = e.target.result;
            if(rABS) {
                wb = XLSX.read(btoa(fixdata(data)), {//手动转化
                    type: 'base64'
                });
            } else {
                wb = XLSX.read(data, {
                    type: 'binary'
                });
            }

            var cc=new Array();
            var myobj="";
            //wb.SheetNames[0]是获取Sheets中第一个Sheet的名字
            //wb.Sheets[Sheet名]获取第一个Sheet的数据
                for(var i=0;i<wb.SheetNames.length;i++) {
                    document.getElementById("demo").innerHTML = JSON.stringify(XLSX.utils.sheet_to_json(wb.Sheets[wb.SheetNames[i]]));
                     cc[i] =JSON.stringify(XLSX.utils.sheet_to_json(wb.Sheets[wb.SheetNames[i]]));
                }

            var ss =JSON.stringify(XLSX.utils.sheet_to_json(wb.Sheets[wb.SheetNames[0]]));

            var str1="";
            for(var k=0;k<cc.length;k++){
                str1=str1+","+cc[k].substring(1,(cc[k].length-1));

            }
          
            str2="["+str1.substring(1,str1.length)+"]";
           
           
        };
        if(rABS) {
            reader.readAsArrayBuffer(f);
        } else {
            reader.readAsBinaryString(f);
        }
    }

    function fixdata(data) { //文件流转BinaryString
        var o = "",
                l = 0,
                w = 10240;
        for(; l < data.byteLength / w; ++l) o += String.fromCharCode.apply(null, new Uint8Array(data.slice(l * w, l * w + w)));
        o += String.fromCharCode.apply(null, new Uint8Array(data.slice(l * w)));
        return o;
    }

</script>
  </body>
</html>
