$(function(){
	
	updatetask=function(id){
		 var result=confirm("确定开启任务？");
		 if(result){
				$.ajax({
					url:"/T_e_s/updatestatus",
					data:{
						id:id,
					},
				    dataType:"json",
				    success:function(data){
				    	alert("开启成功")
				    }
				})		 
		 }	
	
	}
	
	closetask=function(id){
		var result=confirm("确定关闭任务？");
		if(result){
			$.ajax({
				url:"/T_e_s/closestatus",
				data:{
					id:id,
				},
				dataType:"json",
				success:function(data){
					alert("成功关闭")
				}
			})
		}
		
	}
	
	deletetea=function(id){
		 var result=confirm("删除该任务？");
		 if(result){
			 $.ajax({
					url:"/T_e_s/deletetask",
					data:{
						id:id,
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
	 
	update=function(id){
		
	      var login_w=$("#selectcourse").width();
          var login_h=$("#selectcourse").height();
		   $("#updateteainfo").css({
			      left:($("#aaa").width()-login_w)/2,
	              top:($("#aaa").height()-login_h)/2,
	              display:"block"
		   })
		  $.ajax({
			  url:"/T_e_s/query_task",
			  data:{
				  id:id, 
			  },
			  dataType:"json",
			    success:function(data){
			    	console.log(data)
			    	$("#t_i").val(data[0].id)
			    	$("#t_n").val(data[0].status)
			    	$("#t_i1").val(data[0].s_time)
			    	$("#t_p").val(data[0].e_time)
			    	$("#t_d").val(data[0].m_name)
			    }
		  })
	}
	 
	 
     $("#queding").click(function(){
    	 
    	 $.ajax({
    		 url:"/T_e_s/updatesta",
    		 data:{
    			id:$("#t_i").val(),
    			s_time:$("#t_i1").val(),
    			e_time:$("#t_p").val(),
    			m_name:$("#t_d").val()
    		 },
    		 dataType:"json",
    		 success:function(data){
			    	alert("更新成功")
			    }
    	 })
    	 
     })
	
})