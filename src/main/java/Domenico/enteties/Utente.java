package Domenico.enteties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
@Entity
public class Utente {
    private String nome;

    private  String cognome;

    private LocalDate dataDiNascita;
    @Id
    @GeneratedValue
    private UUID numeroTessera;
    @ManyToMany
    @JoinTable(name = "prestiti_id",joinColumns = @JoinColumn(name = "prestiti"))
    private List<Prestito> prestito;

    public Utente(String nome, String cognome, LocalDate dataDiNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    public Utente(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public UUID getNumeroTessera() {
        return numeroTessera;
    }

    public List<Prestito> getPrestito() {
        return prestito;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", numeroTessera=" + numeroTessera +
                '}';
    }
}
