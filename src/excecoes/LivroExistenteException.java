package excecoes;

/**
 * Exceção lançada quando o livro adicionado ja existe no sistema
 */
public class LivroExistenteException extends Exception{

    public LivroExistenteException() {
       super("O LIVRO JA EXISTE");
    }
}
