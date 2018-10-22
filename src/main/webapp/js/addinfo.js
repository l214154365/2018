 $(function(){
        
	 var value_id;
	 var iiid;
	 addcourse=function (id){
		    iiid=id;
		  var login_w=$("#selectcourse").width();
          var login_h=$("#selectcourse").height();
          $("#selectcourse").css({
              left:($("#aaa").width()-login_w)/2,
              top:($("#aaa").height()-login_h)/2,
              display:"block"
          }).fadeIn(2000);
          
          $.ajax({
       		 type: "POST",
              url: "/T_e_s/select_course",
              dataType: "json",
              success :Showsuccess 
       		  
       	  });
       	  function Showsuccess(data){
       		  var html="";
               for(var i=0;i<data.length;i++){
       			html=html+"<option data-id='"+data[i].course_id+"' value='"+data[i].course_name+"'>课程编号:"+data[i].course_id+"</option>"
       			
       		  }
               $("#datalist_1").html(html);
       	  }
		 
	 }
	 
	 
	 $("#txt_1").on("input",function(){
	     var $options=$("#datalist_1").children();
	     for(var i=0;i<$options.length;i++){
	         if($options.eq(i).val().trim()==$("#txt_1").val().trim()){
	        	 value_id=($options.eq(i).attr("data-id"));
	             break;
	         }else{
	        	 value_id=($("#txt_1").val());
	         }
	     }
	 })
	 
	 $("#aa").click(function(){  
		 $.ajax({
			 url:"/T_e_s/insertclacou",
			 data:{
				 clazz_id:iiid,
				 course_id:value_id
			 },
			 dataType:"json",
			 success:showsuccess	 
		 })
		 function showsuccess(data){
			 alert("添加成功")
			 $("#txt_1").val("");
		 }
	 })
	 
	 
	 $("#cross").click(function(){
		 $("#selectcourse").css({
             display:"none"
         })
		 
	 })
	 
	 $("#searche1").click(function(){
		 var html="<tr><th>班级名称</th><th>课程名</th><th>任课老师</th></tr>";  
		 var val=$("#clazz_name1").val();
		 $.ajax({
			 url:"/T_e_s/selectkebiao",
			 data:{
				 clazz_name:val
			 },
			 dataType:"json",
			 success:showsuccess
		 })
		 function showsuccess(data){
			if(data=="0"){
				html='';
				alert("暂无数据")	
				html="<tr><th>班级名称</th><th>课程名</th><th>任课老师</th></tr>";  
				$("#keb").html(html);
			}else{
				 for(var i=0;i<data.length;i++){
					 html= html+"<tr><td>"+data[i].clazz_name+"</td><td>"+data[i].course_name+"</td><td>"+data[i].t_name+"</td></tr>";
					
					// html="";
				 }
				 $("#keb").html(html);
			}  
		 }
	 })
	 
})
