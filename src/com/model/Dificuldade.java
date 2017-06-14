/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.Random;

/**
 *
 * @author marlon
 */
public class Dificuldade {
    
//    private Matriz matrizDific = new Matriz();
    private String[][] temp = new String[9][9];
    private final Random rand = new Random();
    private int cont = -1;
    private int numJ = 0, numI = 0;
    
    public void DifilculdadeDificil(){

        cont = 0;

//      VERIFICAÇÃO DE NÚMEROS REPITIDOS NA LINHA
        while (cont < 70) {
            numI = rand.nextInt(9);
            numJ = rand.nextInt(9);

            for (int i = numI; i == numI; i++) {
                for (int j = numJ; j == numJ; j++) {
                                        
                    temp[i][j] = "0";
                    temp[j][i] = "0";
                    cont++;
                }
            }
        }
//        getMatrizDific().setMatriz(temp);
    }
//
//    /**
//     * @return the matriz
//     */
//    public Matriz getMatrizDific() {
//        return matrizDific;
//    }
    
}
