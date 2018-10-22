$(function(){
     $("#sure").click(function(){
    	    var clazz_name=$("#clazzname").val();
    	    var clazz_num=$("#clazznum").val();
    	 $.ajax({
    		 url:"/T_e_s/insert_clazz",
    		 data:{
    			 Clazz_Name:clazz_name,
    			 Clazz_Id:clazz_num	 
    		 },
    		 dataType:"json",
    		 success:showsuccess		 
    	 })
    	 function showsuccess(data){
    		 alert("添加成功")
    	 }
     })
	
	
})