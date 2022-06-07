package br.edu.cest;

import br.edu.cest.utils.Fila;

import java.util.Scanner;
import java.util.Stack;

/**
 * At-3!
 *
 * – Implementar a classe para representação de uma fila convencional. Observar que a
 * mesma deve ter os métodos de inserir, remover, fila_vazia e fila cheia e inicializar a referida fila.
 */
public class App3
{
    public static void main( String[] args )
    {
        Fila<String> mainQueue = new Fila<>();
        Fila<String> subQueue = new Fila<>();
        Scanner reader = new Scanner(System.in);

        System.out.print("Informe uma sequëncia de caracteres:\n");
        String userContent = reader.nextLine();

        System.out.print("Informe a posição de  sequëncia de caracteres (ex: de 0 a " + (userContent.length() - 1) + ")");
        int c = reader.nextInt();

        for (int i = 0; i < userContent.length(); i++) {
            char singleLetter = userContent.charAt(i);
            mainQueue.inserir(String.valueOf(singleLetter));
        }

        for (int i = mainQueue.tamanho(); i > 0; i--) {
            String singleLetter = mainQueue.remover();
            if (i != c)
                subQueue.inserir(singleLetter);
        }

        String content = "";
        while (!subQueue.estaVazia()) {
            content = content + subQueue.remover();
        }

        System.out.print("A string depois da remoção: " + content + ")");
    }
}
