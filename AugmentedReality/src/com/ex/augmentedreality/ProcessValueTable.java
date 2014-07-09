package com.ex.augmentedreality;

public class ProcessValueTable {
	
	private String id;
	private float temperature;
	private float pressure;
	private float rpm;
	private float torque;
	private float oil_level;
	
	public ProcessValueTable(){}
	
	public ProcessValueTable(String id, float temperature, float pressure, float rpm, float torque, float oil_level) {
		super();
		this.id = id;
		this.temperature = temperature;
		this.pressure = pressure;
		this.rpm = rpm;
		this.torque = torque;
		this.oil_level = oil_level;
	}
	
	@Override
	public String toString() {
		return "Process values: \n Id = " + id + "\n Temp.[*C] = " + temperature + "\n Pressure[bar] = " + pressure + "\n RPM = " + rpm
				+ "\n Torque[Nm] = " + torque + "\n Oil level[%] = " + oil_level;
	}

	public String getTemperature() {
		// TODO Auto-generated method stub
		return String.valueOf(temperature);
	}

	public String getPressure() {
		// TODO Auto-generated method stub
		return String.valueOf(pressure);
	}

	public String getRPM() {
		// TODO Auto-generated method stub
		return String.valueOf(rpm);
	}

	public String getTorque() {
		// TODO Auto-generated method stub
		return String.valueOf(torque);
	}

	public String getOil_Level() {
		// TODO Auto-generated method stub
		return String.valueOf(oil_level);
	}

	
	public void setId(String id_string) {
		// TODO Auto-generated method stub
		id = id_string;
	}


	public void setTemperature(float parseFloat) {
		// TODO Auto-generated method stub
		temperature = parseFloat;
	}

	public void setPressure(float parseFloat) {
		// TODO Auto-generated method stub
		pressure = parseFloat;
	}

	public void setRPM(float parseFloat) {
		// TODO Auto-generated method stub
		rpm = parseFloat;
	}

	public void setTorque(float parseFloat) {
		// TODO Auto-generated method stub
		torque = parseFloat;
	}

	public void setOil_Level(float parseFloat) {
		// TODO Auto-generated method stub
		oil_level = parseFloat;
	}
	

}
