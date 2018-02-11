package Przyrost3.p3.services;

import Przyrost3.p3.entities.gatunek;
import Przyrost3.p3.repositories.gatunekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class gatunekServiceImpl implements gatunekService{

    @Autowired
    private gatunekRepository gatunekRepository;

    @Override
    public Iterable<gatunek> listAllGatunek(){return gatunekRepository.findAll();}
    @Override
    public gatunek saveGatunek(gatunek gatunek){return gatunekRepository.save(gatunek);}
    @Override
    public gatunek getGatunekById(Integer id){return gatunekRepository.findOne(id);}
    @Override
    public gatunek getGatunekByNazwa(String nazwa){return gatunekRepository.findByNazwa(nazwa);}
    @Override
    public void deleteGatunek(Integer id){gatunekRepository.delete(id);}

}
