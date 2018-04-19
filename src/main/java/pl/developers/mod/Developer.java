package pl.developers.mod;

import javax.persistence.*;
import java.util.List;

@Entity
public class Developer {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private DeveloperInfo developerInfo;

    @OneToMany
    @JoinColumn(name = "id_dev", referencedColumnName = "id")
    private List<Inwestycja> inwestycje;

    private String url;
    private String nazwa;
    private String opis;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DeveloperInfo getDeveloperInfo() {
        return developerInfo;
    }

    public void setDeveloperInfo(DeveloperInfo developerInfo) {
        this.developerInfo = developerInfo;
    }

    public List<Inwestycja> getInwestycje() {
        return inwestycje;
    }

    public void setInwestycje(List<Inwestycja> inwestycje) {
        this.inwestycje = inwestycje;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
}
