//package com.ms.filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
///**
// * CORS 跨域
// * @author shiguang
// */
//@WebFilter("/*")
//public class CORSFilter implements Filter {
//
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        Filter.super.init(filterConfig);
//    }
//
//    @Override
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
//        // 设置跨域请求
//        HttpServletRequest request = (HttpServletRequest) req;
//        HttpServletResponse response = (HttpServletResponse) resp;
//        String[] allowDomains = {"http://www.estre.site"};
//        Set allowOrigins = new HashSet<>(Arrays.asList(allowDomains));
//        String originHeads = request.getHeader("Origin");
//        if(allowOrigins.contains(originHeads)) {
//            response.setHeader("Access-Control-Allow-Origin", originHeads);
//            response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE,HEAD,PUT,PATCH");
//            response.setHeader("Access-Control-Max-Age", "36000");
//            response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept,Authorization,authorization");
//            response.setHeader("Access-Control-Allow-Credentials","true");
//        }
//        chain.doFilter(req, response);
//    }
//
//    @Override
//    public void destroy() {
//        Filter.super.destroy();
//    }
//}
