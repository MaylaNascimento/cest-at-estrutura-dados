package br.edu.cest.utils;

public class Fila<T> {
    private T[] a;
    private int N;

    // construtor
    public Fila() {
        a = (T[]) new Object[2];
        N = 0;
    }

    // a pilha mora em a[0..N-1]

    public boolean estaVazia() {
        return N == 0;
    }

    public void inserir(T item) {
        if (N == a.length)
            aumentar(2 * a.length);
        a[N++] = item;
    }

    public T remover() {
        T item = a[--N];
        if (N > 0 && N == a.length/4)
            aumentar(a.length/2);
        return item;
    }

    private void aumentar(int max) {
        T[] temp;
        temp = (T[]) new Object[max];
        for (int i = 0; i < N; i++)
            temp[i] = a[i];
        a = temp;
    }

    public int tamanho() {
       return N;
    }

    public boolean vazia() {
        return tamanho() == 0;
    }
}
