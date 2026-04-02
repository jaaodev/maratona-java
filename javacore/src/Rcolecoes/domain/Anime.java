package Rcolecoes.domain;

import java.util.Objects;

public class Anime implements Comparable<Anime> {
    private Long id;
    private String nome;
    private double preco;

    public Anime(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "Id não pode ser null.");
        Objects.requireNonNull(nome, "Nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Anime anime = (Anime) o;
        return Double.compare(preco, anime.preco) == 0 && Objects.equals(id, anime.id) && Objects.equals(nome, anime.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Anime outroAnime) {
        // você tem que retornar negativo se this < outroAnime
        // se this == outroAnime, return 0
        // positivo se this > outroAnime
        /*if(this.id < outroAnime.getId()){
            return -1;
        }else if(this.id.equals(outroAnime.getId())){
            return 0;
        }else{
            return 1;
        } */
        return this.nome.compareTo(outroAnime.getNome());
       // return Double.valueOf(preco).compareTo(outroAnime.getPreco());
       // return this.id.compareTo(outroAnime.getId()); //dessa forma eu to utilizando o compareTo do Long, nesse caso id.
    }
}
