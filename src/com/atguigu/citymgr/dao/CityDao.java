package com.atguigu.citymgr.dao;

import com.atguigu.citymgr.domain.City;

import java.util.List;

public interface CityDao {
    City queryCityById(int id);

    List<City> queryCityByName(String name);

    int addCity(City city);

    int updateCity(City city);

    int deleteCity(int id);
}
