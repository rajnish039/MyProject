package Bean;

/**
 * @author Rajnish
 * @date 27/09/2015
 */
public class VehicleBean {

	private int vehicleid;
	private String vtype;
	private String vmodel;
	private String vclass;
	private int vcapicity;
	private String vehicleno;
	private String vpaperpath;
	private String vimagepath;
	private VownerRegBean vownerRegBean;       // m to 1 with vowner
	private UserRegBean userRegBean;          // m to 1 with user or customer
	private FareBean fareBean;               // m to m with fare
	
	public int getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	public String getVtype() {
		return vtype;
	}
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}
	public String getVmodel() {
		return vmodel;
	}
	public void setVmodel(String vmodel) {
		this.vmodel = vmodel;
	}
	public String getVclass() {
		return vclass;
	}
	public void setVclass(String vclass) {
		this.vclass = vclass;
	}
	public int getVcapicity() {
		return vcapicity;
	}
	public void setVcapicity(int vcapicity) {
		this.vcapicity = vcapicity;
	}
	public String getVehicleno() {
		return vehicleno;
	}
	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}
	public String getVpaperpath() {
		return vpaperpath;
	}
	public void setVpaperpath(String vpaperpath) {
		this.vpaperpath = vpaperpath;
	}
	public String getVimagepath() {
		return vimagepath;
	}
	public void setVimagepath(String vimagepath) {
		this.vimagepath = vimagepath;
	}
	public VownerRegBean getVownerRegBean() {
		return vownerRegBean;
	}
	public void setVownerRegBean(VownerRegBean vownerRegBean) {
		this.vownerRegBean = vownerRegBean;
	}
	public UserRegBean getUserRegBean() {
		return userRegBean;
	}
	public void setUserRegBean(UserRegBean userRegBean) {
		this.userRegBean = userRegBean;
	}
	public FareBean getFareBean() {
		return fareBean;
	}
	public void setFareBean(FareBean fareBean) {
		this.fareBean = fareBean;
	}
	
}
