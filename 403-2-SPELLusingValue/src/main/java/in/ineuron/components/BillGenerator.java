package in.ineuron.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("bill")
public class BillGenerator {
	
	@Autowired
	private ItemsInfo info;
	
	@Value("#{info.idli+info.vada+info.samosa}")
	private int billAmt;
	
	@Value("OYO ROOMS")
	private String hotelName;


	@Override
	public String toString() {
		return "BillGenerator [billAmt=" + billAmt + ", hotelName=" + hotelName + ", info=" + info + "]";
	}

	public int getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(int billAmt) {
		this.billAmt = billAmt;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public ItemsInfo getInfo() {
		return info;
	}

	public void setInfo(ItemsInfo info) {
		this.info = info;
	}


	
	
}
