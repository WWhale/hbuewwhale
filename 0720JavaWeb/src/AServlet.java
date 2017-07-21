import javax.servlet.*;
import java.io.IOException;

public class AServlet implements Servlet{
    /*
     * init(servletConfig)
     * service(servletRequest, servletResponse)
     * destroy();
     * 这三个方法时Servlet的生命周期方法
     */


    /**
     * 当浏览器第一次访问当前这个servlet时 会执行init方法
     * @param servletConfig  封装了Servlet的配置信息
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init--------");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("getServletConfig--------");
        return null;
    }

    /**
     * service每请求一次 就会执行一遍
     * @param servletRequest  封装了这次请求所携带的数据
     *                        可以通过这个参数 获取浏览器上提交上来的信息
     * @param servletResponse 封装了对浏览器的响应 对浏览器做出响应
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service--------");
        //获取参数 参数名为age 参数值就是我们这次请求发起时填写的内容
        String age = servletRequest.getParameter("age");
        //将获取的参数值 通过输出流 写到浏览器页面中
        servletResponse.getWriter().write(age);
    }

    @Override
    public String getServletInfo() {
        System.out.println("getServletInfo--------");
        return null;
    }

    /*
     * Servlet被销毁时会执行
     */
    @Override
    public void destroy() {
        System.out.println("destroy--------");
    }
}
