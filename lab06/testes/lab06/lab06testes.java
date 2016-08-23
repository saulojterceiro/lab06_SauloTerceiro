package lab06;

import static org.junit.Assert.*;
import lab06.Jogo;

import org.junit.Test;

public class lab06testes {
	
	@Test
	public void test() throws Exception {
		Jogo jogo = new Jogo("LOL",20.0,"MOBA");
	    assertEquals("Nome do jogo está errado","LOL",jogo.getNome()); 
	    jogo.registraJogada(20, true);
	    assertEquals("Zerada está errada",1,jogo.getZerou());
	    assertEquals("Score está errada",20,jogo.getScore());
	    jogo.registraJogada(19, true);
	    assertEquals("Zerada está errada",2,jogo.getZerou());
	    assertEquals("Score está errada",20,jogo.getScore());
	    jogo.registraJogada(21, true);
	    assertEquals("Zerada está errada",3,jogo.getZerou());
	    assertEquals("Score está errada",21,jogo.getScore());
	    jogo.registraJogada(21, false);
	    assertEquals("Zerada está errada",3,jogo.getZerou());
	    assertEquals("Score está errada",21,jogo.getScore());
	    try {
	    	Jogo jogo2 = new Jogo("LOL",-1,"MOBA");
	    	fail("saulo");
	    } catch(Exception exp){
	        assertEquals("Mensagem de excecao capturada.","saulo", exp.getMessage());
	    }
	}
	

	
}
