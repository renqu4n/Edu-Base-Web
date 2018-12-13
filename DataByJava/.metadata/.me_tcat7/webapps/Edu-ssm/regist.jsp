<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>注册页面</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<!-- -->
<script>
function check(form) {
            var p1 = form.user_password;
            var p2 = form.user_password1;
            if (p1.value != p2.value) {
                p2.oninvalid();
                return false;
            }
            return true;
        }
        onload = function() {
            var p2 = document.forms["my_f1"].user_password1;
            p2.oninvalid = function() {
                this.setCustomValidity("密码不一致，请重新输入");
            }
            p2.oninput = function() {
                this.setCustomValidity("");
            }
 
        }
</script>
<script type="text/javascript">
	function change(){
		//切换验证码
		document.getElementById("myimg").src="/Edu-ssm/CheckcodeServlet?"+new Date().getTime();
	}
</script>
</head>
<body>
<a href="index.html"><span style="color: white;font-size:20px;margin-left: 0.4%">首页</span></a>
<a href="login.html"><span style="color: white;font-size:20px;margin-left: 1%">登录</span></a>
<!-- contact-form -->	
<div class="message warning">
<div class="inset">
	<div class="login-head">
		<h1>Regist Form</h1>
		  			
	</div>
		<form action="regist.do" name="my_f1" method="post" onsubmit="return check(this);">
			
			


			<li>
				<input type="text" class="text" placeholder="name" name="user_name"  autocomplete="off" required>
				
			</li>
				
			<li>
				<input type="password" placeholder="password"  name="user_password" autocomplete="off" required> 
				
			</li>
			<li>
				<input type="password" placeholder="password"  name="user_password1" autocomplete="off" required> 
				
			</li>

			<li>
				<input type="text"  class="text" placeholder="e_mail" name="user_email"   autocomplete="off" pattern="[^@]+@[^@]+\.[a-zA-Z]{2,6}" required>
				
			</li>
			<li>
				<input type="text"  placeholder="code"  name="checkcode" autocomplete="off" required="required"> <br>
			</li>
			
			<img id="myimg"  src="/Edu-ssm/CheckcodeServlet" style="cursor:pointer; " onclick="change();"/>
			
			<h3 style="color:red;">${msg }</h3>
			

			
			
			<div class="submit">
				<input type="submit"  value="Sign in" >
				<h4><a href="findUser.jsp">Lost your Password ?</a></h4>
						  	
			</div>
				
		</form>
		</div>					
	</div>
	</div>
	
<!--- footer --->

<div class="footer">
	<p>教育网.@小队</p>
</div>

</body>
</html>