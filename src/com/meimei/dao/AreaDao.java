package com.meimei.dao;

import com.meimei.entity.Area;
import com.meimei.utils.DBUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class AreaDao {
    JdbcTemplate template=new JdbcTemplate(DBUtil.getDataSource());

    public static void main(String[] args) {


    }
    public List<Area> list(){
        String sql="select * from area where type=1";
        return template.query(sql,new BeanPropertyRowMapper<>(Area.class));
    }
    public  List<Area> listCity(Integer id){
        String sql="select * from area where p_id=?";
        return template.query(sql,new BeanPropertyRowMapper<>(Area.class),id);
    }



}
