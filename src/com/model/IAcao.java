/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author marlon
 */
public interface IAcao {
    
    void CriaNumAleatorio();
    void PreencherMatriz();
    void Difilculdade();
    void ApagarCasas();
    void Validar() throws Exception;
    
}
