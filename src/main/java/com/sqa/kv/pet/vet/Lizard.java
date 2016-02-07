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
	public boolean isLostTail()
	{
		return lostTail;
	}
	public void setLostTail(boolean lostTail)
	{
		this.lostTail = lostTail;
	}
	public boolean isChangeColor()
	{
		return changeColor;
	}
	public void setChangeColor(boolean changeColor)
	{
		this.changeColor = changeColor;
	}
}
