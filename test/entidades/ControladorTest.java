package entidades;

import excecoes.LivroExistenteException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.NumberUp;
import java.util.IllformedLocaleException;

import static org.junit.jupiter.api.Assertions.*;

class ControladorTest extends Controlador {
    Controlador ct = new Controlador();

    @BeforeEach
    public void preparar() throws LivroExistenteException {
        ct.adicioanrLivro("duna", "jjk");
        ct.adicioanrLivro("diva", "anita");
    }

    @Test
    public void AdiconarLivro() {
        try {
            assertEquals("Harry Potter", ct.adicioanrLivro("Harry Potter", "jjk"));
        }
        catch (LivroExistenteException e){
            fail();
        }

        try{
           ct.adicioanrLivro("duna", "jjk");

        }
        catch (LivroExistenteException e){
            assertTrue(true);
        }

    }

    @Test
    public void excluirLivro(){
        assertEquals("duna",ct.excluirLivro("duna", "jjk"));
        try{
            ct.excluirLivro("harry", "jackson");
            fail();
        }catch (IllegalArgumentException e){
            assertTrue(true);
        }
    }
}