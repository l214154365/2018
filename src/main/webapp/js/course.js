$(function(){
     $("#sure").click(function(){
    	    var course_name=$("#clazzname").val();
    	    var course_id=$("#clazznum").val();
    	 $.ajax({
    		 url:"/T_e_s/insert_course",
    		 data:{
    			 Course_name:course_name,
    			 Course_id:course_id	 
    		 },
    		 dataType:"json",
    		 success:showsuccess		 
    	 })
    	 function showsuccess(data){
    		 alert("添加成功")
    	 }
     })
	
     
      

	
})