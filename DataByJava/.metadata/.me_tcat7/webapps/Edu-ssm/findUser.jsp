<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>找回账户页面</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<!-- -->
<script>var __links = document.querySelectorAll('a');function __linkClick(e) { parent.window.postMessage(this.href, '*');} ;for (var i = 0, l = __links.length; i < l; i++) {if ( __links[i].getAttribute('data-t') == '_blank' ) { __links[i].addEventListener('click', __linkClick, false);}}</script>
<script src="js/jquery.min.js"></script>


<script type="text/javascript">
	function change(){
		//切换验证码
		document.getElementById("myimg").src="/Edu-ssm/checkcode?"+new Date().getTime();
	}
</script>



<script>$(document).ready(function(c) {
	$('.alert-close').on('click', function(c){
		$('.message').fadeOut('slow', function(c){
	  		$('.message').remove();
		});
	});	  
});

	// function printOut()
	// {
	// //获取radio的值
	//   var list = document.getElementsByName("abc");
	//   for( i =0 ; i<list.length; i++ )
	//   {
	// 	if( list[i].checked == true )
	// 	{
	// 	  //如果选择OA办公登录
	// 	  if(list[i].value=="用户")
	// 		{
			  
	// 		  document.form1.action="userLogin.do"; 
	// 		  document.form1.click (); 
	// 		  break;
	// 		}
	// 	 //如果选择登录邮箱
	// 	  if(list[i].value=="管理员")
	// 		{
	// 		  document.form1.action="checkAdmin.do"; 
	// 		  document.form1.click (); 	
	// 		  break;
	// 		}
	// 	 }
	
	//   }
	//}





/*function get_length(str) {
	return str.replace(/[^\x00-\xff]/g,"xx").length;
}
window.onload=function(){
var ainput=document.getElementsByTagName("input");
	var user=ainput[2];
	var pwd= ainput[3];
var aspan = document.getElementsByTagName("p");
	var user_p = aspan[0];
	
	
	var pwd_p = aspan[1];
	
	



user.onfocus = function(){
		user_p.style.disply = "block";
		user_p.innerHTML = '5-25个字母，汉子，字母或数字';
		user_p.style.color = "#4c2a4d";

	}

user.onkeyup = function(){
		count.style.visibility = "visible";
		//user_length = get_length(this.value);
		//count.innerHTML = user_length+"个字符";
		
		

	}






user.onblur = function () {
		var re = /[^\w\u400-\u9fa5]/g;

		if (re.test(this.value)) {

			user_p.innerHTML = "含有非法字符！";
			user_p.style.color = "red";
			return ;

		}
		else if (this.value=="") {
			user_p.innerHTML = "不能为空！";
			user_p.style.color = "red";
			return ;
		}
		
		else if (this.value.length<6) {
			user_p.innerHTML = "长度小于6个字符";
			user_p.style.color = "red";
			return ;
		}
		else if (this.value.length>25) {
			user_p.innerHTML = "长度超过25个字符";
			user_p.style.color = "red";
		}
		else{
			user_p.innerHTML = '';
			//user_p.style.color = "green";
		}

	
	}


pwd.onfocus = function (){
 		pwd_p.style.disply = "block";
		pwd_p.innerHTML = '请输出密码';
		pwd_p.style.color = "#4c2a4d";
 }
pwd.onkeyup = function (){

}
pwd.onblur = function (){
		if (this.value=="") {

			pwd_p.innerHTML = "密码不能为空";
			pwd_p.style.color = "red";
		}
		
		 else if (this.value.length<6) {

		 pwd_p.innerHTML = "密码长度小于6";
		 pwd_p.style.color = "red";
		 } else{
			pwd_p.innerHTML = '';
			//user_p.style.color = "green";
		}
}*/

	



</script>
</head>
<body>
<a href=""><span style="color: white;font-size:20px;">首页</span></a>
<a href="regist.jsp"><span style="color: white;font-size:20px;margin-left: 1%">注册</span></a>
<!-- contact-form -->	
<div class="message warning">
<div class="inset">
	<div class="login-head">
		<h1>Find Password</h1>
		 
		<!-- <span style="color: white;font-size:20px;">用户</span><input name="abc" type="radio" value="用户" checked>   
		<span style="color: white;font-size:20px;">管理员</span><input name="abc" type="radio" value="管理员"><br> -->
		  

	</div>
		<form name="SendEmail" method="post" action="findUser.do">
			
			<li>
				<input type="text" class="text" placeholder="name" name="user_name"  autocomplete="off" required>
				
			</li>
			<li>
				<input type="text" class="text" placeholder="e_mail" name="user_email"  autocomplete="off" required>
				
			</li>
			
				
			<li>
				<input type="text"  placeholder="code" class="text" name="checkcode" autocomplete="off" required="required"> 
				
			</li>
			<img id="myimg"  src="/Edu-ssm/CheckcodeServlet" style="cursor:pointer; " onclick="change();"/>
			
			<h3 style="color:red;">${msg }</h3>
			
			
			<div class="submit">
				<input type="submit"  value="Sign in" >
				<h4><a href="login.html">Login ?</a></h4>
						  	
			</div>
				
		</form>
		</div>					
	</div>
	</div>
	<div class="clear"> </div>
<!--- footer --->

<div class="footer">
	<p>教育网.@小队</p>
</div>

</body>
</html>