package com.stackroute.service;

import com.stackroute.domain.Muzix;
import com.stackroute.exceptions.TrackAlreadyExistsException;
import com.stackroute.exceptions.TrackNotFoundException;

import java.util.List;

public interface MuzixService {

    public Muzix saveNewMuzix(Muzix muzix) throws TrackAlreadyExistsException;

    public List<Muzix> getMuzix();

    public Muzix getById(int id) throws TrackNotFoundException;

    public void deleteById(int id) throws TrackNotFoundException;

    public boolean updateById(Muzix muzix, int id) throws TrackNotFoundException;

    public Muzix getByName(String name);


}
