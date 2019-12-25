package com.atguigu.citymgr.dao;

import com.atguigu.citymgr.domain.City;

import java.util.List;

public interface CityDao {
    public City queryCityById(int id);

    public List<City> queryCityByName(String name);

    public int addCity(City city);

    public int updateCity(City city);

    public int deleteCity(int id);
}
