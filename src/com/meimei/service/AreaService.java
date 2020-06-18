package com.meimei.service;

import com.meimei.dao.AreaDao;
import com.meimei.entity.Area;

import java.util.List;

public class AreaService {
private AreaDao areaDao=new AreaDao();

    public List<Area> list(){
        return areaDao.list();
    }
    public  List<Area> listCity(Integer id){
        return areaDao.listCity(id);
    }
}
