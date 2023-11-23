package in.ineuron.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "info")
public class ItemsInfo {
	
	
	@Value("${item.idli.price}")
	public int idli;
	
	
	@Value("${item.vada.price}")
	public int vada;
	
	
	@Value("${item.samosa.price}")
	public int samosa;


	public ItemsInfo(int idli, int vada, int samosa) {
		super();
		this.idli = idli;
		this.vada = vada;
		this.samosa = samosa;
	}


	public int getIdli() {
		return idli;
	}


	public void setIdli(int idli) {
		this.idli = idli;
	}


	public int getVada() {
		return vada;
	}


	public void setVada(int vada) {
		this.vada = vada;
	}


	public int getSamosa() {
		return samosa;
	}


	public void setSamosa(int samosa) {
		this.samosa = samosa;
	}


	@Override
	public String toString() {
		return "ItemsInfo [idli=" + idli + ", vada=" + vada + ", samosa=" + samosa + "]";
	}
	
	
	
	
	
	

}
