package Domenico.enteties;

import Domenico.Enum.ElementoPrestato;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Prestito {



    @ManyToMany
    @JoinTable(name = "utenti_id",joinColumns = @JoinColumn(name = "utenti"))
    private List<Utente> utente;
    @Id
    @Enumerated(EnumType.STRING)
    private ElementoPrestato elementoPrestato;

    private LocalDate dataInizioPrestito;

    private LocalDate dataRestituzionePrevista;

    private LocalDate dataRestituzioneEffettiva;

    public Prestito(ElementoPrestato elementoPrestato, LocalDate dataInizioPrestito, LocalDate dataRestituzionePrevista, LocalDate dataRestituzioneEffettiva) {
        this.elementoPrestato = elementoPrestato;
        this.dataInizioPrestito = dataInizioPrestito;
        this.dataRestituzionePrevista = dataRestituzionePrevista;
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }

    public Prestito(){

    }

    public ElementoPrestato getElementoPrestato() {
        return elementoPrestato;
    }

    public void setElementoPrestato(ElementoPrestato elementoPrestato) {
        this.elementoPrestato = elementoPrestato;
    }

    public LocalDate getDataInizioPrestito() {
        return dataInizioPrestito;
    }

    public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
        this.dataInizioPrestito = dataInizioPrestito;
    }

    public LocalDate getDataRestituzionePrevista() {
        return dataRestituzionePrevista;
    }

    public void setDataRestituzionePrevista(LocalDate dataRestituzionePrevista) {
        this.dataRestituzionePrevista = dataRestituzionePrevista;
    }

    public LocalDate getDataRestituzioneEffettiva() {
        return dataRestituzioneEffettiva;
    }

    public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
        this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
    }

    public List<Utente> getUtente() {
        return utente;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "utente=" + utente +
                ", elementoPrestato=" + elementoPrestato +
                ", dataInizioPrestito=" + dataInizioPrestito +
                ", dataRestituzionePrevista=" + dataRestituzionePrevista +
                ", dataRestituzioneEffettiva=" + dataRestituzioneEffettiva +
                '}';
    }
}
