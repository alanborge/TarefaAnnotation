/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TarefaAnotation;

/**
 *
 * @author alan.menezes
 */
public class Main {
    public static void main(String[] args) {
         Class<?> classeCliente = Cliente.class;

        // Verificar se a anotação Tabela está presente
        if (classeCliente.isAnnotationPresent(Tabela.class)) {
            // Obter a instância da anotação Tabela
            Tabela tabelaAnnotation = classeCliente.getAnnotation(Tabela.class);

            // Imprimir informações da anotação
            System.out.println("Nome da tabela para a classe Cliente: " + tabelaAnnotation.nome());
        } else {
            System.out.println("A anotação Tabela não está presente na classe Cliente.");
        }
    }
}
