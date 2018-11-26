<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>培训课程列表</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script src="http://libs.baidu.com/jquery/2.0.0/jquery.js"></script>
  </head>
  
  
 
  <body>
    <h1>课程列表</h1>
    	<ul id="list">
  
  
    	</ul>
  
    <script type="text/javascript">
    	$.post("coshow/courseshow.do",function(courseshow){
    		//console.log(teacherShow);
    		
    		for(var i=0;i<courseshow.length;i++){
    			
    			var course = courseshow[i];
    			var course_name = course.course_name;
    			var course_image = course.course_image;
    			var course_description = course.course_description;
    			var course_video = course.course_video;
    			
    		 	$("#list").append("<li>"+course_name+"</li>");
    		 	$("#list").append("<li>"+course_image+"</li>");
    		 	$("#list").append("<li>"+course_description+"</li>");
    		 	$("#list").append("<li>"+course_video+"</li>");
    		 	
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
