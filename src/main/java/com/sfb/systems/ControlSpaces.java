package com.sfb.systems;

import java.util.Map;

public class ControlSpaces {
	private int bridge;
	private int flag;
	private int emer;
	private int auxcon;
	private int security;
	
	private int availableBridge;
	private int availableFlag;
	private int availableEmer;
	private int availableAuxcon;
	private int availableSecurity;
	
	public ControlSpaces() {}
	
	// Given a map of <String, Integer> set the initial values for all control boxes.
	// Acceptable keys for the map are: bridge, flag, emer, auxcon, security
	public void init(Map<String, Integer> values) {
		// If map has matching value, get it. Otherwise set to 0.
		availableBridge   = bridge   = values.get("bridge")   == null ? 0 : values.get("bridge");
		availableFlag     = flag     = values.get("flag")     == null ? 0 : values.get("flag");
		availableEmer     = emer     = values.get("emer")     == null ? 0 : values.get("emer");
		availableAuxcon   = auxcon   = values.get("auxcon")   == null ? 0 : values.get("auxcon");
		availableSecurity = security = values.get("security") == null ? 0 : values.get("security");
	}
	
	////// VALUE CALLS /////////
	public int getAvailableBridge() {
		return this.availableBridge;
	}
	
	public int getAvailableFlag() {
		return this.availableFlag;
	}
	
	public int getAvailableEmer() {
		return this.availableEmer;
	}
	
	public int getAvailableAuxcon() {
		return this.availableAuxcon;
	}
	
	public int getAvailableSecurity() {
		return this.availableSecurity;
	}
	
	////// DAMAGE CALLS ///////
	public boolean damageBridge() {
		if (availableBridge == 0) {
			return false;
		}
		
		availableBridge--;
		return true;
	}
	
	public boolean damageFlag() {
		if (availableFlag == 0) {
			return false;
		}
		
		availableFlag--;
		return true;
	}
	
	public boolean damageEmer() {
		if (availableEmer == 0) {
			return false;
		}
		
		availableEmer--;
		return true;
	}
	
	public boolean damageAuxcon() {
		if (availableAuxcon == 0) {
			return false;
		}
		
		availableAuxcon--;
		return true;
	}
	
	public boolean damageSecurity() {
		if (availableSecurity == 0) {
			return false;
		}
		
		availableSecurity--;
		return true;
	}
	
	///// REPAIR CALLS /////
	public boolean repairBridge(int amount) {
		if (availableBridge + amount > bridge) {
			return false;
		}
		
		availableBridge += amount;
		return true;
	}
	
	public boolean repairFlag(int amount) {
		if (availableFlag + amount > flag) {
			return false;
		}
		
		availableFlag += amount;
		return true;
	}
	
	public boolean repairEmer(int amount) {
		if (availableEmer + amount > emer) {
			return false;
		}
		
		availableEmer += amount;
		return true;
	}
	
	public boolean repairAuxcon(int amount) {
		if (availableAuxcon + amount > auxcon) {
			return false;
		}
		
		availableAuxcon += amount;
		return true;
	}
	
	public boolean repairSecurity(int amount) {
		if (availableSecurity + amount > security) {
			return false;
		}
		
		availableSecurity += amount;
		return true;
	}
}
