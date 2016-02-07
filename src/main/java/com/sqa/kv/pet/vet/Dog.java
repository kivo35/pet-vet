/**
 * 
 */
package com.sqa.kv.pet.vet;

/**
 * @author Kirill
 * 
 */
public class Dog extends Mammal
{
	private boolean performsAtShows;
	private boolean wolfBreed;
	private String serviceType;
	public boolean isPerformsAtShows()
	{
		return performsAtShows;
	}
	public void setPerformsAtShows(boolean performsAtShows)
	{
		this.performsAtShows = performsAtShows;
	}
	public boolean isWolfBreed()
	{
		return wolfBreed;
	}
	public void setWolfBreed(boolean wolfBreed)
	{
		this.wolfBreed = wolfBreed;
	}
	public String getServiceType()
	{
		return serviceType;
	}
	public void setServiceType(String serviceType)
	{
		this.serviceType = serviceType;
	}
}
