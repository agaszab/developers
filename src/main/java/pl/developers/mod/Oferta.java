package pl.developers.mod;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Oferta {

    @Id
    @GeneratedValue
    private Long id;

    private int metraz;
    private int pietro;
    private int ile_pokoi;
    private String url_planu;
    private int cena;
    private String opis;

    @Enumerated(EnumType.STRING)
    private Status status;

    private boolean promocja;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public int getMetraz() {
        return metraz;
    }

    public void setMetraz(int metraz) {
        this.metraz = metraz;
    }

    public int getPietro() {
        return pietro;
    }

    public void setPietro(int pietro) {
        this.pietro = pietro;
    }

    public int getIle_pokoi() {
        return ile_pokoi;
    }

    public void setIle_pokoi(int ile_pokoi) {
        this.ile_pokoi = ile_pokoi;
    }

    public String getUrl_planu() {
        return url_planu;
    }

    public void setUrl_planu(String url_planu) {
        this.url_planu = url_planu;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isPromocja() {
        return promocja;
    }

    public void setPromocja(boolean promocja) {
        this.promocja = promocja;
    }
}
