/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sorting.controller;

/**
 *
 * @author HP
 */
public class Sorting {

    String musics[];

    public String[] sortByBubbleSort(String[] musics) {
        this.musics = musics;

        for (int i = 0; i < musics.length; i++) {
            for (int j = 0; j < musics.length && i != j; j++) {
                if (musics[i].compareToIgnoreCase(musics[j]) < 0) {
                    String aux = musics[i];
                    musics[i] = musics[j];
                    musics[j] = aux;
                }
            }
        }
        return musics;
    }

}
