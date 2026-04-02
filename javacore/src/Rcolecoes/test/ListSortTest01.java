package Rcolecoes.test;

import Rcolecoes.domain.Anime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> animes = new  ArrayList<>();
        animes.add("Naruto");
        animes.add("One Piece");
        animes.add("Dragon Ball");
        animes.add("Kaiju N 8");
        animes.add("Atack On Titan");
        Collections.sort(animes);
        for (String s : animes) {
            System.out.println(s);
        }

        new Anime(null, null, 0);

    }
}
