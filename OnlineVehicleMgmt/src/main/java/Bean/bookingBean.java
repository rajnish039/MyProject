package Bean;

public class bookingBean {
     
	private int bookingid;
	private UserRegBean userRegBean;
	private VehicleBean vehicleBean;
	private String b_date;
	private String p_date;
	private String s_address;
	private String d_address;
	private String b_purpose;
	private String distance;
	
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public UserRegBean getUserRegBean() {
		return userRegBean;
	}
	public void setUserRegBean(UserRegBean userRegBean) {
		this.userRegBean = userRegBean;
	}
	public VehicleBean getVehicleBean() {
		return vehicleBean;
	}
	public void setVehicleBean(VehicleBean vehicleBean) {
		this.vehicleBean = vehicleBean;
	}
	public String getB_date() {
		return b_date;
	}
	public void setB_date(String b_date) {
		this.b_date = b_date;
	}
	public String getP_date() {
		return p_date;
	}
	public void setP_date(String p_date) {
		this.p_date = p_date;
	}
	public String getS_address() {
		return s_address;
	}
	public void setS_address(String s_address) {
		this.s_address = s_address;
	}
	public String getD_address() {
		return d_address;
	}
	public void setD_address(String d_address) {
		this.d_address = d_address;
	}
	public String getB_purpose() {
		return b_purpose;
	}
	public void setB_purpose(String b_purpose) {
		this.b_purpose = b_purpose;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
}
