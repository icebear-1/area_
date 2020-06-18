package com.meimei.controller;

import com.alibaba.fastjson.JSON;
import com.meimei.entity.Area;
import com.meimei.service.AreaService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/city")
public class CityServlet extends HttpServlet {
    private AreaService areaService=new AreaService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       String strId=request.getParameter("id");
        List<Area> list=new ArrayList<>();
        list=areaService.listCity(Integer.valueOf(strId));
        String jsonStr= JSON.toJSONString(list);
        PrintWriter pw=response.getWriter();
        pw.write(jsonStr);

    }
}
