package b2c.html.service.Impl;

import b2c.html.dao.CityDao;
import b2c.html.domain.City;
import b2c.html.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 菜小川 on 2017/10/27.
 */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityDao cityDao;
    @Override
    public List<City> findAllCity(){
        return cityDao.findAllCity();
    }
}
