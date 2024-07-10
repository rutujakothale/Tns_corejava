package multilevelinheritence;

public class City extends State {
	private String cityName;
	private float area;
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName=cityName;
	}
	
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area=area;
	}
	
	@Override
	public String toString() {
		return " City [ city name="+cityName+" ,area="+area+" ,getStatename="+getStateName()+" ,get language="+getLanguage()+
				" ,get country="+getCountryName()+" ,get Capital="+getCapital()+"]";
	}

}
