package Rcolecoes.test;

import Rcolecoes.domain.Anime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AnimeByIdComparator implements Comparator<Anime> {

    @Override
    public int compare(Anime anime1, Anime anime2) {
        return anime1.getId().compareTo(anime2.getId());
    }
}

public class AnimeSortTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>();
        animes.add(new Anime(5L, "Naruto", 19.9));
        animes.add(new Anime(1L, "One Piece", 9.5));
        animes.add(new Anime(4L, "Dragon Ball", 3.2));
        animes.add(new Anime(3L, "Kaiju N 8", 11.20));
        animes.add(new Anime(2L, "Attack On Titan", 2.99));
        System.out.println("Lista normal: ");
        for (Anime a : animes) {
            System.out.println(a);
        }
        // para conseguir utilizar o Collections.sort você precisa implementar um comparable na classe do objeto
        // e um metodo compateTo(Anime outroAnime) <---exemplo do q eu usei nesse caso.
        // da pra usar o metodo compareTo do próprio Long, nesse caso o Long id.
        // para utilizar o metodo compareTo com tipos primitivos você precisa converter para double utilizando o valueOf
        // exemplo : return Double.valueOf(preco).compareTo(outroAnime.getPreco());
        // por fim, para comparar pelo nome, no caso String é da mesma forma que é com o Long.
        System.out.println("-----------");
        System.out.println("Lista sort: ");
        Collections.sort(animes);
        for (Anime a : animes) {
            System.out.println(a);
        }
        System.out.println("-----------");
        System.out.println("Lista comparator: ");
        // Collections.sort(animes, new AnimeByIdComparator());
        animes.sort(new AnimeByIdComparator());
        for (Anime a : animes) {
            System.out.println(a);
        }
    }
}
