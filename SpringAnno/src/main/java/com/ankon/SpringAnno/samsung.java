/**
 * 
 */
package com.ankon.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ankon mukherjee
 *
 */
public class samsung {
	@Autowired
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
