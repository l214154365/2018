$(function(){
	
	resetpd=function(data){
		$.ajax({
			url:"/T_e_s/resetstudent",
			data:{
				s_id:data,
			},
		    dataType:"json",
		    success:function(data){
		    	alert("重置成功")
		    }
		})
	}
	
	deletetea=function(t_id){
		 var result=confirm("删除该学生？");
		 if(result){
			 $.ajax({
					url:"/T_e_s/delete_student",
					data:{
						t_id:t_id,
					},
				    dataType:"json",
				    success:function(data){
				    	alert("删除成功")
				    }
				})		 
			 
		 }
		
	}
	
	 $("#cross").click(function(){
		 $("#updateteainfo").css({
            display:"none"
        })
		 
	 })
	 
	updatetea=function(s_id){
		
	      var login_w=$("#selectcourse").width();
         var login_h=$("#selectcourse").height();
		   $("#updateteainfo").css({
			      left:($("#aaa").width()-login_w)/2,
	              top:($("#aaa").height()-login_h)/2,
	              display:"block"
		   })
		  $.ajax({
			  url:"/T_e_s/selectstudent",
			  data:{
				  s_id:s_id, 
			  },
			  dataType:"json",
			    success:function(data){
			    	console.log(data)
			    	$("#t_i").val(data[0].s_id)
			    	$("#t_n").val(data[0].s_name)
			    	$("#t_i1").val(data[0].s_id)
			    	$("#t_p").val(data[0].s_pass)
			    	$("#t_d").val(data[0].clazz_id)
			    }
		  })
	}
	 
	 
    $("#queding").click(function(){
   	 
   	 $.ajax({
   		 url:"/T_e_s/updatestu",
   		 data:{
   			s_id:$("#t_i").val(),
   			s_name:$("#t_n").val(),
   			s_pass:$("#t_p").val(),
   			clazz_id:$("#t_d").val()
   		 },
   		 dataType:"json",
   		 success:function(data){
			    	alert("更新成功")
			    }
   	 })
   	 
    })
	
})