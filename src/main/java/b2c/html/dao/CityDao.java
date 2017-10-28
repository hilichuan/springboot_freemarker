package b2c.html.dao;

import b2c.html.domain.City;

import java.util.List;

/**
 * Created by 菜小川 on 2017/10/27.
 */
public interface CityDao {
    List<City> findAllCity();
}
