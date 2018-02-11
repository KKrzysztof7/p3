package Przyrost3.p3.services;

import Przyrost3.p3.entities.aktor;
import org.springframework.stereotype.Service;

@Service
public interface aktorService {

    Iterable<aktor> listAllAktors();
    aktor getAktorById(Integer Id);
    aktor saveAktor(aktor aktor);
    void deleteAktor(Integer id);

}
