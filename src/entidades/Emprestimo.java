package entidades;

import java.util.Objects;

public class Emprestimo {
    private String nomeUsuario;
    private Livro livro;

    public Emprestimo(String nomeUsuario, Livro livro) {
        this.nomeUsuario = nomeUsuario;
        this.livro = livro;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public Livro getLivro() {
        return livro;
    }

    @Override
    public String toString() {
        return "Emprestimo:\n" + "Nome: " + this.nomeUsuario
                + "Livro: " + this.livro.getNome();
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeUsuario, livro);
    }
}
