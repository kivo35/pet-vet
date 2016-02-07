/**
 * 
 */
package com.sqa.kv.pet.vet;

/**
 * @author Kirill
 * 
 */
public class Mammal extends PetVet
{
	private boolean rabbiesShot;
	private boolean houseBroken;
	public boolean isRabbiesShot()
	{
		return rabbiesShot;
	}
	public void setRabbiesShot(boolean rabbiesShot)
	{
		this.rabbiesShot = rabbiesShot;
	}
	public boolean isHouseBroken()
	{
		return houseBroken;
	}
	public void setHouseBroken(boolean houseBroken)
	{
		this.houseBroken = houseBroken;
	}
}
