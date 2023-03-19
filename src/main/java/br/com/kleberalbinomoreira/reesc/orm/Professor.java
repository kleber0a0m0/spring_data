package br.com.kleberalbinomoreira.reesc.orm;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false,unique = true)
    private String pronturario;

    @OneToMany(mappedBy = "professor")
    List<Diciplina> diciplinas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPronturario() {
        return pronturario;
    }

    public void setPronturario(String pronturario) {
        this.pronturario = pronturario;
    }

    public Professor(String nome, String pronturario) {
        this.id = id;
        this.nome = nome;
        this.pronturario = pronturario;
    }

    public Professor() {}

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", prontuario='" + pronturario + '\'' +
                '}';
    }
}
