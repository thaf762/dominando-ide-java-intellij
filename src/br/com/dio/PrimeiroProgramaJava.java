package br.com.dio;

import br.com.dio.model.Gata;

public class PrimeiroProgramaJava {
    public static void main(String[] args) {
        Gata gato = new Gata();

        System.out.println(gato);

        Livro livro1 = new Livro(nome"O problema dos 3 corpos", numPaginas 300);
        System.out.println(livro1);
        /*int a = 5;
        int b = 10;
        System.out.println("Hello World! " + (a+b));*/

    }
    /* Teclas de Atalho
    Shift + F6 = Refactorar (renomear Pojeto ou ite selecionado)
    Ctrl + D  =  Duplicar linha
    Ctrl + Y  =  Exclui linha Inteira
    Alt + Insert = Criar novas Classe, Construtores, Getters and Setters, to Srting
    Ctrl + Shift + Seta p/ CIMA ou p/ BAIXO = Move Linha inteira de código
     */
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
