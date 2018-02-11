package Przyrost3.p3.entities;

import javax.persistence.*;

@Entity
public class gatunek {

    public gatunek() {}

    public gatunek(Integer id, String nazwa) {
        this.id = id;
        this.nazwa = nazwa;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nazwa")
    private String nazwa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

}
