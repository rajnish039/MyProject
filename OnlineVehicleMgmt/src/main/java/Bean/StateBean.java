package Bean;

import java.util.List;

/**
 * @author Rajnish
 * @date 27-09-2015
 */
public class StateBean {
	
    private int stateid;
    private CountryBean countryBean;    // M to 1 with country & 
    private String sname;
    private List cityList;    // 1 to M with city
    
	public int getStateid() {
		return stateid;
	}
	public void setStateid(int stateid) {
		this.stateid = stateid;
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public CountryBean getCountryBean() {
		return countryBean;
	}
	public void setCountryBean(CountryBean countryBean) {
		this.countryBean = countryBean;
	}
	public List getCityList() {
		return cityList;
	}
	public void setCityList(List cityList) {
		this.cityList = cityList;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stateid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StateBean other = (StateBean) obj;
		if (stateid != other.stateid)
			return false;
		return true;
	}
    
    
}
