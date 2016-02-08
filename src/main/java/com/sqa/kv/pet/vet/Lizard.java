/**
 * 
 */
package com.sqa.kv.pet.vet;

/**
 * @author Kirill
 * 
 */
public class Lizard extends Reptile
{
	private boolean lostTail;
	private boolean changeColor;

	public boolean ChangeColor()
	{
		return this.changeColor;
	}

	public boolean LostTail()
	{
		return this.lostTail;
	}

	public void setChangeColor(boolean changeColor)
	{
		this.changeColor = changeColor;
	}

	public void setLostTail(boolean lostTail)
	{
		this.lostTail = lostTail;
	}
}
