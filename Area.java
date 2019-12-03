package cn.sfturing.entity;

public class Area {
	private String provinceName ;
	private String cityName;
	private int cityCode;
	private  String countryName ;
	private  int coutryCode;

	public void setProvinceName(String provinceName){
		provinceName = this.provinceName;
	}

	public String getProvinceName(  ){
		return provinceName;
	}

	public void  setCityName(String cityName   ){
		cityName = this.cityName;
	}

	public String getCityName(){
		return  cityName;
	}

	public void setCityCode(int cityCode){
		cityCode = this.cityCode;
	}

	public int getCityCode(){
		return cityCode;
	}

	public void setCountryName(String countryName){
		countryName = this.countryName;
	}

	public String getCountryName(){
		return countryName;
	}

	public void setCoutryCode(int coutryCode){
		coutryCode = this.coutryCode;
	}

	public int getCoutryCode(){
		return coutryCode;
	}
}

