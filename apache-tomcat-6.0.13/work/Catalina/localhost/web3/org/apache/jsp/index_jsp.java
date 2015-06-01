package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import bisheeee.dom4j;
import java.io.File;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=GB18030");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write('\n');
 
response.setHeader("refresh" , "2" );

      out.write("  \n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("    \n");
      out.write("    <title>My JSP 'index.jsp' starting page</title>\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\n");
      out.write("\t<!--\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\n");
      out.write("\t-->\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write(" \n");
      out.write("  <title>治超管理 精确检测表</title>\n");
      out.write(" 精确检测表 \n");
      out.write(" ");

    out.println("<button type=\"button\" onclick=\"window.location.href='gaosu.jsp'\">高速检测表</button >"); 
    out.println("<button type=\"button\" onclick=\"window.location.href='zhifa.jsp'\">超限执法表</button >"); 
    out.println("<button type=\"button\" onclick=\"window.location.href='tongxing.jsp'\">超限运输车辆通行证表</button >"); 
  
      out.write("\n");
      out.write("  <style type=\"text/css\">\n");
      out.write("  body{\n");
      out.write("            \t\t\t\tbackground-color: #d2b48c; \n");
      out.write("            \t\t\t\tmargin-left:20%; \n");
      out.write("            \t\t\t\tmargin-right:20%;\n");
      out.write("            \t\t\t\tborder:1px dotted gray;\n");
      out.write("            \t\t\t\tpadding: 10px 10px 10px 10px;\n");
      out.write("            \t\t\t\tfont-family:sans-serif;\n");
      out.write("            \t\t\t\ttext-align: justify; }\n");
      out.write("            \t\t\t\t</style></head><body>\n");
      out.write("            \t\t\t\t\n");
      out.write("            \t\t\t\t<h3>货车牌号&nbsp;&nbsp;&nbsp;&nbsp;发文单位&nbsp;&nbsp;&nbsp;&nbsp;车总质量&nbsp;&nbsp;&nbsp;&nbsp;车货限重&nbsp;&nbsp;&nbsp;&nbsp;数据产生时间&nbsp;&nbsp;&nbsp;&nbsp;联系人</h3><br>\n");
      out.write("            \t\t\t\t\n");
      out.write("  ");

  int i=0;
  while(i<100)
  {
  					 dom4j d = new dom4j();
  					 String pp="G:/";
  					 pp+=i;
  					 i++;
  					 File file = new File(pp);
				if (!file.exists() || !file.isFile()) {
                              break;
				}
            		Element root = d.readXML(pp).getRootElement();// 获取根节点
            		dom4j.disXML(root);
            		String xx=dom4j.returnMap().toString();
            		int i1=xx.indexOf("货车牌号");
            		
            		String s1=xx.substring(i1+5,dom4j.findnext(xx, i1, ','));
    
    				int i2=xx.indexOf("发文单位");
    				String s2=xx.substring(i2+5,dom4j.findnext(xx, i2, ','));        		
            		
    				int i3=xx.indexOf("车总质量");
    				String s3=xx.substring(i3+5,dom4j.findnext(xx, i3, ','));        		
    				
    				int i4=xx.indexOf("车货限重");
    				String s4=xx.substring(i4+5,dom4j.findnext(xx, i4, ','));        		
    				
    				int i5=xx.indexOf("数据产生时间");
    				String s5=xx.substring(i5+7,dom4j.findnext(xx, i5, ','));        		
    				
    				int i6=xx.indexOf("联系人");
    				String s6=xx.substring(i6+4,dom4j.findnext(xx, i6, ','));        		
            		out.write(s1+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+s2+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+s3+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+s4+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+s5+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+s6+"</div><br>");
            		}
  
      out.write("\n");
      out.write("</html>\n");
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
