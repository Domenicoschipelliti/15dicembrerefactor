package Domenico.enteties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Locale;
import java.util.UUID;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CatalogoBibliotecario {
    @Id
    @GeneratedValue
    private UUID codiceISBN;
    private String titolo;

    private LocalDate annoDiPubblicazione;

    private int numeroPagine;


    public CatalogoBibliotecario(String titolo, LocalDate annoDiPubblicazione, int numeroPagine) {
        this.titolo = titolo;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public CatalogoBibliotecario(){

    }

    public UUID getCodiceISBN() {
        return codiceISBN;
    }

    public LocalDate getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setAnnoDiPubblicazione(LocalDate annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public String getTitolo() {
        return titolo;
    }



    public int getNumeroPagine() {
        return numeroPagine;
    }

    @Override
    public String toString() {
        return "CatalogoBibliotecario{" +
                "codiceISBN=" + codiceISBN +
                ", titolo='" + titolo + '\'' +
                ", annoDiPubblicazione=" + annoDiPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
