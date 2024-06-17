package entidades;

import java.util.Arrays;
import java.util.Objects;

public class Livro {
    private String nome;
    private String autor;
    private String[] generos;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
        this.generos = new String[3];
    }

    public Livro(String nome, String autor, String[] generos) {
        this.nome = nome;
        this.autor = autor;
        this.generos = generos;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String[] getGeneros() {
        return generos;
    }

    public boolean hasGenero(String genero){
        for(String s : this.generos){
            if(genero.equals(s)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return nome + "\n" + "Autor: " + autor + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return this.nome.equals(livro.nome) && this.autor.equals(livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, autor, Arrays.hashCode(generos));
    }
}
