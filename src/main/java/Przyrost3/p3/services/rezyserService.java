package Przyrost3.p3.services;

import Przyrost3.p3.entities.rezyser;
import org.springframework.stereotype.Service;

@Service
public interface rezyserService {

    Iterable<rezyser> listAllRezysers();
    rezyser getRezyserById(Integer Id);
    rezyser saveRezyser(rezyser rezyser);
    void deleteRezyser(Integer id);

}
