package programa;

public  class Menu {
    public static void menuInicialDeOpcoes(){
        System.out.println("Bem Vindo(a) \n " +
                "1 - Adicionar novo Livro" +
                "2 - Excluir livro existente" +
                "3 - Listar todos os livro" +
                "4 - Listar livros por gênero" +
                "5 - Listar livros por autor" +
                "9 - sair");
    }

    public static void menuSolicitarNomeLivro(){
        System.out.println("Digite o nome do livro: ");
    }

    public static void menuSolicitarAutorLivro(){
        System.out.println("Digite o nome do autor: ");
    }

    public static void menuSolicitarNomeDoGeneroLivro(){
        System.out.println("Digite o(os) genero(os) do livro");
    }

    public static void menuPerguntarSeDesejaAdiconarGeneros(){
        System.out.println("Deseja adicionar os generos do livro?(sim(s), nao(n)");
    }
}
