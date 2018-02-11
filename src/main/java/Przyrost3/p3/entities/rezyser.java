package Przyrost3.p3.entities;

import javax.persistence.*;

@Entity
public class rezyser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "imie")
    private String imie;

    @Column(name = "nazwisko")
    private String nazwisko;

    public rezyser() {}

    public rezyser(Integer id, String imie, String nazwisko) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int x ) {
        this.id = x;
    }

    public String getImie() {return imie;}

    public void setImie(String x) {this.imie = x;}

    public String getNazwisko() {return nazwisko;}

    public void setNazwisko(String x) {this.nazwisko = x;}


}
