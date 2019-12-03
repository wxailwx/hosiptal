package cn.sfturing.entity;

/**
 * 
 * @author sfturing
 *
 * @date 2017年4月29日
 */
public class Hospital {
	private String HID;
	private  String hos_name;
	private String city;
	private  String introduction;
	private String level;
	private  String address;

	public void setHID(String HID) {
		this.HID = HID;
	}

	public String getHID() {
		return HID;
	}

	public void setHos_name(String hos_name) {
		this.hos_name = hos_name;
	}

	public String getHos_name() {
		return hos_name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getLevel() {
		return level;
	}
}
