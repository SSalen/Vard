package com.ex.augmentedreality;

public class ComponentTable {

	private String id; 
	private String componentInfo;
	private String graph;
	private String warnings;
	private String alarms;

	public ComponentTable() {
	}

	public ComponentTable(String id, String componentInfo, String graph,
			String warnings, String alarms) {
		super();
		this.id = id;
		this.componentInfo = componentInfo;
		this.graph = graph;
		this.warnings = warnings;
		this.alarms = alarms;
	}

	@Override
	public String toString() {
		return "Component [id=" + id + ", componentInfo=" + componentInfo
				+ ", graphs=" + graph + ", warnings=" + warnings + ", alarms="
				+ alarms + "]";
	}

	public String getId() {
		return id;
	}

	public String getComponentinfo() {
		return componentInfo;
	}

	public String getGraph() {
		// TODO Auto-generated method stub
		return graph;
	}

	public String getWarnings() {
		// TODO Auto-generated method stub
		return warnings;
	}

	public String getAlarms() {
		// TODO Auto-generated method stub
		return alarms;
	}

	public void setId(String string) {
		// TODO Auto-generated method stub

	}

	public void setComponentinfo(String string) {
		// TODO Auto-generated method stub

	}

	public void setGraph(String string) {
		// TODO Auto-generated method stub

	}

	public void setWarnings(String string) {
		// TODO Auto-generated method stub

	}

	public void setAlarms(String string) {
		// TODO Auto-generated method stub

	}

}
