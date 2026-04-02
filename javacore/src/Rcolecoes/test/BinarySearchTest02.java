package Rcolecoes.test;

import Rcolecoes.domain.Anime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>();
        AnimeByIdComparator animeByIdComparator = new AnimeByIdComparator();
        animes.add(new Anime(5L, "Naruto", 19.9));
        animes.add(new Anime(1L, "One Piece", 9.5));
        animes.add(new Anime(4L, "Dragon Ball", 3.2));
        animes.add(new Anime(3L, "Kaiju N 8", 11.20));
        animes.add(new Anime(2L, "Attack On Titan", 2.99));
        System.out.println("Lista normal: ");
        for (Anime a : animes) {
            System.out.println(a);
        }

        //Collections.sort(animes);
        animes.sort(animeByIdComparator);

        Anime animeToSearch = new Anime(2L, "Attack On Titan", 2.99);

        System.out.println(Collections.binarySearch(animes, animeToSearch, animeByIdComparator));

    }
}
