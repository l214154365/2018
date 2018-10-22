$(function(){
	  $.ajax({
		  url:"/T_e_s/query_info",
		  dataType:"json",
		    success:function(data){
		    	console.log(data)
		    	$("#t_n").val(data.username)
		    	$("#t_i1").val(data.user_id)
		    	$("#t_p").val(data.password)
		    }
	  })
	  
	   $("#queding").click(function(){
    	 
    	 $.ajax({
    		 url:"/T_e_s/updateinfo",
    		 data:{
    			 user_id:$("#t_i1").val(),
    			 password:$("#t_p").val()
    		 },
    		 dataType:"json",
    		 success:function(data){
			    	alert("更新成功")
			    }
    	 })
    	 
     })
})