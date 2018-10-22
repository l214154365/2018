$(function(){
	   var data1="";
       var html=""; 
        var html1="";
   $("#one_bar1").on("click",".one_bar",function(){
         $(this).next().slideToggle();
       // $(this).parent().siblings().children($(this).next().children()).slideUp();
         console.log("$(this)"+$(this));
   });
    $.ajax({
             type: "GET",
             url: "/T_e_s/menu_submit",
             dataType: "json",
             success : Showsuccess
             });
      
       
        function Showsuccess(data){
        	console.log(data[0].context)
        var x=0;
        var html="";
        var html1="";
        var n_id=1;
        var nav_id=new Array();
        for(var i=0;i<data.length;i++){
          if (data[i].nav_id!="0") {
                       n_id++;
						nav_id[n_id] = data[i].nav_id;

				html=$("<li><a href='"+data[i].a_context+"' class='one_bar'>"+data[i].context+"</a> <ul class='two_bar'></ul></li>")
				$("#one_bar1").append(html); 		
          }
          if (data[i].parent_id == nav_id[n_id]) {
           
                   html1=$("<a href='"+data[i].a_context+"'><li>"+data[i].context+"</li></a>")
			        $(".two_bar").eq(nav_id[n_id]-1).append(html1);
					}
        }
       
       }
            
})