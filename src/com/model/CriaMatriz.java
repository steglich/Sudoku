/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author marlon
 */
public class CriaMatriz {

    private ArrayList<Integer> lista = new ArrayList<Integer>();
    private String[] temp = new String[9];
    private final Random rand = new Random();
    private int num = 0;

    public void CriaNumAleatorio() {

//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//                matriz[i][j] = "0";
//            }
//        }

        for (int i = 0; i < 9; i = i + 0) {

            num = rand.nextInt(9) + 1;
            if (lista.contains(num) == false) {

                temp[i] = Integer.toString(num);
                lista.add(num);
                i++;

            }
        }

        lista = new ArrayList<Integer>();

    }

    /**
     * @return the temp
     */
    public String[] getTemp() {
        return temp;
    }

    
}
