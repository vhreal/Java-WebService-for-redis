package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class queryResult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=gb2312");
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>    \r\n");
      out.write("    <title>My JSP 'queryFrom.jsp' starting page</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body> \r\n");
      out.write("   \t 显示结果. <br>\r\n");
      out.write("   \t ");

   	 	ArrayList stus = (ArrayList)request.getAttribute("stus");
   	  
      out.write("\r\n");
      out.write("   \t  <table bgColor=\"#ff8000\">\r\n");
      out.write("   \t  <tr>\r\n");
      out.write("   \t  <td>id</td>\r\n");
      out.write("   \t  <td>name</td>\r\n");
      out.write("   \t  <td>sex</td>\r\n");
      out.write("   \t  <td>bir</td>\r\n");
      out.write("   \t  <td>addr</td>\r\n");
      out.write("   \t  </tr>\r\n");
      out.write("   \t  ");

   	  for(int i=0;i<stus.size();i++){
   	  	po.Student stu = (po.Student)stus.get(i);
   	   
      out.write("\r\n");
      out.write("   \t   <tr>\r\n");
      out.write("   \t   <td>");
      out.print(stu.getStuID() );
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print(stu.getStuName() );
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print(stu.getStuSex() );
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print(stu.getStuBir() );
      out.write("</td>\r\n");
      out.write("\t   <td>");
      out.print(stu.getStuAdd() );
      out.write("</td>\r\n");
      out.write("\t   </tr> \r\n");
      out.write("\t   ");

	   }
	    
      out.write("  \r\n");
      out.write("\t    <tr>\r\n");
      out.write("   \t   <td>");
      out.print("fdsf" );
      out.write("</td>\r\n");
      out.write("   \t   </tr> \r\n");
      out.write("   \t  </table>   \t \t\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
