package Domenico.enteties;

import Domenico.Enum.Genere;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Entity
public class Libro extends CatalogoBibliotecario{
    private String autore;
    @Enumerated(EnumType.STRING)
    private Genere genere;

    public Libro(String titolo, LocalDate annoDiPubblicazione, int numeroPagine, String autore, Genere genere) {
        super(titolo, annoDiPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public Libro(){

    }
    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere=" + genere +
                '}';
    }
}
