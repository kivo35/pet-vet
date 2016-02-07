/**
 * 
 */
package com.sqa.kv.pet.vet;

/**
 * @author Kirill
 * 
 */
public class PetVet
{
	private boolean alive;
	private String name;
	private boolean injured;
	private boolean male;
	private String breed;

	public String getBreed()
	{
		return this.breed;
	}

	public String getName()
	{
		return this.name;
	}

	public boolean isAlive()
	{
		return this.alive;
	}

	public boolean isInjured()
	{
		return this.injured;
	}

	public boolean isMale()
	{
		return this.male;
	}

	public void setAlive(boolean alive)
	{
		this.alive = alive;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}

	public void setInjured(boolean injured)
	{
		this.injured = injured;
	}

	public void setMale(boolean male)
	{
		this.male = male;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
