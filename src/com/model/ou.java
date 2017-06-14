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
public class ou {

    protected String[][] matriz = new String[9][9];
    private final Random numAleatorio = new Random();
    private String num = "0";
    private boolean cont = false;
    private int numI = 0;
    private int numJ = 0;

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
                matriz[i][j] = "0";
            }
        }
//        cont = 0;

        while (cont = true) {

            num = Integer.toString(numAleatorio.nextInt(10));
            numI = numAleatorio.nextInt(9);
            numJ = numAleatorio.nextInt(9);
            if (!num.equals("0")) { // VERIFICAÇÃO DE IMPLEMENTAÇÃO DE NÚMEROS SE A CÉLULA ESTIVER VAZIA
                if (!matriz[numI][numJ].equals(num) || matriz[numI][numJ].equals("0")) {
                    matriz[numI][numJ] = num;
//                    cont++;
                    cont = true;

//                  VERIFICAÇÃO DE NÚMEROS REPITIDOS NA LINHA
                    for (int i = numI; i == numI; i++) {
                        for (int j = 0; j < 9; j++) {
                            if (numI == i && numJ != j) {
                                if (num.equals(matriz[i][j])) {
                                    matriz[i][j] = "0";
//                                    cont--;
                                    cont = false;
                                }
                            }
                        }
                    }

//                  VERIFICAÇÃO DE NÚMEROS REPITIDOS NA COLUNA
                    for (int i = 0; i < 9; i++) {
                        for (int j = numJ; j == numJ; j++) {
                            if (numI != i && numJ == j) {
                                if (num.equals(matriz[i][j])) {
                                    matriz[i][j] = "0";
//                                    cont--;
                                    cont = false;
                                }
                            }
                        }
                    }

                    switch (numI) {
                        case 0:
                        case 1:
                        case 2:

                            if (numJ == 0 || numJ == 1 || numJ == 2) {
                                
                                for (int i = 0; i < 3; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        if (numI != i && numJ != j) {
                                            if (num.equals(matriz[i][j])) {
                                                matriz[i][j] = "0";
                                                cont = false;
                                            }
                                        }
                                    }
                                }

                            } else if (numJ == 3 || numJ == 4 || numJ == 5) {
                                
                                for (int i = 0; i < 3; i++) {
                                    for (int j = 3; j < 6; j++) {
                                        if (numI != i && numJ != j) {
                                            if (num.equals(matriz[i][j])) {
                                                matriz[i][j] = "0";
                                                cont = false;
                                            }
                                        }
                                    }
                                }

                            } else if (numJ == 6 || numJ == 7 || numJ == 8) {
                                
                                for (int i = 0; i < 3; i++) {
                                    for (int j = 6; j < 9; j++) {
                                        if (numI != i && numJ != j) {
                                            if (num.equals(matriz[i][j])) {
                                                matriz[i][j] = "0";
                                                cont = false;
                                            }
                                        }
                                    }
                                }

                            }
                            break;

                        case 3:
                        case 4:
                        case 5:

                            if (numJ == 0 || numJ == 1 || numJ == 2) {
                                
                                for (int i = 3; i < 5; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        if (numI != i && numJ != j) {
                                            if (num.equals(matriz[i][j])) {
                                                matriz[i][j] = "0";
                                                cont = false;
                                            }
                                        }
                                    }
                                }

                            } else if (numJ == 3 || numJ == 4 || numJ == 5) {
                                
                                for (int i = 3; i < 3; i++) {
                                    for (int j = 3; j < 6; j++) {
                                        if (numI != i && numJ != j) {
                                            if (num.equals(matriz[i][j])) {
                                                matriz[i][j] = "0";
                                                cont = false;
                                            }
                                        }
                                    }
                                }

                            } else if (numJ == 6 || numJ == 7 || numJ == 8) {
                                
                                for (int i = 3; i < 3; i++) {
                                    for (int j = 6; j < 9; j++) {
                                        if (numI != i && numJ != j) {
                                            if (num.equals(matriz[i][j])) {
                                                matriz[i][j] = "0";
                                                cont = false;
                                            }
                                        }
                                    }
                                }

                            }
                            break;

                        case 6:
                        case 7:
                        case 8:

                            if (numJ == 0 || numJ == 1 || numJ == 2) {
                                
                                for (int i = 6; i < 3; i++) {
                                    for (int j = 0; j < 3; j++) {
                                        if (numI != i && numJ != j) {
                                            if (num.equals(matriz[i][j])) {
                                                matriz[i][j] = "0";
                                                cont = false;
                                            }
                                        }
                                    }
                                }

                            } else if (numJ == 3 || numJ == 4 || numJ == 5) {
                                
                                for (int i = 6; i < 3; i++) {
                                    for (int j = 3; j < 6; j++) {
                                        if (numI != i && numJ != j) {
                                            if (num.equals(matriz[i][j])) {
                                                matriz[i][j] = "0";
                                                cont = false;
                                            }
                                        }
                                    }
                                }

                            } else if (numJ == 6 || numJ == 7 || numJ == 8) {
                                
                                for (int i = 6; i < 3; i++) {
                                    for (int j = 6; j < 9; j++) {
                                        if (numI != i && numJ != j) {
                                            if (num.equals(matriz[i][j])) {
                                                matriz[i][j] = "0";
                                                cont = false;
                                            }
                                        }
                                    }
                                }

                            }
                            break;

                    }

                }
            }
        }

//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                if (matriz[i][j].equals("0")) {
//                    matriz[i][j] = "";
//                }
//
//            }
//        }
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
