<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//HTML HTML 4.01 Transitional//EN">
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>

    <meta charset="utf-8" />
    <title>后台管理</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />
    <meta content="" name="description" />
    <meta content="" name="author" />
    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="public/media/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="public/media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" />
    <link href="public/media/css/font-awesome.min.css" rel="stylesheet" type="text/css" />
    <link href="public/media/css/style-metro.css" rel="stylesheet" type="text/css" />
    <link href="public/media/css/style.css" rel="stylesheet" type="text/css" />
    <link href="public/media/css/style-responsive.css" rel="stylesheet" type="text/css" />
    <link href="public/media/css/default.css" rel="stylesheet" type="text/css" id="style_color" />
    <link href="public/media/css/uniform.default.css" rel="stylesheet" type="text/css" /> 
    <!-- mask alert -->
    <link href="public/media/css/jquery-ui-1.10.1.custom.min.css" rel="stylesheet" type="text/css" />
    <link href="public/media/css/bootstrap-modal.css" rel="stylesheet" type="text/css" />
    <!-- mask alert -->
    <!-- END GLOBAL MANDATORY STYLES -->
    <link rel="shortcut icon" href="public/media/image/favicon.png" />
    <!-- END COPYRIGHT -->
    <!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
    <!-- BEGIN CORE PLUGINS -->
    <script src="public/media/js/jquery-1.10.1.min.js" type="text/javascript"></script>
    <script src="public/media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
    <!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
    <script src="public/media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>
    <script src="public/media/js/bootstrap.min.js" type="text/javascript"></script>
    <!--[if lt IE 9]>

    <script src="public/media/js/excanvas.min.js"></script>

    <script src="public/media/js/respond.min.js"></script>  

    <![endif]-->
    <script src="public/media/js/jquery.slimscroll.min.js" type="text/javascript"></script>
    <script src="public/media/js/jquery.blockui.min.js" type="text/javascript"></script>
    <script src="public/media/js/jquery.cookie.min.js" type="text/javascript"></script>
    <script src="public/media/js/jquery.uniform.min.js" type="text/javascript"></script>
    <!-- END CORE PLUGINS -->
    <!-- BEGIN PAGE LEVEL PLUGINS -->
    <script src="public/media/js/jquery.validate.min.js" type="text/javascript"></script>
    <script src="public/media/js/jquery.backstretch.min.js" type="text/javascript"></script>
    <!-- END PAGE LEVEL PLUGINS -->
    <!-- BEGIN PAGE LEVEL SCRIPTS -->
    <script src="public/media/js/app.js" type="text/javascript"></script>
    <!-- END PAGE LEVEL SCRIPTS -->
    <script src="public/media/js/bootstrap-modal.js" type="text/javascript"></script>
    <script src="public/media/js/bootstrap-modalmanager.js" type="text/javascript"></script>
    <script src="public/media/js/ui-modals.js"></script>
	
	<script src="js/layui.js"></script>



<!-- 	<script type="text/javascript">
	function directUrl() {
	window.location.href="studentShow.do";
	return;
	}
	</script> -->
	
	<style type="text/css">
		#sub_menu_1,#sub_menu_2,#sub_menu_3,#sub_menu_4,#sub_menu_5,#sub_menu_6,#sub_menu_7,#sub_menu_8{
			display: none;
		}
		ul li:hover{
			cursor: pointer;
		}
		
		.table th, .table td { 
text-align: center;
vertical-align: middle!important;

}
		.table {
		margin-top: 50px;
		}
	</style>
	
	<script type="text/javascript">
		function f(str){
                var sub_menu = document.getElementById(str);
                var dis_v = sub_menu.style.display;
                
                if(dis_v == "block")
                    sub_menu.style.display = "none";
                else
                    sub_menu.style.display = "block";
                    
            }
		
	</script>

</head>
<!-- END HEAD -->
<!-- BEGIN PAGE LEVEL STYLES -->
<!-- color引用 -->
<link rel="stylesheet" href="public/media/css/colpick.css" type="text/css" />
<link rel="stylesheet" href="public/static/css/website.css" type="text/css" />
<link rel="stylesheet" href="public/swiper/dist/css/swiper.min.css" type="text/css" />
<!-- END PAGE LEVEL STYLES -->
<!-- BEGIN BODY -->
<style>
.setbg input[type="text"],
.setcol .yu_bgcol {
    background-color: initial!important;
}
</style>

