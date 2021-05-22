package com.codixlabs.di;

import org.springframework.stereotype.Component;

@Component
public class Machine {

	String machineName = "Machine 2";
	String machineVersion = "Version 1";
	
	public String getMachineName() {
		return machineName;
	}
	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}
	public String getMachineVersion() {
		return machineVersion;
	}
	public void setMachineVersion(String machineVersion) {
		this.machineVersion = machineVersion;
	}
	
	Machine(){
		
	}
	
}
