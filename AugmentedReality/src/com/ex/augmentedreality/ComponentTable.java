package com.ex.augmentedreality;

public class ComponentTable {

	private String id; 
	private String SFI;
	private String manufacturer;
	private String LastFix;
	private String FixType;

	public ComponentTable() {
	}

	public ComponentTable(String id, String SFI, String manufacturer,
			String LastFix, String FixType) {
		super();
		this.id = id;
		this.SFI = SFI;
		this.manufacturer = manufacturer;
		this.LastFix = LastFix;
		this.FixType = FixType;
	}

	@Override
	public String toString() {
		return "Component [Id =" + id + ", Manufacturer =" + manufacturer + ", SFI =" + SFI
				+ ",  D.O. Last Fix =" + LastFix + ", Fix Type=" + FixType + "]";
	}

	public String getId() {
		return id;
	}

	public String getSFI() {
		return SFI;
	}

	public String getManufacturer() {
		// TODO Auto-generated method stub
		return manufacturer;
	}

	public String getLastFix() {
		// TODO Auto-generated method stub
		return LastFix;
	}

	public String getFixType() {
		// TODO Auto-generated method stub
		return FixType;
	}

	public void setId(String string) {
		// TODO Auto-generated method stub
		id = string;
	}

	public void setSFI(String string) {
		// TODO Auto-generated method stub
		SFI = string;
	}

	public void setManufacturer(String string) {
		// TODO Auto-generated method stub
		manufacturer = string;
	}

	public void setLastFix(String string) {
		// TODO Auto-generated method stub
		LastFix = string;
	}

	public void setFixType(String string) {
		// TODO Auto-generated method stub
		FixType = string;
	}

}
