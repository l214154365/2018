$(function(){
    
 $("#definite").click(function(){
	 
	 var val=$('input:radio[name="role"]:checked').val();
	 $.ajax({
         type: "POST",
         url: "/T_e_s/get_menu",
         data:{
        	 role_menu:val	 
         },
         dataType: "json",
         success : Showsuccess
         });
	 function Showsuccess(data){
		 var html="";
		 for(var i=0;i<data.length;i++){
			 if(data[i].nav_id!=null&&data[i].nav_id!=""){
				 html="<option data-id='"+data[i].menu_id+"' value='"+data[i].context+"'>"+data[i].nav_id+"</option>"; 	
				 $("#datalist_1").append(html);
			 }else{
				 html="<option data-id='"+data[i].menu_id+"' value='"+data[i].context+"'>"+data[i].parent_id+"</option>"; 
				 $("#datalist_1").append(html);
			 }
			
			
		 }
	 }
	 
 })

 
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
 });
 
 
 
 
 


        
});