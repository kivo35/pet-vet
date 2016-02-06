/**
 * 
 */
package com.sqa.kv.pet.vet;

import org.junit.Test;

/**
 * @author Kirill
 * 
 */
public class PetTest
{

	@Test
	public void test()
	{
		// Object[] pets = new Object[] { new Pet[] { new Pet(), new Pet() },
		// new Pet(), new Mammal(), new Pet() };
		// System.out.println("My Pet:" + Arrays.toString((pets)));
		PetVet[] pets = new PetVet[] { new PetVet() };
		for (int i = 0, j = 1; i <= pets.length; i++, j++)
		{
			System.out.println("My Pet " + (i + 1) + ": " + pets[i]);
			// Post and Pre Increment/ Decrement + Conditional Operator
			// System.out.println("J is " + j);
			// System.out.println("Pre Increment: " + ++j);
			// System.out.println("Post Increment: " + j++);
			// System.out.println("Post Decrement:" + j--);
			// System.out.println("Pre Increment:" + ++j);
			// int myLuckyNumber = (++j > 3) ? 5 : 1;
			// System.out.println(myLuckyNumber);

		}
	}

}
