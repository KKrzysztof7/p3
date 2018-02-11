package Przyrost3.p3.services;

import Przyrost3.p3.entities.aktor;
import Przyrost3.p3.repositories.aktorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class aktorServiceImpl implements aktorService{

    @Autowired
    private aktorRepository aktorRepository;

    @Override
    public Iterable<aktor> listAllAktors(){return aktorRepository.findAll();}
    @Override
    public aktor saveAktor(aktor aktor){return aktorRepository.save(aktor);}
    @Override
    public aktor getAktorById(Integer Id){return aktorRepository.findOne(Id);}
    @Override
    public void deleteAktor(Integer id) {aktorRepository.delete(id);}

}
