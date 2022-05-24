package model;

import java.time.LocalDate;

public class Residente {

	@Id
	@JoinColumn (name= "medico_crm")
	@NotNull
	private String medicoCRM;
	
	
	@JoinColumn (name= "instituicao_ensino")
	@NotNull
	private String instituicaoEnsino;
	
	@JoinColumn (name= "ano_ingresso")
	@NotNull
	private LocalDate anoIngresso;
	
	public String getInstituicaoEnsino() {
		return instituicaoEnsino;
	}
	public void setInstituicaoEnsino(String instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}
	public LocalDate getAnoIngresso() {
		return anoIngresso;
	}
	public void setAnoIngresso(LocalDate anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	
	@Override
	public String toString() {
		return "Residente [medicoCRM=" + medicoCRM + ", instituicaoEnsino=" + instituicaoEnsino + ", anoIngresso="
				+ anoIngresso + "]";
	
	
	}
	
}
