package Bean;

import java.util.List;

/**
 * @author Rajnish
 * @date 27/09/2015
 */
public class VownerRegBean {
     
	private int vowner_id;
	private String vfirst_name;
	private String vmiddle_name;
	private String vlast_name;
	private String vemail;
	private String vmobileno;
	private String vpassword;
	private String vidprooftype;
	private String vidproofno;
	private String vaddress;
	private CountryBean countryBean;
	private StateBean stateBean;
	private CityBean cityBean;
	private int vpincode;
	private List vehicleList;
	
	public int getVowner_id() {
		return vowner_id;
	}
	public void setVowner_id(int vowner_id) {
		this.vowner_id = vowner_id;
	}
	public String getVfirst_name() {
		return vfirst_name;
	}
	public void setVfirst_name(String vfirst_name) {
		this.vfirst_name = vfirst_name;
	}
	public String getVmiddle_name() {
		return vmiddle_name;
	}
	public void setVmiddle_name(String vmiddle_name) {
		this.vmiddle_name = vmiddle_name;
	}
	public String getVlast_name() {
		return vlast_name;
	}
	public void setVlast_name(String vlast_name) {
		this.vlast_name = vlast_name;
	}
	public String getVemail() {
		return vemail;
	}
	public void setVemail(String vemail) {
		this.vemail = vemail;
	}
	public String getVmobileno() {
		return vmobileno;
	}
	public void setVmobileno(String vmobileno) {
		this.vmobileno = vmobileno;
	}
	public String getVpassword() {
		return vpassword;
	}
	public void setVpassword(String vpassword) {
		this.vpassword = vpassword;
	}
	public String getVidprooftype() {
		return vidprooftype;
	}
	public void setVidprooftype(String vidprooftype) {
		this.vidprooftype = vidprooftype;
	}
	public String getVidproofno() {
		return vidproofno;
	}
	public void setVidproofno(String vidproofno) {
		this.vidproofno = vidproofno;
	}
	public String getVaddress() {
		return vaddress;
	}
	public void setVaddress(String vaddress) {
		this.vaddress = vaddress;
	}
	public CountryBean getCountryBean() {
		return countryBean;
	}
	public void setCountryBean(CountryBean countryBean) {
		this.countryBean = countryBean;
	}
	public StateBean getStateBean() {
		return stateBean;
	}
	public void setStateBean(StateBean stateBean) {
		this.stateBean = stateBean;
	}
	public CityBean getCityBean() {
		return cityBean;
	}
	public void setCityBean(CityBean cityBean) {
		this.cityBean = cityBean;
	}
	public int getVpincode() {
		return vpincode;
	}
	public void setVpincode(int vpincode) {
		this.vpincode = vpincode;
	}
	public List getVehicleList() {
		return vehicleList;
	}
	public void setVehicleList(List vehicleList) {
		this.vehicleList = vehicleList;
	}
	
}
