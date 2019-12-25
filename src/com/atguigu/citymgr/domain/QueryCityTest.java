package com.atguigu.citymgr.domain;

import com.atguigu.citymgr.dao.CityDao;
import com.atguigu.citymgr.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class QueryCityTest {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CityDao cityDao = sqlSession.getMapper(CityDao.class);
        City city = cityDao.queryCityById(3);
        System.out.println(city);
        System.out.println("=========================");
        List<City> cities = cityDao.queryCityByName("b");
        for (City c : cities) {
            System.out.println(c);
        }
    }
}
