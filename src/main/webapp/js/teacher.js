$(function(){
	
	resetpd=function(t_id){
		 var result=confirm("重置教师密码？");
		 if(result){
				$.ajax({
					url:"/T_e_s/resetteacher",
					data:{
						t_id:t_id,
					},
				    dataType:"json",
				    success:function(data){
				    	alert("重置成功")
				    }
				})		 
		 }
	
	}
	
	deletetea=function(t_id){
		 var result=confirm("删除该教师？");
		 if(result){
			 $.ajax({
					url:"/T_e_s/delete_teacher",
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
	 
	updatetea=function(t_id){
		
	      var login_w=$("#selectcourse").width();
          var login_h=$("#selectcourse").height();
		   $("#updateteainfo").css({
			      left:($("#aaa").width()-login_w)/2,
	              top:($("#aaa").height()-login_h)/2,
	              display:"block"
		   })
		  $.ajax({
			  url:"/T_e_s/selectteacher",
			  data:{
				  t_id:t_id, 
			  },
			  dataType:"json",
			    success:function(data){
			    	console.log(data)
			    	$("#t_i").val(data[0].t_id)
			    	$("#t_n").val(data[0].t_Name)
			    	$("#t_i1").val(data[0].t_id)
			    	$("#t_p").val(data[0].t_Pass)
			    	$("#t_d").val(data[0].d_id)
			    }
		  })
	}
	 
	 
     $("#queding").click(function(){
    	 
    	 $.ajax({
    		 url:"/T_e_s/updateteacher",
    		 data:{
    			t_id:$("#t_i").val(),
    			t_Name:$("#t_n").val(),
    			t_Pass:$("#t_p").val(),
    			d_id:$("#t_d").val()
    		 },
    		 dataType:"json",
    		 success:function(data){
			    	alert("更新成功")
			    }
    	 })
    	 
     })
	
})