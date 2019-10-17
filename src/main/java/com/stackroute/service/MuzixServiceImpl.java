package com.stackroute.service;

import com.stackroute.domain.Muzix;
import com.stackroute.exceptions.TrackAlreadyExistsException;
import com.stackroute.exceptions.TrackNotFoundException;
import com.stackroute.repository.MuzixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@Primary
public class MuzixServiceImpl implements MuzixService {

    private MuzixRepository muzixRepository;
    @Autowired
    public MuzixServiceImpl(MuzixRepository muzixRepository) {
        this.muzixRepository = muzixRepository;
    }


    @Override
    public Muzix saveNewMuzix(Muzix muzix) throws TrackAlreadyExistsException {
        if(muzixRepository.existsById(muzix.getId()))
        {
            throw new TrackAlreadyExistsException("Track already exists!!!");
        }
        Muzix saveNewMuzix=muzixRepository.save(muzix);
        return saveNewMuzix;
    }


    @Override
    public List<Muzix> getMuzix() {
        return muzixRepository.findAll();
    }

    @Override
    public Muzix getById(int id) throws TrackNotFoundException {
        Optional<Muzix> trackId= muzixRepository.findById(id);
        if(trackId.isEmpty()){
            throw new TrackNotFoundException("Track not Found!!!");
        }
        return trackId.get();
    }

    @Override
    public void deleteById(int id) throws TrackNotFoundException{
        Optional<Muzix> trackId=muzixRepository.findById(id);
        if(trackId.isEmpty())
        {
            throw new TrackNotFoundException("Track not found!!!");
        }
        muzixRepository.deleteById(id);
    }

    @Override
    public boolean updateById(Muzix muzix, int id) throws TrackNotFoundException{
        Optional<Muzix> trackId=muzixRepository.findById(id);
        if(trackId.isEmpty()){
            throw new TrackNotFoundException("Track not found!!!");
        }
        muzix.setId(id);
        muzixRepository.save(muzix);
        return true;
    }
    @Override
    public Muzix getByName(String name){
        return muzixRepository.findByTitle(name);
    }


}
