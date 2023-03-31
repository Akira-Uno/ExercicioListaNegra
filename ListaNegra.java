package Lista;

public class ListaNegra {
	private Pessoa[]  p;
	private int tamanho; 
	
	public ListaNegra(){
		
	}

	public ListaNegra(Pessoa[] p, int tamanho) {
		super();
		this.p = p;
		this.tamanho = tamanho;
	}
	public void quantVetor(int quant) {
		p = new Pessoa [quant];
		
	}
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void add(Pessoa pa) {
		
		 for(int i =0;i < p.length;i++) {
			 if(p != null) {
				 p[tamanho] = pa;
				 tamanho++;
				 break;
				 
			 }
		 }
		
	}
	public void remover (Pessoa p) {
		for(int i = 0; i< this.p.length;i++) {
			if(this.p[i] != null) {
				if(this.p[i].equals(p)) {
					this.p[i] = null;
					break;
				}
			}
		}
	}
	
public void exibir() {
	for(Pessoa a:p) {
		if(a != null) {
			System.out.println(a.getNome() + " " + a.getMotivo() + " " + a.getData());
		}
	}
}

	
}

