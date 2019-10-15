package com.stackroute.service;

import com.stackroute.domain.Muzix;

import java.util.List;

public interface MuzixService {

    public Muzix saveNewMuzix(Muzix muzix);

    public List<Muzix> getMuzix();

    public Muzix getById(int id);

    public void deleteById(int id);

    public boolean updateById(Muzix muzix, int id);

    public Muzix getByName(String name);


}
