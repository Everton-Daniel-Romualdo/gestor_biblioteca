package entidades;

import java.util.ArrayList;
import excecoes.LivroExistenteException;

public class Controlador {
     private ArrayList<Livro> livros;
     private ArrayList<Emprestimo> emprestimos;
     private ArrayList<Emprestimo> historicoDevolucoes;

    /**
     * Verifica se um livro existe ou não no sistema
     * @param livro O proprio Objeto livro
     * @return Se encontrou ou não (true or false);
     */
    private boolean verificarExistenciaLivro(Livro livro){
        for(Livro l : livros){
            if(l.equals(livro)){
                return true;
            }
        }
        return false;
    }

    /**
     * Verifica se o livro é iqual a um existente se for retorna o indice senão retorna -1
     * @param nome nome do livro
     * @param autor nome do autor
     * @return o indice ou -1
     */
    private int encontrarLivro(String nome, String autor){
        Livro aux = new Livro(nome, autor);
        for(int i = 0; i < this.livros.size();i++){
            if(this.livros.get(i).equals(aux)){
                return i;
            }
        }
        return -1;
    }

    public Controlador() {
        this.livros = new ArrayList<Livro>();
        this.emprestimos = new ArrayList<Emprestimo>();
        this.historicoDevolucoes = new ArrayList<Emprestimo>();
    }

    public Controlador(ArrayList<Livro> livros) {
        this.livros = livros;
        this.emprestimos = new ArrayList<Emprestimo>();
        this.historicoDevolucoes = new ArrayList<Emprestimo>();
    }

    public String adicioanrLivro(String nome, String autor) throws LivroExistenteException{
        Livro l = new Livro(nome, autor);
        if(verificarExistenciaLivro(l)){
            throw new LivroExistenteException();
        }

        this.livros.add(l);
        return l.getNome();
    }

    public String excluirLivro(String nome, String autor){
        int i = encontrarLivro(nome, autor);
        if(i < 0){
            throw  new IllegalArgumentException("Livro não existe");
        }else{
            this.livros.remove(i);
            return nome;
        }
    }

    public String adionarGenero(String nome, String autor, String genero){
        int i = encontrarLivro(nome, autor);
        if(i < 0){
            throw new IllegalArgumentException("LIVRO NÃO EXISTE");
        }
        this.livros.get(i).adicionarGenero(genero);
        return genero;
    }
}
