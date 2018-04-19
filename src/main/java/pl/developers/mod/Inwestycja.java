package pl.developers.mod;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Inwestycja {

    @Id
    @GeneratedValue
    private Long id;


    @OneToMany
    @JoinColumn(name = "id_inwest", referencedColumnName = "id")
    private List<Oferta> oferty;

    private String nazwa;
    private String opis;
    private String url;
    private Date data_ukonczenia;
    private String miasto;
    private String ulica;
    private String nr_domu;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public List<Oferta> getOferty() {
        return oferty;
    }

    public void setOferty(List<Oferta> oferty) {
        this.oferty = oferty;
    }

    public String getUrl() {

        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getData_ukonczenia() {
        return data_ukonczenia;
    }

    public void setData_ukonczenia(Date data_ukonczenia) {
        this.data_ukonczenia = data_ukonczenia;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNr_domu() {
        return nr_domu;
    }

    public void setNr_domu(String nr_domu) {
        this.nr_domu = nr_domu;
    }
}