<body class="page-header-fixed" >



    <!-- BEGIN HEADER -->
    <div class="header navbar navbar-inverse navbar-fixed-top">
        <!-- BEGIN TOP NAVIGATION BAR -->
        <div class="navbar-inner">
            <div class="container-fluid">
                <!-- BEGIN LOGO -->
                <a class="brand" href="#">
                    <img src="public/media/image/logo.png" alt="logo" />
                </a>
                <!-- END LOGO -->
                <!-- BEGIN RESPONSIVE MENU TOGGLER -->
                <a href="javascript:;" class="btn-navbar collapsed" data-toggle="collapse" data-target=".nav-collapse">
                    <img src="public/media/image/menu-toggler.png" alt="" />
                </a>
                <!-- END RESPONSIVE MENU TOGGLER -->
                <!-- BEGIN TOP NAVIGATION MENU -->
                <ul class="nav pull-right">
                    <!-- BEGIN NOTIFICATION DROPDOWN -->
                    <li class="dropdown" id="header_notification_bar">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-warning-sign"></i>
                            <span class="badge">6</span>
                        </a>
                        <ul class="dropdown-menu extended notification">
                            <li>
                                <p>其他服务</p>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="label label-success"><i class="icon-plus"></i></span> 功能介绍
                                    <span class="time"></span>
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="label label-important"><i class="icon-bolt"></i></span> 使用指南
                                    <span class="time"></span>
                                </a>
                            </li>
                        </ul>
                    </li>
                    <!-- END NOTIFICATION DROPDOWN -->
                    <!-- BEGIN USER LOGIN DROPDOWN -->
                    <li class="dropdown user">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img alt="" src="public/media/image/avatar1_small.jpg" />
                            <span class="username"></span>
                            <i class="icon-angle-down"></i>
                        </a>
                        <ul class="dropdown-menu">
                            <li><a href=""><i class="icon-lock"></i> 修改密码</a></li>
                            <li><a href=""><i class="icon-key"></i> 退出</a></li>
                        </ul>
                    </li>
                    <!-- END USER LOGIN DROPDOWN -->
                </ul>
                <!-- END TOP NAVIGATION MENU -->
            </div>
        </div>
        <!-- END TOP NAVIGATION BAR -->
    </div>
    <!-- End HEADER -->
    <!-- BEGIN CONTAINER -->
    <div class="page-container row-fluid">
        <!-- BEGIN SIDEBAR -->
        <div class="page-sidebar nav-collapse collapse">
            <!-- Begin SIDEBAR MENU -->
            <!-- BEGIN SIDEBAR MENU -->
     		<!-- 获取菜单 -->
            <ul class="page-sidebar-menu">
                <li>
                    <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                    <div class="sidebar-toggler hidden-phone"></div>
                    <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                </li>
                
			<c:forEach items="${user.menus}" var="menu">
			
			<li >
			<a href="javascript:;">
                <i class="icon-comments"></i>
                <span class="title">${menu.name }</span>
                <span class="arrow "></span></a>
                <ul class="sub-menu" ><li>
			<c:forEach items="${menu.children}" var="child">
			
			<a href="${child.url}">${child.name }</a>
			</c:forEach>
			</li></ul></li>
			</c:forEach>
			</ul>
                
     
            
            <!-- END SIDEBAR MENU -->
      	</div>
        <!-- END SIDEBAR -->
        <!-- BEGIN PAGE -->
        <div class="page-content">
            <!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
            <div id="portlet-config" class="modal hide">
                <div class="modal-header">
                    <button data-dismiss="modal" class="close" type="button"></button>
                    <h3>Widget Settings</h3>
                </div>
                <div class="modal-body">
                    <p>Here will be a configuration form</p>
                </div>
            </div>
            <!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
            <div class="container-fluid">
                <!-- BEGIN PAGE HEADER-->
                <div class="row-fluid">
                    <div class="span12">
                        <!-- BEGIN PAGE TITLE & BREADCRUMB-->
                        <h3 class="page-title">

                            角色权限管理 <small></small>

                        </h3>
                        <div class="dome_menu">
                            <!-- <ul id="bar">
                                <!-- <li class="music"><i class="icon-music"></i><p>音乐</p></li> 
                                <li class="picture"><i class="icon-picture"></i>
                                    <p>图片</p>
                                </li>
                                <li class="pencil"><i class="icon-pencil"></i>
                                    <p>文本</p>
                                </li>
                                <li class="banner"><i class="icon-columns"></i>
                                    <p>滚动图</p>
                                </li>
                                <li class="backg"><i class="icon-th-large"></i>
                                    <input name='file90' type="file" id="up_FILE90" class="imghide setbg" />
                                    <img src="" onclick="upload(this,90,2)" src="public/media/image/favicon.png" class="setbgimg opalpha" width="40" height="40" />
                                    <p>背景图</p>
                                </li>
                            </ul> -->
                            <!-- BEGIN FORM-->
                            <div class="savewebsite">
                                <button  class="btn blue "></i><a href="index.html">首页</a></button>
                                <a class=" btn yellow hide alertdome" data-toggle="modal" href="#static">View Demo</a>
                            </div>
                            <!-- END FORM-->
                        </div>
                        <!-- END PAGE TITLE & BREADCRUMB-->
                    </div>
                </div>
                <!-- END PAGE HEADER-->
                <!-- Begin page-->
                <!-- <div class="ui-widget ui-helper-clearfix">
                    <div class="dome_exp">
                        <div id="website" class="ui-widget-content ui-state-default">
                            
                            <ul id="wraps" class="website ui-helper-reset ui-helper-clearfix">
                            </ul>
                            
                        </div>
                        <div class="datainfo"></div>
                    </div>
                </div> -->
                
                <div style="text-align:center ">
                
                <h3>角色权限管理</h3>
               
         <!-- <table class="tablelist" style="margin: 10px auto" width="800" height="400"> -->
    	
        <table class="table">
        
        <thead>
		<tr>
        <th >角色名称</th>
        <th >角色权限</th>
        <th >操作</th>
        </tr>
		</thead>
        
        
        <tbody>
		<c:forEach items="${map}" var="map">
		<!-- <form action="updataRolePermission.do" method="post"> -->
		
		
		
		
        <tr>
        
        
        <td width="80" height="30">${map.key}</td>
        
        
        <td width="80" height="30" id="${map.value}"><a   onclick="getvalue('${map.value}')">查看权限</a></td>
        <td width="80" height="30"><button type="button" value="修改" class="layui-btn" id="${map.value}" >修改</button></td>
        </tr>
        </c:forEach>
             
        
        
         
        
        
		
		</tbody>
        </table> 
   		
    
                
                </div>
                <div style="margin-top:100px;text-align: center">
                <h3>提示</h3>
                <h5>主体js文件地址：public/media/js/website.js</h5>
                <h5>上传图片形式以单击形式上传，图片php控制器:Website.php More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></h5>
            	</div>
            </div>
            <!-- END PAGE CONTAINER-->
        </div>
    

        <!-- end PAGE -->
        <!-- **** -->
        <!-- **** -->
        <!-- === -->
        <div id="static" class="modal hide fade" tabindex="-1" data-backdrop="static" data-keyboard="false">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true"></button>
                <h3 id="titler"></h3>
            </div>
            <div class="modal-body">
                <p id="contenter"></p>
            </div>
            <div class="modal-footer">
                <button type="button" data-dismiss="modal" class="btn">确定</button>
                <button type="button" data-dismiss="modal" class="btn green">关闭会话</button>
            </div>
        </div>
        <!-- === -->
    </div>
    <!-- END CONTAINER -->
    <!-- BEGIN FOOTER -->
    <!-- END FOOTER -->
    <!-- <script type="text/javascript" src="/media/js/yy_card.js"></script> -->
    <script src="public/media/js/colpick.js"></script>
    <script src="public/media/js/plugin.js"></script>
    <script src="public/media/js/website.js"></script>
    <script src="public/media/js/jquery.upload.js"></script>
    <!--     <script src="/media/js/jquery.rotate.min.js"></script> -->
    <script src="public/swiper/dist/js/swiper.min.js"></script>
    <script>
    jQuery(document).ready(function() {
        App.init();
        UIModals.init();
        // var swiper = new Swiper('.swiper-container');
        $('.datainfo .span12,.loading').hide();
    });


    //上传图片
    function upload(obj, num, b) {
        $.upload({
            // 上传地址
            url: "{:url('user/website/ajax_upload')}",
            // 文件域名字
            fileName: 'file' + num,
            // 其他表单数据
            // 上传完成后, 返回json, text
            dataType: 'json',
            // 上传之前回调,return true表示可继续上传
            onSend: function() {
                return true;
            },
            // 上传之后回调
            onComplate: function(data) {
                if (b == 1) {
                    if (data.errcode == 1) {
                        // alert("上传成功");
                        $(obj).attr('src', data.errmsg);
                    } else {
                        alert("网络错误");
                    }
                } else {
                    $('#wraps').css({
                        'background': 'url(' + data.errmsg + ')  no-repeat',
                        'background-size': '100%',
                    });
                    // $("#containment-wrapper").attr('background','url('+data.errmsg+')');
                }
            }
        });
    }
    //保存

    function savewebsite() {

        var content = $(".dome_exp").html(); //后台元素    
        $("#website .maininfo img").attr('ondblclick', '');
        $('.ui-widget-header,.ui-resizable-handle').remove();
        $('.datahref :text').attr("disabled", "disabled");

        var web = $("#website").html(); //前台展示
        $.ajax({
            url: "{:url('user/website/savewebsite')}",
            type: 'POST',
            data: {
                "web": web,
                'con': content
            },
            dataType: "json",
            success: function(data) {
                if (data == 1) {
                    alert("提示", "保存成功！")
                } else {
                    alert("提示", "保存失败！")
                }
                setTimeout(function() {
                    location = location;
                }, 8000);
            }
        });
    }

    function keepdomafter() {
        play();

        $('.loading').hide();
        $('.ui-resizable-se').nextAll().remove();
        var swiper = new Swiper('.swiper-container', {
            // pagination: '.swiper-pagination',
            // paginationClickable: true,
            // nextButton: '.swiper-button-next',
            // prevButton: '.swiper-button-prev',
            // spaceBetween: 30,
            // effect: 'fade',
            // grabCursor: true,
            // autoplay: 2000,
        });

    }
    
    /*$.post("getRoleMenu.do",function(data){
			//var _data=eval(data);
			//console.log(_data)
			 data = JSON.parse(data);
			 console.log(data[0])
			var all_input=document.getElementsByTagName("input");
		for ( var i in data) {
		console.log(data[i][1])
			for( var j in data[i][1]){
				console.log(data[i][1][j].name)
			}
		} 
		
		for(var key in data[0])
			console.log(data[0][key]);
		})*/
		
	
	/* function getJurisdictionsByRoleId(roleId,doSuccess){
			$.ajax({
				url:"getRoleMenu.do",
				data:{roleId:roleId},
				type:"POST",
				dataType:"json",
				success:function(data){
					doSuccess(data);
				}
			});
		}
		$(".role-list").on("click",".show-role-jurisdictions",function(){
			var roleId=$(this).parents("tr").find(".roleid").html();
			var rlTd=$(this).parent();
			//请求查看用户角色
			getJurisdictionsByRoleId(roleId,function(data){
				rlTd.html("");
				for(var i in data){
					var role=data[i].name+"<br/>";
					rlTd.append(role);
				}
			});
		
		}); */
		
		function getvalue(id){
    	console.log(id);
    	
    	$.post("getRoleMenu.do",{id:id}, function(data) {
				
				//console.log(data)
				var role="";
				var _data = JSON.parse(data);
				//var rlTd=$(this).parent();
				//rlTd.html("");
				if (_data==null) {
				
					id =  id + ''
					
					document.getElementById(id).innerHTML = role
					
				} else {

				
				for(var i in _data){
				
					 role += _data[i].name+"<br/>";
					console.log(role)
					//rlTd.append(role);
					id =  id + ''
					document.getElementById(id).innerHTML = role
					
					
				}
				
				}
			 
			})
			
			
			
			
    	
	}
	
	
	$('#${map.value}').on('click', function(){
    layer.open({
      type: 1,
      area: ['600px', '360px'],
      shadeClose: true, //点击遮罩关闭
      content: '\<\div style="padding:20px;">自定义内容\<\/div>'
    });
  });
    </script>
    <!-- END JAVASCRIPTS -->
</body>
<!-- END BODY -->

</html>

