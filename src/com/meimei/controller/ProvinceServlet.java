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

@WebServlet("/province")
public class ProvinceServlet extends HttpServlet {
    private AreaService areaService=new AreaService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Area> list=new ArrayList<>();
        //String idStr=request.getParameter("id");
        list=areaService.list();
        String jsonStr= JSON.toJSONString(list);
        PrintWriter pw=response.getWriter();
        pw.write(jsonStr);

    }
}
