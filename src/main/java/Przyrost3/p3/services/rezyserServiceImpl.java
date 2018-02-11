package Przyrost3.p3.services;

import Przyrost3.p3.entities.rezyser;
import Przyrost3.p3.repositories.rezyserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class rezyserServiceImpl implements rezyserService{

    @Autowired
    private rezyserRepository rezyserRepository;
    @Override
    public Iterable<rezyser> listAllRezysers(){return rezyserRepository.findAll();}
    @Override
    public rezyser saveRezyser(rezyser rezyser){return rezyserRepository.save(rezyser);}
    @Override
    public rezyser getRezyserById(Integer Id){return rezyserRepository.findOne(Id);}
    @Override
    public void deleteRezyser(Integer id) {rezyserRepository.delete(id);}

}