package Lista;

import java.util.Date;

public class Pessoa {
	private String nome;
	private String motivo;
	private Date data;
	
	Pessoa(){
		
		
		
	}

	public Pessoa(String nome, String motivo, Date data) {
		super();
		this.nome = nome;
		this.motivo = motivo;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	
	public String exibirNome() {
		return "Pessoa [nome=" + nome + ", motivo=" + motivo + ", data=" + data + "]";
	}
	
	
	
	
}
