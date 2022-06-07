package br.edu.cest;

import br.edu.cest.utils.Fila;

import java.util.Scanner;
import java.util.Stack;

/**
 * At-2!
 *
 * Utilizando somente operações de empilhar e desempilhar, escreva um programa que
 * remove um item com chave c fornecida pelo usuário da pilha. Ao final da execução da função, a pilha deve
 * ser igual à original, exceto pela ausência do item removido.
 */
public class App3
{
    public static void main( String[] args )
    {
        Fila<String> mainStack = new Fila<>();
        Fila<String> subStack = new Fila<>();
        Scanner reader = new Scanner(System.in);

        System.out.print("Informe uma sequëncia de caracteres:\n");
        String userContent = reader.nextLine();

        System.out.print("Informe a posição de  sequëncia de caracteres (ex: de 0 a " + (userContent.length() - 1) + ")");
        int c = reader.nextInt();

        for (int i = 0; i < userContent.length(); i++) {
            char singleLetter = userContent.charAt(i);
            mainStack.inserir(String.valueOf(singleLetter));
        }

        for (int i = mainStack.tamanho() -1; i >= 0; i--) {
            String singleLetter = mainStack.remover();
            if (i == c) continue;
            subStack.inserir(singleLetter);
        }

        String content = "";
        while (!subStack.vazia()) {
            content = content + subStack.remover();
        }

        System.out.print("A string depois da remoção: " + content + ")");
    }
}
