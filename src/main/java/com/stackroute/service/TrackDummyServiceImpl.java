package com.stackroute.service;

import com.stackroute.domain.Muzix;
import com.stackroute.exceptions.TrackAlreadyExistsException;
import com.stackroute.exceptions.TrackNotFoundException;

import java.util.List;

public class TrackDummyServiceImpl implements MuzixService{
    @Override
    public Muzix saveNewMuzix(Muzix muzix) throws TrackAlreadyExistsException {
        System.out.println("Output from Dummy class ");
        return muzix;
    }

    @Override
    public List<Muzix> getMuzix() {
        System.out.println("Output from Dummy class ");
        return null;
    }

    @Override
    public Muzix getById(int id) throws TrackNotFoundException {
        System.out.println("Output from Dummy class ");
        return null;
    }

    @Override
    public void deleteById(int id) throws TrackNotFoundException {
        System.out.println("Output from Dummy class ");

    }

    @Override
    public boolean updateById(Muzix muzix, int id) throws TrackNotFoundException {
        System.out.println("Output from Dummy class ");
        return false;
    }

    @Override
    public Muzix getByName(String name) {
        System.out.println("Output from Dummy class ");
        return null;
    }
}
