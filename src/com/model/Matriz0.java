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
public class Matriz0{

    protected ArrayList<Integer> lista = new ArrayList<Integer>();
    protected String[][] matriz = new String[9][9];
    protected String[][] matrizSolucao = new String[9][9];
    protected String[] temp = new String[9];
    protected final Random rand = new Random();
    protected String num2 = "";
    protected int num = 0;
    protected boolean exec = true;
    protected int cont = -1;
    protected int numJ = 0, numI = 0;
    protected final String parametro = "[123456789]";

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

    public void PreencherMatriz() {
//
        cont = -1;

//      Setor 1.1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cont++;
                matriz[i][j] = temp[cont];
            }
        }

//      Setor 1.2
        cont = 2;
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 6; j++) {
                cont++;
                matriz[i][j] = temp[cont];
                if (cont == 8) {
                    cont = -1;
                }
            }
        }

//      Setor 1.3
        cont = 5;
        for (int i = 0; i < 3; i++) {
            for (int j = 6; j < 9; j++) {
                cont++;
                matriz[i][j] = temp[cont];
                if (cont == 8) {
                    cont = -1;
                }
            }
        }

//      Setor 2.1
        cont = 0;
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                cont++;
                matriz[i][j] = temp[cont];
                if (cont == 8) {
                    cont = -1;
                }
            }
        }

//      Setor 2.2
        cont = 3;
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                cont++;
                matriz[i][j] = temp[cont];
                if (cont == 8) {
                    cont = -1;
                }
            }
        }

//      Setor 2.3
        cont = 6;
        for (int i = 3; i < 6; i++) {
            for (int j = 6; j < 9; j++) {
                cont++;
                matriz[i][j] = temp[cont];
                if (cont == 8) {
                    cont = -1;
                }
            }
        }

//      Setor 3.1
        cont = 1;
        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                cont++;
                matriz[i][j] = temp[cont];
                if (cont == 8) {
                    cont = -1;
                }
            }
        }

//      Setor 3.2
        cont = 4;
        for (int i = 6; i < 9; i++) {
            for (int j = 3; j < 6; j++) {
                cont++;
                matriz[i][j] = temp[cont];
                if (cont == 8) {
                    cont = -1;
                }
            }
        }

//      Setor 3.3
        cont = 7;
        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                cont++;
                matriz[i][j] = temp[cont];
                if (cont == 8) {
                    cont = -1;
                }
            }
        }

    }
    
//    public void Solucao(){
//        for(int i = 0; i < 9; i++){
//            for(int j = 0; j < 9; j++){
//                matrizSolucao[i][j] = matriz[i][j];
//            }
//        }
//    }

    public void Difilculdade() {

        cont = 0;

//      VERIFICAÇÃO DE NÚMEROS REPITIDOS NA LINHA
        while (cont < 2) {
            numI = rand.nextInt(9);
            numJ = rand.nextInt(9);

            for (int i = numI; i == numI; i++) {
                for (int j = numJ; j == numJ; j++) {

                    matriz[i][j] = "0";
                    matriz[j][i] = "0";
                    cont++;
                }
            }

        }

    }

    public void ApagarCasas() {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (matriz[i][j].equals("0")) {
                    matriz[i][j] = "";
                }

            }
        }
    }

//    public void Validar() throws Exception {
//
////        for (int i = 0; i < matriz.length; i++) {
////            for (int j = 0; j < matriz.length; j++) {
////
////                num2 = matriz[i][j];               
////                
////                if (i + j != 0) {
////
////                    for (int k = i; k == i; k++) {
////                        for (int l = 0; l < 9; l++) {
////                            if (k == i && l != j) {
////                                if (num2.equals(matriz[k][l])) {
////                                    throw new Exception("Exite númreros duplicados!!");
////                                }
////                            }
////
////                            if (!(this.matriz[k][l].matches(parametro))) {
////                                throw new Exception("Celula preenchida com conteúdo invalido!!");
////                            }
////
////                        }
////                    }
////
////                }
////            }
////        }
//    }

}
