<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'teacherShow.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script src="http://libs.baidu.com/jquery/2.0.0/jquery.js"></script>
  </head>
  
  
 
  <body>
    <h1>教师列表</h1>
    	<ul id="list">
  
  
    	</ul>
  
    <script type="text/javascript">
    	$.post("teacher/teacherShow.do",function(teacherShow){
    		//console.log(teacherShow);
    		
    		for(var i=0;i<teacherShow.length;i++){
    			
    			var teacher = teacherShow[i];
    			var cName = teacher.cName;
    			var eName = teacher.eName;
    			var teacher_image = teacher.teacher_image;
    			var teacher_info = teacher.teacher_info;
    			
    			$("#list").append("<li>"+cName+"</li>");
    		 	$("#list").append("<li>"+eName+"</li>");
    		 	$("#list").append("<li>"+teacher_image+"</li>");
    		 	$("#list").append("<li>"+teacher_info+"</li>");
    		 	
				/* $("#list").append("<li>"+teacherShow[i]["cName"]+"</li>");
				
    		 	$("#list").append("<li>"+teacherShow[i]["cName"]+"</li>");
    		 	$("#list").append("<li>"+teacherShow[i]["eName"]+"</li>");
    		 	$("#list").append("<li>"+teacherShow[i]["teacher_image"]+"</li>");
    		 	$("#list").append("<li>"+teacherShow[i]["teacher_info"]+"</li>"); */
    		}
    	});
   
    </script>
    
    
    
    

  </body>
</html>