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
public class teste {

    private String[][] teste = {{"0", "0", "0", "0", "0", "0", "0", "0", "0"},
    {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
    {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
    {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
    {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
    {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
    {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
    {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
    {"0", "0", "0", "0", "0", "0", "0", "0", "0"}};
    protected String[][] matriz = new String[9][9];
    private Random numAleatorio = new Random();
    private int num = 0;
    private int numI = 2;
    private int numJ = 2;
    private int numT = 3;

    ;

    /**
     * @return the matriz
     */
    public String[][] getMatriz() {
        return matriz;
    }

    /**
     * @param matriz the matriz to set
     */
    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public void NovoJogo() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                
                matriz[i][j] = Integer.toString(num);
                
                
//                while (num.equals("0")) {
//                    num = Integer.toString(numAleatorio.nextInt(10)); // Escohe os números aleatorios.
//                }
//                matriz[i][j] = num;
//                if (i + j == 16) {
//                    
//                    
//                    
//                    for (int k = i; k == i; k++) {
//                        for (int l = j - 1; l > -1; l--) {
//                            if (matriz[k][l].equals(num)) {
//                                matriz[i][j] = "0";
//                            }
//                        }
//                    }
//                    
//                    for (int k = i - 1; k > - 1; k--) {
//                        for (int l = j; l == j; l++) {
//                            if (matriz[k][l].equals(num)) {
//                                matriz[i][j] = "0";
//                            }
//                        }
//                    }
//                    if((i == 2 && j == 8) || (i == 5 && j == 8) || (i == 8 && j == 8)){
//                        while(numT > 0){
////                            numI = 2;
////                            numJ = numJ + 2;
//                            for(int k = (numI); k > (k - 3); k--){
//                                for(int l = (numJ); l > (l - 3); l--){
//                                    num = matriz[k][l];
//                                    for(int m = 3; m > 0; m--){
//                                        for(int n = 3; n > 0; n--){
////                                            if (!matriz[k][l].equals(matriz[m][n])) {
//                                                matriz[k][l] = "-";
////                                            }
//                                        }
//                                    }                              
//                                }
//                            }
//                            numT--;
//                            numJ = numJ + 2;
//                        }                        
//                        numI =+ 3;
//                        numJ = 3;
//                        numT = + 3;
//                    }
//                }
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (matriz[i][j].equals("0")) {
                    matriz[i][j] = "";
                }

            }
        }
    }

    public void Validar() throws Exception {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

//                matriz[i][j] = num;
                if (i + j != 0) {
                    for (int k = i; k == i; k++) {
                        for (int l = j - 1; l > -1; l--) {
                            if (matriz[k][l].equals(num)) {
                                throw new Exception("Exite númreros duplicados!!");
                            }
                        }
                    }

                    for (int k = i - 1; k > - 1; k--) {
                        for (int l = j; l == j; l++) {
                            if (matriz[k][l].equals(num)) {
                                throw new Exception("Exite númreros duplicados!!");
                            }
                        }
                    }
                }
            }
        }
    }

}
