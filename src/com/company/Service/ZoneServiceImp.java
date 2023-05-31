package com.company.Service;

import com.company.Dao.ZoneDao;
import com.company.Model.Zones;

import java.sql.SQLException;
import java.util.List;

public class ZoneServiceImp implements ZoneService{
    ZoneDao zoneDao=new ZoneDao();
    @Override
    public int intsert(Zones zones) throws SQLException, ClassNotFoundException {
        return zoneDao.intsert(zones);
    }

    @Override
    public int update(Zones zones, int id) throws SQLException, ClassNotFoundException {
        return zoneDao.update(zones,id);
    }

    @Override
    public int Delete(int id) throws SQLException, ClassNotFoundException {
        return zoneDao.Delete(id);
    }

    @Override
    public List<Zones> Selectall() throws SQLException, ClassNotFoundException {
        return zoneDao.Selectall();
    }

    @Override
    public Zones Select(int id) throws SQLException, ClassNotFoundException {
        return zoneDao.Select(id);
    }
}
