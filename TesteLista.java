package Lista;

import java.util.Date;

public class TesteLista {
	 public static void main(String[] args) {

		 	ListaNegra l = new ListaNegra();
		 	l.quantVetor(6);
		 	Pessoa p = new Pessoa("Jose", "aaaa", new Date());
		 	l.add(p);
		 	Pessoa p1 = new Pessoa("Jose v", "aaaa", new Date());
		 	l.add(p1);
		 	Pessoa p2 = new Pessoa("v", "aaaa", new Date());
		 	l.add(p2);	
		 	l.exibir();
		 	l.remover(p1);
		 	System.out.println();
		 	l.exibir();
		 	System.out.println();
		 	
	}
}
