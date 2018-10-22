<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

    <link rel="stylesheet" type="text/css" href="css/login.css"/>
    <link rel="stylesheet" type="text/css" href="fronts_css/font-awesome.min.css"/>
    <script src="js/jquery-3.2.1.min.js"></script>
    <script>
        $(function(){
          $("#button_login").click(function(){
              var username=$("#username").val();
              var password=$("#password").val();
              var url="/T_e_s/login_submit";
              var param={
                  username:username,
                  password:password
              }
              $.post(url,param,function(data){
                  if(data!=0){
                      alert("登录成功");
                      location.href="/T_e_s/main";
                  }else{
                      alert("登录失败");
                  }
              })
          })

        })
        </script>
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <h1 id="title">教师综合评价系统</h1>
        </div>
    </div>
    <div class="row-fluid">
        <div class="span12">
                    <div>
                    <h1 id="title1">用户登录</h1>
                       <input type="text" placeholder="用户名"
                               id="username" name="username"/>

                        <input type="password" placeholder="密&emsp;码"
                               id="password" name="password"/>

                    <div class="button">
                        <button type="button" id="button_login" title="登录">登&ensp;录</button>
                    </div>
                    </div>
        </div>
    </div>
</div>
</body>
</html>