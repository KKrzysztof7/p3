package Przyrost3.p3.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.sun.javafx.scene.control.skin.VirtualFlow;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.IntSequenceGenerator.class,
        property="refId", scope=film.class)
public class film {

    public film() {}

    public film(String tytul, ZonedDateTime DataPowstania, rezyser rezyser, List<aktor> aktorzy, gatunek gatunek){
        this.id = id;
        this.tytul = tytul;
        this.DataPowstania = DataPowstania;
        this.rezyser = rezyser;
        this.aktorzy = aktorzy;
        this.gatunek = gatunek;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "tytul")
    private String tytul;

    @Column(name = "DataPowstania")
    private ZonedDateTime DataPowstania;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="rezyser", referencedColumnName = "id")
    private rezyser rezyser;
    public rezyser getRezyser() {return rezyser;}
    public void setRezyser(rezyser rezyser) {this.rezyser = rezyser;}

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="film_aktor",
            joinColumns=
            @JoinColumn(name="film_id", referencedColumnName="id"),
            inverseJoinColumns=
            @JoinColumn(name="aktor", referencedColumnName="id")
    )
    private List<aktor> aktorzy;
    public void setAktorzy(List<aktor> aktorzy){this.aktorzy = aktorzy;};
    public List<aktor> getAktorzy(){return aktorzy;};

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="gatunek", referencedColumnName = "id")
    private gatunek gatunek;
    public gatunek getGatunek() {return gatunek;}
    public void setGatunek(gatunek gatunek) {this.gatunek = gatunek;}

    public Integer getId() {return id;}

    public void setId(int x ) {this.id = x;}

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String x ) {
        this.tytul = x;
    }

    public ZonedDateTime getDataPowstania() {
        return DataPowstania;
    }

    public void setDataPowstania(ZonedDateTime x ) {
        this.DataPowstania = x;
    }

}