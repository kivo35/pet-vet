/**
 * 
 */
package com.sqa.kv.pet.vet;

/**
 * @author Kirill
 * 
 */
public class Reptile extends PetVet
{
	private boolean scales;
	private int heatLevel;
	private boolean poisonous;

	public int getHeatLevel()
	{
		return this.heatLevel;
	}

	public boolean isPoisonous()
	{
		return this.poisonous;
	}

	public boolean isScales()
	{
		return this.scales;
	}

	public void setHeatLevel(int heatLevel)
	{
		this.heatLevel = heatLevel;
	}

	public void setPoisonous(boolean poisonous)
	{
		this.poisonous = poisonous;
	}

	public void setScales(boolean scales)
	{
		this.scales = scales;
	}
}
