/**
 * 
 */
package com.ankon.SpringAnno;

/**
 * @author ankon mukherjee
 *
 */
public class samsung {
	public Mobileprocessor cpu;
	
	public Mobileprocessor getCpu() {
		return cpu;
	}
	public void setCpu(Mobileprocessor cpu) {
		this.cpu = cpu;
	}
	public void config(){
		
		System.out.println("4gb,12mp,octacore");
		cpu.process();
		}

}
