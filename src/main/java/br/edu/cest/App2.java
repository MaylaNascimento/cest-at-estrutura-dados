package br.edu.cest;

import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

/**
 * At-2!
 *
 * Utilizando somente operações de empilhar e desempilhar, escreva um programa que
 * remove um item com chave c fornecida pelo usuário da pilha. Ao final da execução da função, a pilha deve
 * ser igual à original, exceto pela ausência do item removido.
 */
public class App2
{
    public static void main( String[] args )
    {
        Stack<String> mainStack = new Stack<>();
        Stack<String> subStack = new Stack<>();
        Scanner reader = new Scanner(System.in);

        System.out.print("Informe uma sequëncia de caracteres:\n");
        String userContent = reader.nextLine();

        System.out.print("Informe a posição de  sequëncia de caracteres (ex: de 0 a " + (userContent.length() - 1) + ")");
        int c = reader.nextInt();

        for (int i = 0; i < userContent.length(); i++) {
            char singleLetter = userContent.charAt(i);
            mainStack.push(String.valueOf(singleLetter));
        }

        for (int i = mainStack.size() -1; i >= 0; i--) {
            String singleLetter = mainStack.pop();
            if (i == c) continue;
            subStack.push(singleLetter);
        }

        String content = "";
        while (!subStack.empty()) {
            content = content + subStack.pop();
        }

        System.out.print("A string depois da remoção: " + content + ")");
    }
}
