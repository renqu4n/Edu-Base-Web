<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'testStudentThink.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  <script type="text/javascript">
    function chkinput(form)
    {  
        
       if(form.input.value==""){
        alert("输入内容不能为空");
        form.input.focus();
        return false;
       }
      return ture;
    }
    
    function loginConfirm() {
		var user='<%=session.getAttribute("users")%>';
		if (user=="null"||user=="") {
			alert("您还没有登录！！！！！！！！滚回去登陆！！");
			return false;
		} 
	}
  </script>
  </head>
  
  <body>
   
    <form action="insertMessage.do" onsubmit=" return chkinput(this)" method="post">
       <input type="text" placeholder="请输入你的留言" name="input">
       <input type="submit" value="提交" name="submit">
    </form>
    <a href="index.html">跳转到主页</a>
    <a href="jump.do?target=teacherShow">查看老师信息</a>
    <a href="jump.do?target=courseShow">查看课程信息</a>
  </body>
</html>
