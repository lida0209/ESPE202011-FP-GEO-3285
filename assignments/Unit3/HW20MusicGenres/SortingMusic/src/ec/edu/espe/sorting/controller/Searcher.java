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
public class Searcher {

    public static int findMusic(String[] elements, String x) {
        int i;
        int n = elements.length;
        for (i = 0; i < n; i++) {
            if (elements[i] == null ? x == null : elements[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }
}
