package api.catraca.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@Document
public class CrachaEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int CrachaID;

	
	public CrachaEntity(int crachaID) {
		super();
		//contrutor
		CrachaID = crachaID;
	}

	public int getCrachaID() {
		//return CrachaID;
		return 0;
	}

	public void setCrachaID(int crachaID) {
		CrachaID = crachaID;
	}

	
	
}
