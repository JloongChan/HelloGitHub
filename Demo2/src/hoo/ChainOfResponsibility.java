package com.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 责任链模式
 *
 * @author chenjinlong
 * @date : 2020/5/12
 */
public class ChainOfResponsibility {

    public static void main(String[] args) {
        Request request = new Request();
        request.request = "request ";
        Response response = new Response();
        response.response = "response ";
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new AFilter());
        filterChain.addFilter(new BFilter());
        filterChain.doFilter(request, response);
    }

    static class Request {
        String request;
    }

    static class Response {
        String response;
    }

    /**
     * A Filter
     */
    static class AFilter implements Filter {
        static String str = "A";

        @Override
        public void doFilter(Request request, Response response, FilterChain filterChain) {
            request.request = request.request + " " + str;
            System.out.println(request.request);
            filterChain.doFilter(request, response);
            response.response = response.response + " " + str;
            System.out.println(response.response);
        }
    }

    /**
     * B Filter
     */
    static class BFilter implements Filter {
        static String str = "B";

        @Override
        public void doFilter(Request request, Response response, FilterChain filterChain) {
            request.request = request.request + " " + str;
            System.out.println(request.request);
            filterChain.doFilter(request, response);
            response.response = response.response + " " + str;
            System.out.println(response.response);
        }
    }

    interface Filter {
        void doFilter(Request request, Response response, FilterChain filterChain);
    }

    /**
     * Filter链条
     */
    static class FilterChain {

        /**
         * 游标
         */
        static int i = -1;

        List<Filter> filterList = new ArrayList<>();

        void addFilter(Filter filter) {
            filterList.add(filter);
        }

        public void doFilter(Request request, Response response) {
            i++;
            if (filterList.size() > i) {
                filterList.get(i).doFilter(request, response, this);
            }
        }
    }

}
