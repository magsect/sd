package api.catraca.model;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Document
public class CatracaEntity implements Serializable {
	
	private int Id;
	private String dtEnter;
	private String dtLeft;
	private int funcID;
	private int catracaID;
	private int rollNumber;
	

	public CatracaEntity(int id, String dtEnter, String dtLeft, int funcID, int catracaID) {
		super();
		//construtor
		this.Id = id;
		this.dtEnter = dtEnter;
		this.dtLeft = dtLeft;
		this.funcID = funcID;
		this.catracaID = catracaID;
	}
	public String getDtEnter() {
		return dtEnter;
	}

	public void setDtEnter(String dtEnter) {
		this.dtEnter = dtEnter;
	}

	public String getDtLeft() {
		return dtLeft;
	}

	public void setDtLeft(String dtLeft) {
		this.dtLeft = dtLeft;
	}

	public int getFuncID() {
		return funcID;
	}

	public void setFuncID(int funcID) {
		this.funcID = funcID;
	}

	public int getCatracaID() {
		return catracaID;
	}

	public void setCatracaID(int catracaID) {
		this.catracaID = catracaID;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setId(int id) {
		this.Id = id;
	}


}