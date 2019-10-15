package com.stackroute.service;

import com.stackroute.domain.Muzix;
import com.stackroute.repository.MuzixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MuzixServiceImpl implements MuzixService {
    MuzixRepository muzixRepository;
    @Autowired
    public MuzixServiceImpl(MuzixRepository muzixRepository) {
        this.muzixRepository = muzixRepository;
    }


    @Override
    public Muzix saveNewMuzix(Muzix muzix) {
        Muzix saveNewMuzix=muzixRepository.save(muzix);
        return saveNewMuzix;
    }

    @Override
    public List<Muzix> getMuzix() {
        return muzixRepository.findAll();
    }

    @Override
    public Muzix getById(int id) {
        return muzixRepository.findById(id).get();
    }

    @Override
    public void deleteById(int id){
        muzixRepository.deleteById(id);
    }

    @Override
    public boolean updateById(Muzix muzix, int id) {
        muzix.setId(id);
        muzixRepository.save(muzix);
        return true;
    }


}
