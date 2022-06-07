package br.edu.cest;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

/**
 * At-1!
 *
 * Escreva um programa solicite ao usuário uma sequência de caracteres sem limite de
 * máximo de tamanho e realize as seguintes operações usando uma pilha:
 * a) Imprimir o texto na ordem inversa;
 * b) Verificar se o texto é um palíndromo, ou seja, se a string é escrita da mesma maneira de frente para trás
 * e de trás para frente. Ignore espaços e pontos.
 */
public class App 
{
    public static void main( String[] args )
    {
        Stack<String> mainStack = new Stack<>();
        Scanner reader = new Scanner(System.in);

        System.out.print("Informe uma sequëncia de caracteres:\n");
        String userContent = reader.nextLine();

        for (int i = 0; i < userContent.length(); i++) {
            char singleLetter = userContent.charAt(i);
            if (singleLetter == '.' || singleLetter == ' ') {
                continue;
            }
            mainStack.push(String.valueOf(userContent.charAt(i)));
        }

        // Imprimir em ordem inverssa

        String contentForComparateOrderAsc = "";
        String contentForComparateOrderDesc = "";

        while(!mainStack.empty()) {
            String letter = mainStack.pop();
            contentForComparateOrderAsc += letter.toLowerCase(Locale.ROOT);
            contentForComparateOrderDesc = letter.toLowerCase(Locale.ROOT) + contentForComparateOrderDesc;
        }

        System.out.println("Imprimindo em order inversa");
        System.out.println(contentForComparateOrderAsc);

        if (contentForComparateOrderAsc.equals(contentForComparateOrderDesc)) {
            System.out.println("A frase digitada é um palindromo");
            return;
        }

        System.out.println("A frase digitada não é palindromo");
    }
}
