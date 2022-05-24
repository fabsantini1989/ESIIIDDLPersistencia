package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe_medico")
public class BebeMedico {

	@Id
	@JoinColumn(name = "id_bebe_bebe")
	@NotNull
	private int idBebeBebe;
	
	@Id
	@JoinColumn(name = "medico_crm")
	@NotNull
	private String MedicoCrm;
	
	public int getIdBebeBebe() {
		return idBebeBebe;
	}
	public void setIdBebeBebe(int idBebeBebe) {
		this.idBebeBebe = idBebeBebe;
	}
	public String getMedicoCrm() {
		return MedicoCrm;
	}
	public void setMedicoCrm(String medicoCrm) {
		MedicoCrm = medicoCrm;
	}
	@Override
	public String toString() {
		return "BebeMedico [idBebeBebe=" + idBebeBebe + ", MedicoCrm=" + MedicoCrm + "]";
	}

	
	

}
