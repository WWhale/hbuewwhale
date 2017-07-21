import javax.servlet.*;
import java.io.IOException;


public class BServlet extends GenericServlet{
    //如果要让BServlet刚被创建时 进行某些不可告人的动作 那么也需要在init(ServletConfig)这个生命周期中写代码

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }
}
