/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.47
 * Generated at: 2018-08-08 11:10:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("/*=========================\r\n");
      out.write("  Icons\r\n");
      out.write(" ================= */\r\n");
      out.write("\r\n");
      out.write("/* footer social icons */\r\n");
      out.write("ul.social-network {\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("\tdisplay: inline;\r\n");
      out.write("\tmargin-left:0 !important;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("}\r\n");
      out.write("ul.social-network li {\r\n");
      out.write("\tdisplay: inline;\r\n");
      out.write("\tmargin: 0 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* footer social icons */\r\n");
      out.write(".social-network a.icoRss:hover {\r\n");
      out.write("\tbackground-color: #F56505;\r\n");
      out.write("}\r\n");
      out.write(".social-network a.icoFacebook:hover {\r\n");
      out.write("\tbackground-color:#3B5998;\r\n");
      out.write("}\r\n");
      out.write(".social-network a.icoTwitter:hover {\r\n");
      out.write("\tbackground-color:#33ccff;\r\n");
      out.write("}\r\n");
      out.write(".social-network a.icoGoogle:hover {\r\n");
      out.write("\tbackground-color:#BD3518;\r\n");
      out.write("}\r\n");
      out.write(".social-network a.icoVimeo:hover {\r\n");
      out.write("\tbackground-color:#0590B8;\r\n");
      out.write("}\r\n");
      out.write(".social-network a.icoLinkedin:hover {\r\n");
      out.write("\tbackground-color:#007bb7;\r\n");
      out.write("}\r\n");
      out.write(".social-network a.icoRss:hover i, .social-network a.icoFacebook:hover i, .social-network a.icoTwitter:hover i,\r\n");
      out.write(".social-network a.icoGoogle:hover i, .social-network a.icoVimeo:hover i, .social-network a.icoLinkedin:hover i {\r\n");
      out.write("\tcolor:#fff;\r\n");
      out.write("}\r\n");
      out.write("a.socialIcon:hover, .socialHoverClass {\r\n");
      out.write("\tcolor:#44BCDD;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-circle li a {\r\n");
      out.write("\tdisplay:inline-block;\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\tmargin:0 auto 0 auto;\r\n");
      out.write("\t-moz-border-radius:50%;\r\n");
      out.write("\t-webkit-border-radius:50%;\r\n");
      out.write("\tborder-radius:50%;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\twidth: 50px;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("\tfont-size:20px;\r\n");
      out.write("}\r\n");
      out.write(".social-circle li i {\r\n");
      out.write("\tmargin:0;\r\n");
      out.write("\tline-height:50px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social-circle li a:hover i, .triggeredHover {\r\n");
      out.write("\t-moz-transform: rotate(360deg);\r\n");
      out.write("\t-webkit-transform: rotate(360deg);\r\n");
      out.write("\t-ms--transform: rotate(360deg);\r\n");
      out.write("\ttransform: rotate(360deg);\r\n");
      out.write("\t-webkit-transition: all 0.2s;\r\n");
      out.write("\t-moz-transition: all 0.2s;\r\n");
      out.write("\t-o-transition: all 0.2s;\r\n");
      out.write("\t-ms-transition: all 0.2s;\r\n");
      out.write("\ttransition: all 0.2s;\r\n");
      out.write("}\r\n");
      out.write(".social-circle i {\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\t-webkit-transition: all 0.8s;\r\n");
      out.write("\t-moz-transition: all 0.8s;\r\n");
      out.write("\t-o-transition: all 0.8s;\r\n");
      out.write("\t-ms-transition: all 0.8s;\r\n");
      out.write("\ttransition: all 0.8s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<center><h3>Created By Techtronixs</h3>\r\n");
      out.write("<!--Pulling Awesome Font -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \t\t\t<div class=\"col-md-12\">\r\n");
      out.write("                    <ul class=\"social-network social-circle\">\r\n");
      out.write("                        <li><a href=\"https://www.instagram.com/techtronixs/\" class=\"icoRss\" title=\"Instagram\" style=\"background-color: #D3D3D4\"><i class=\"fa fa-rss\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"https://www.facebook.com/techtronixs.softwares.14\" class=\"icoFacebook\" title=\"Facebook\" style=\"background-color: #D3D3D4\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"https://twitter.com/TechtronixsS\" class=\"icoTwitter\" title=\"Twitter\" style=\"background-color: #D3D3D4\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"#\" class=\"icoGoogle\" title=\"Google +\" style=\"background-color: #D3D3D4\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("                        <li><a href=\"https://www.linkedin.com/in/techtronixs-softwares-391959169/\" class=\"icoLinkedin\" title=\"Linkedin\" style=\"background-color: #D3D3D4\"><i class=\"fa fa-linkedin\"></i></a></li>\r\n");
      out.write("                    </ul>\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
