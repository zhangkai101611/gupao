package com.zk.gupao.delegate_pattern.mvc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-03 21:33
 **/
public class DispatcherServlet extends HttpServlet {

    List<Handle> handlerMapping =new ArrayList<Handle>();

    @Override
    public void init() throws ServletException {
        Class<?> memberController=MemberController.class;
        try {
            handlerMapping.add(new Handle().setController(memberController.newInstance()).setMethod(memberController.getMethod("getMemberById", String.class)).setUri("getMemberById.do"));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doDispatcher(req,resp);
        
    }

    private void doDispatcher(HttpServletRequest req, HttpServletResponse resp) {
        String uri=req.getRequestURI();
        Handle handle=null;
        for(Handle h:handlerMapping){
            if(uri.equals(h.getUri())){
                handle=h;
                break;
            }
        }
        try {
           Object obj = handle.getMethod().invoke(handle.getController(),req.getParameter("mid"));
           resp.getWriter().write(obj.toString());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    private void doDispatcher(HttpServletRequest req, HttpServletResponse resp) {
//        String uri=req.getRequestURI();
//        String mid=req.getParameter("mid");
//
//        if("getMemberById".equals(uri)){
//            new MemberController().getMemberById(mid);
//        }else if("getOrderById".equals(uri)){
//            new OrderController().getOrderById(mid);
//        }else if("logout".equals(uri)){
//            new SystemController().logout();
//        }else{
//            try {
//                resp.getWriter().write("404");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    class Handle{
        private Object controller;
        private Method method;
        private String uri;

        public Object getController() {
            return controller;
        }

        public Handle setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public Method getMethod() {
            return method;
        }

        public Handle setMethod(Method method) {
            this.method = method;
            return this;
        }

        public String getUri() {
            return uri;
        }

        public Handle setUri(String uri) {
            this.uri = uri;
            return this;
        }
    }
}
