package Przyrost3.p3.services;

import Przyrost3.p3.entities.gatunek;
import org.springframework.stereotype.Service;

@Service
public interface gatunekService {

    Iterable<gatunek> listAllGatunek();
    gatunek getGatunekById(Integer Id);
    gatunek saveGatunek(gatunek gatunek);
    gatunek getGatunekByNazwa(String nazwa);
    void deleteGatunek(Integer Id);

}
