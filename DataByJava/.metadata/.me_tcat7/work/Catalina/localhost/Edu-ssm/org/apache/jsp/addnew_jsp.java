/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.30
 * Generated at: 2018-12-05 07:40:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class addnew_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//HTML HTML 4.01 Transitional//EN\">\r\n");
      out.write("<!--[if IE 8]> <html lang=\"en\" class=\"ie8\"> <![endif]-->\r\n");
      out.write("<!--[if IE 9]> <html lang=\"en\" class=\"ie9\"> <![endif]-->\r\n");
      out.write("<!--[if !IE]><!-->\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<!--<![endif]-->\r\n");
      out.write("<!-- BEGIN HEAD -->\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <title>后台管理</title>\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\r\n");
      out.write("    <meta content=\"\" name=\"description\" />\r\n");
      out.write("    <meta content=\"\" name=\"author\" />\r\n");
      out.write("    <!-- BEGIN GLOBAL MANDATORY STYLES -->\r\n");
      out.write("    <link href=\"public/media/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"public/media/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"public/media/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"public/media/css/style-metro.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"public/media/css/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"public/media/css/style-responsive.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"public/media/css/default.css\" rel=\"stylesheet\" type=\"text/css\" id=\"style_color\" />\r\n");
      out.write("    <link href=\"public/media/css/uniform.default.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <!-- mask alert -->\r\n");
      out.write("    <link href=\"public/media/css/jquery-ui-1.10.1.custom.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <link href=\"public/media/css/bootstrap-modal.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("    <!-- mask alert -->\r\n");
      out.write("    <!-- END GLOBAL MANDATORY STYLES -->\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"public/media/image/favicon.png\" />\r\n");
      out.write("    <!-- END COPYRIGHT -->\r\n");
      out.write("    <!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->\r\n");
      out.write("    <!-- BEGIN CORE PLUGINS -->\r\n");
      out.write("    <script src=\"public/media/js/jquery-1.10.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"public/media/js/jquery-migrate-1.2.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->\r\n");
      out.write("    <script src=\"public/media/js/jquery-ui-1.10.1.custom.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"public/media/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"public/media/js/excanvas.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"public/media/js/respond.min.js\"></script>  \r\n");
      out.write("\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <script src=\"public/media/js/jquery.slimscroll.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"public/media/js/jquery.blockui.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"public/media/js/jquery.cookie.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"public/media/js/jquery.uniform.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <!-- END CORE PLUGINS -->\r\n");
      out.write("    <!-- BEGIN PAGE LEVEL PLUGINS -->\r\n");
      out.write("    <script src=\"public/media/js/jquery.validate.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"public/media/js/jquery.backstretch.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <!-- END PAGE LEVEL PLUGINS -->\r\n");
      out.write("    <!-- BEGIN PAGE LEVEL SCRIPTS -->\r\n");
      out.write("    <script src=\"public/media/js/app.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <!-- END PAGE LEVEL SCRIPTS -->\r\n");
      out.write("    <script src=\"public/media/js/bootstrap-modal.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"public/media/js/bootstrap-modalmanager.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"public/media/js/ui-modals.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<!-- END HEAD -->\r\n");
      out.write("<!-- BEGIN PAGE LEVEL STYLES -->\r\n");
      out.write("<!-- color引用 -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"public/media/css/colpick.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"public/static/css/website.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"public/swiper/dist/css/swiper.min.css\" type=\"text/css\" />\r\n");
      out.write("<!-- END PAGE LEVEL STYLES -->\r\n");
      out.write("<!-- BEGIN BODY -->\r\n");
      out.write("<style>\r\n");
      out.write(".setbg input[type=\"text\"],\r\n");
      out.write(".setcol .yu_bgcol {\r\n");
      out.write("    background-color: initial!important;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body class=\"page-header-fixed\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- BEGIN HEADER -->\r\n");
      out.write("    <div class=\"header navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("        <!-- BEGIN TOP NAVIGATION BAR -->\r\n");
      out.write("        <div class=\"navbar-inner\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <!-- BEGIN LOGO -->\r\n");
      out.write("                <a class=\"brand\" href=\"index.html\">\r\n");
      out.write("                    <img src=\"public/media/image/logo.png\" alt=\"logo\" />\r\n");
      out.write("                </a>\r\n");
      out.write("                <!-- END LOGO -->\r\n");
      out.write("                <!-- BEGIN RESPONSIVE MENU TOGGLER -->\r\n");
      out.write("                <a href=\"javascript:;\" class=\"btn-navbar collapsed\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\r\n");
      out.write("                    <img src=\"public/media/image/menu-toggler.png\" alt=\"\" />\r\n");
      out.write("                </a>\r\n");
      out.write("                <!-- END RESPONSIVE MENU TOGGLER -->\r\n");
      out.write("                <!-- BEGIN TOP NAVIGATION MENU -->\r\n");
      out.write("                <ul class=\"nav pull-right\">\r\n");
      out.write("                    <!-- BEGIN NOTIFICATION DROPDOWN -->\r\n");
      out.write("                    <li class=\"dropdown\" id=\"header_notification_bar\">\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                            <i class=\"icon-warning-sign\"></i>\r\n");
      out.write("                            <span class=\"badge\">6</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu extended notification\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <p>其他服务</p>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <span class=\"label label-success\"><i class=\"icon-plus\"></i></span> 功能介绍\r\n");
      out.write("                                    <span class=\"time\"></span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <span class=\"label label-important\"><i class=\"icon-bolt\"></i></span> 使用指南\r\n");
      out.write("                                    <span class=\"time\"></span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!-- END NOTIFICATION DROPDOWN -->\r\n");
      out.write("                    <!-- BEGIN USER LOGIN DROPDOWN -->\r\n");
      out.write("                    <li class=\"dropdown user\">\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                            <img alt=\"\" src=\"public/media/image/avatar1_small.jpg\" />\r\n");
      out.write("                            <span class=\"username\"></span>\r\n");
      out.write("                            <i class=\"icon-angle-down\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            <li><a href=\"\"><i class=\"icon-lock\"></i> 修改密码</a></li>\r\n");
      out.write("                            <li><a href=\"\"><i class=\"icon-key\"></i> 退出</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <!-- END USER LOGIN DROPDOWN -->\r\n");
      out.write("                </ul>\r\n");
      out.write("                <!-- END TOP NAVIGATION MENU -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- END TOP NAVIGATION BAR -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End HEADER -->\r\n");
      out.write("    <!-- BEGIN CONTAINER -->\r\n");
      out.write("    <div class=\"page-container row-fluid\">\r\n");
      out.write("        <!-- BEGIN SIDEBAR -->\r\n");
      out.write("        <div class=\"page-sidebar nav-collapse collapse\">\r\n");
      out.write("            <!-- Begin SIDEBAR MENU -->\r\n");
      out.write("            <!-- BEGIN SIDEBAR MENU -->\r\n");
      out.write("            <!-- 获取菜单 -->\r\n");
      out.write("            <ul class=\"page-sidebar-menu\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <!-- BEGIN SIDEBAR TOGGLER BUTTON -->\r\n");
      out.write("                    <div class=\"sidebar-toggler hidden-phone\"></div>\r\n");
      out.write("                    <!-- BEGIN SIDEBAR TOGGLER BUTTON -->\r\n");
      out.write("                </li>\r\n");
      out.write("                \r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("            \r\n");
      out.write("            <!-- END SIDEBAR MENU -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- END SIDEBAR -->\r\n");
      out.write("        <!-- BEGIN PAGE -->\r\n");
      out.write("        <div class=\"page-content\">\r\n");
      out.write("            <!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->\r\n");
      out.write("            <div id=\"portlet-config\" class=\"modal hide\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button data-dismiss=\"modal\" class=\"close\" type=\"button\"></button>\r\n");
      out.write("                    <h3>Widget Settings</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("                    <p>Here will be a configuration form</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <!-- BEGIN PAGE HEADER-->\r\n");
      out.write("                <div class=\"row-fluid\">\r\n");
      out.write("                    <div class=\"span12\">\r\n");
      out.write("                        <!-- BEGIN PAGE TITLE & BREADCRUMB-->\r\n");
      out.write("                        <h3 class=\"page-title\">\r\n");
      out.write("\r\n");
      out.write("                            添加新闻模块 <small></small>\r\n");
      out.write("\r\n");
      out.write("                        </h3>\r\n");
      out.write("                        <div class=\"dome_menu\">\r\n");
      out.write("                            <!-- <ul id=\"bar\">\r\n");
      out.write("                                <!-- <li class=\"music\"><i class=\"icon-music\"></i><p>音乐</p></li> \r\n");
      out.write("                                <li class=\"picture\"><i class=\"icon-picture\"></i>\r\n");
      out.write("                                    <p>图片</p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"pencil\"><i class=\"icon-pencil\"></i>\r\n");
      out.write("                                    <p>文本</p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"banner\"><i class=\"icon-columns\"></i>\r\n");
      out.write("                                    <p>滚动图</p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"backg\"><i class=\"icon-th-large\"></i>\r\n");
      out.write("                                    <input name='file90' type=\"file\" id=\"up_FILE90\" class=\"imghide setbg\" />\r\n");
      out.write("                                    <img src=\"\" onclick=\"upload(this,90,2)\" src=\"public/media/image/favicon.png\" class=\"setbgimg opalpha\" width=\"40\" height=\"40\" />\r\n");
      out.write("                                    <p>背景图</p>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul> -->\r\n");
      out.write("                            <!-- BEGIN FORM-->\r\n");
      out.write("                            <div class=\"savewebsite\">\r\n");
      out.write("                                <button onclick=\"savewebsite()\" class=\"btn blue \"><a href=\"index.html\">首页</a></button>\r\n");
      out.write("                                <a class=\" btn yellow hide alertdome\" data-toggle=\"modal\" href=\"#static\">View Demo</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- END FORM-->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- END PAGE TITLE & BREADCRUMB-->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- END PAGE HEADER-->\r\n");
      out.write("                <!-- Begin page-->\r\n");
      out.write("                <!-- <div class=\"ui-widget ui-helper-clearfix\">\r\n");
      out.write("                    <div class=\"dome_exp\">\r\n");
      out.write("                        <div id=\"website\" class=\"ui-widget-content ui-state-default\">\r\n");
      out.write("                            \r\n");
      out.write("                            <ul id=\"wraps\" class=\"website ui-helper-reset ui-helper-clearfix\">\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"datainfo\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div> -->\r\n");
      out.write("                <!-- END page-->\r\n");
      out.write("                <div style=\"margin: 80px auto \">\r\n");
      out.write("                <form action=\"addNew.do\" method=\"post\">\r\n");
      out.write("                <ul class=\"forminfo\">\r\n");
      out.write("                <p style=\"color:red;margin-left:200px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("                <li><label>新闻标题</label><input name=\"new_title\" type=\"text\" class=\"dfinput\" />\r\n");
      out.write("                <i>标题不能超过30个字符</i></li>\r\n");
      out.write("    <li><label>作者</label>\r\n");
      out.write("    <input name=\"new_author\" type=\"text\" class=\"dfinput\" />\r\n");
      out.write("    <i>多个关键字用,隔开</i></li>\r\n");
      out.write("    <li><label>新闻内容</label>\r\n");
      out.write("    <textarea name=\"new_content\" cols=\"\" rows=\"\" class=\"textinput\"></textarea>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li><label>&nbsp;</label>\r\n");
      out.write("    <input name=\"\" type=\"submit\" class=\"btn\" value=\"确认保存\"/>\r\n");
      out.write("    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                </form>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <h3>提示</h3>\r\n");
      out.write("                <h5>主体js文件地址：public/media/js/website.js</h5>\r\n");
      out.write("                <h5>上传图片形式以单击形式上传，图片php控制器:Website.php More Templates <a href=\"http://www.cssmoban.com/\" target=\"_blank\" title=\"模板之家\">模板之家</a> - Collect from <a href=\"http://www.cssmoban.com/\" title=\"网页模板\" target=\"_blank\">网页模板</a></h5>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- END PAGE CONTAINER-->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end PAGE -->\r\n");
      out.write("        <!-- **** -->\r\n");
      out.write("        <!-- **** -->\r\n");
      out.write("        <!-- === -->\r\n");
      out.write("        <div id=\"static\" class=\"modal hide fade\" tabindex=\"-1\" data-backdrop=\"static\" data-keyboard=\"false\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\"></button>\r\n");
      out.write("                <h3 id=\"titler\"></h3>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <p id=\"contenter\"></p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" data-dismiss=\"modal\" class=\"btn\">确定</button>\r\n");
      out.write("                <button type=\"button\" data-dismiss=\"modal\" class=\"btn green\">关闭会话</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- === -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- END CONTAINER -->\r\n");
      out.write("    <!-- BEGIN FOOTER -->\r\n");
      out.write("    <!-- END FOOTER -->\r\n");
      out.write("    <!-- <script type=\"text/javascript\" src=\"/media/js/yy_card.js\"></script> -->\r\n");
      out.write("    <script src=\"public/media/js/colpick.js\"></script>\r\n");
      out.write("    <script src=\"public/media/js/plugin.js\"></script>\r\n");
      out.write("    <script src=\"public/media/js/website.js\"></script>\r\n");
      out.write("    <script src=\"public/media/js/jquery.upload.js\"></script>\r\n");
      out.write("    <!--     <script src=\"/media/js/jquery.rotate.min.js\"></script> -->\r\n");
      out.write("    <script src=\"public/swiper/dist/js/swiper.min.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("    jQuery(document).ready(function() {\r\n");
      out.write("        App.init();\r\n");
      out.write("        UIModals.init();\r\n");
      out.write("        // var swiper = new Swiper('.swiper-container');\r\n");
      out.write("        $('.datainfo .span12,.loading').hide();\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    //上传图片\r\n");
      out.write("    function upload(obj, num, b) {\r\n");
      out.write("        $.upload({\r\n");
      out.write("            // 上传地址\r\n");
      out.write("            url: \"{:url('user/website/ajax_upload')}\",\r\n");
      out.write("            // 文件域名字\r\n");
      out.write("            fileName: 'file' + num,\r\n");
      out.write("            // 其他表单数据\r\n");
      out.write("            // 上传完成后, 返回json, text\r\n");
      out.write("            dataType: 'json',\r\n");
      out.write("            // 上传之前回调,return true表示可继续上传\r\n");
      out.write("            onSend: function() {\r\n");
      out.write("                return true;\r\n");
      out.write("            },\r\n");
      out.write("            // 上传之后回调\r\n");
      out.write("            onComplate: function(data) {\r\n");
      out.write("                if (b == 1) {\r\n");
      out.write("                    if (data.errcode == 1) {\r\n");
      out.write("                        // alert(\"上传成功\");\r\n");
      out.write("                        $(obj).attr('src', data.errmsg);\r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert(\"网络错误\");\r\n");
      out.write("                    }\r\n");
      out.write("                } else {\r\n");
      out.write("                    $('#wraps').css({\r\n");
      out.write("                        'background': 'url(' + data.errmsg + ')  no-repeat',\r\n");
      out.write("                        'background-size': '100%',\r\n");
      out.write("                    });\r\n");
      out.write("                    // $(\"#containment-wrapper\").attr('background','url('+data.errmsg+')');\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("    //保存\r\n");
      out.write("\r\n");
      out.write("    function savewebsite() {\r\n");
      out.write("\r\n");
      out.write("        var content = $(\".dome_exp\").html(); //后台元素    \r\n");
      out.write("        $(\"#website .maininfo img\").attr('ondblclick', '');\r\n");
      out.write("        $('.ui-widget-header,.ui-resizable-handle').remove();\r\n");
      out.write("        $('.datahref :text').attr(\"disabled\", \"disabled\");\r\n");
      out.write("\r\n");
      out.write("        var web = $(\"#website\").html(); //前台展示\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url: \"{:url('user/website/savewebsite')}\",\r\n");
      out.write("            type: 'POST',\r\n");
      out.write("            data: {\r\n");
      out.write("                \"web\": web,\r\n");
      out.write("                'con': content\r\n");
      out.write("            },\r\n");
      out.write("            dataType: \"json\",\r\n");
      out.write("            success: function(data) {\r\n");
      out.write("                if (data == 1) {\r\n");
      out.write("                    alert(\"提示\", \"保存成功！\")\r\n");
      out.write("                } else {\r\n");
      out.write("                    alert(\"提示\", \"保存失败！\")\r\n");
      out.write("                }\r\n");
      out.write("                setTimeout(function() {\r\n");
      out.write("                    location = location;\r\n");
      out.write("                }, 8000);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function keepdomafter() {\r\n");
      out.write("        play();\r\n");
      out.write("\r\n");
      out.write("        $('.loading').hide();\r\n");
      out.write("        $('.ui-resizable-se').nextAll().remove();\r\n");
      out.write("        var swiper = new Swiper('.swiper-container', {\r\n");
      out.write("            // pagination: '.swiper-pagination',\r\n");
      out.write("            // paginationClickable: true,\r\n");
      out.write("            // nextButton: '.swiper-button-next',\r\n");
      out.write("            // prevButton: '.swiper-button-prev',\r\n");
      out.write("            // spaceBetween: 30,\r\n");
      out.write("            // effect: 'fade',\r\n");
      out.write("            // grabCursor: true,\r\n");
      out.write("            // autoplay: 2000,\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("    <!-- END JAVASCRIPTS -->\r\n");
      out.write("</body>\r\n");
      out.write("<!-- END BODY -->\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /addnew.jsp(165,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/addnew.jsp(165,3) '${user.menus}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${user.menus}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /addnew.jsp(165,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("menu");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<li >\r\n");
          out.write("\t\t\t<a href=\"javascript:;\">\r\n");
          out.write("                <i class=\"icon-comments\"></i>\r\n");
          out.write("                <span class=\"title\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menu.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("                <span class=\"arrow \"></span></a>\r\n");
          out.write("                <ul class=\"sub-menu\" ><li>\r\n");
          out.write("\t\t\t");
          if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t</li></ul></li>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /addnew.jsp(173,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/addnew.jsp(173,3) '${menu.children}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${menu.children}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /addnew.jsp(173,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("child");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\r\n");
          out.write("\t\t\t<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${child.url}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${child.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</a>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
