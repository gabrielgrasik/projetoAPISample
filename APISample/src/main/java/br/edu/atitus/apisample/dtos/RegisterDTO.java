package br.edu.atitus.apisample.dtos;

public class RegisterDTO {

	private double latitude;
	private double longetude;
	private String description;
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongetude() {
		return longetude;
	}
	public void setLongetude(double longetude) {
		this.longetude = longetude;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
