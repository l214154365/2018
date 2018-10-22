
$(function(){
	   var data1="";
       var html=""; 
        var html1="";
        var html2="";
   $("#one_s1").on("click",".one_s",function(){
         $(this).next().slideToggle();
       // $(this).parent().siblings().children($(this).next().children()).slideUp();
         console.log("$(this)"+$(this));
   });
   window.onload=$(function(){
    	
       
       
       });
   
})