package model;

/**
 * Cameron Mockobee - cmockobee1@dmacc.edu
 * CIS175 - Fall 2023
 * Sep 4, 2023
 */
public class Currency {
	private String name;
	private double amt;
	
	/**
	 * 
	 */
	public Currency() {
	}
	/**
	 * @param string 
	 * 
	 */
	public Currency(String name) {
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the amt
	 */
	public double getAmt() {
		return amt;
	}
	/**
	 * @param amt the amt to set
	 */
	public void setAmt(double amt) {
		this.amt = amt;
	}
}
	

