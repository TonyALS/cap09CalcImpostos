package entities;

public class PessoaJuridica extends Pessoa {
	
	private Integer numFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	//Getters and setters:
	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	//Métodos:
	@Override
	public Double calcImposto() {
		Double valorLiquido;
		if(numFuncionarios > 10) {
			valorLiquido = getRendaAnual() - (getRendaAnual() * 0.14);
		}else {
			valorLiquido = getRendaAnual() - (getRendaAnual() * 0.16);
		}
		return valorLiquido;
	}
}
