package entities;

public class PessoaFisica extends Pessoa{
	
	private Double gastosComSaude;

	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}
	
	//Getters and setters:
	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	//Métodos:
	
	@Override
	public Double calcImposto() {
		Double valorLiquido;
		if(getRendaAnual() < 20000.00) {
			valorLiquido = getRendaAnual() - (getRendaAnual() * 0.15) + (gastosComSaude * 0.5);
		}else {
			valorLiquido = getRendaAnual() - (getRendaAnual() * 0.25) + (gastosComSaude * 0.5);
		}
		return valorLiquido;
	}
}
