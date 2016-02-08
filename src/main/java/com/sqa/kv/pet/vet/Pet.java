/**
 * 
 */
package com.sqa.kv.pet.vet;

import com.sqa.kv.util.helper.RequestInput;

/**
 * @author Kirill
 * 
 */
public class Pet
{
	private boolean alive;
	private String name;
	private boolean injured;
	private boolean male;
	private String breed;

	public Pet()
	{
		// this.name = RequestInput.getString("What is your " +
		// this.getClass().getSimpleName() + "'s name:");
		// this.injured = RequestInput.getBoolean("Is " + this.getName() + "
		// injured in any way?");
		// this.male = RequestInput.getBoolean("Is " + this.getName() + " a
		// male?");
		// this.breed = RequestInput.getString("What breed is your " +
		// this.getClass().getSimpleName() + "?");
		this(RequestInput.getString("What is your pet's name:"), RequestInput
				.getBoolean("Is your pet injured in any way?"), RequestInput.getBoolean("Is it a male?"), RequestInput
				.getString("What breed is your pet?"));
	}

	/**
	 * @param name
	 */
	public Pet(String name)
	{
		this(name, false, true, "No Breed Specified");
	}

	/**
	 * @param name
	 * @param injured
	 * @param male
	 * @param breed
	 */
	public Pet(String name, boolean injured, boolean male, String breed)
	{
		this.setAlive(true);
		this.setName(name);
		this.setInjured(injured);
		this.setMale(male);
		this.setBreed(breed);
	}

	/**
	 * @return the breed
	 */
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
