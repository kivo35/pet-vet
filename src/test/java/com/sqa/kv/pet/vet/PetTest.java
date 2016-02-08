/**
 *
 */
package com.sqa.kv.pet.vet;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Kirill
 *
 */
public class PetTest
{
	@Test
	public void collectionsTest()
	{
		// Array List Demo
		List<String> pets = new ArrayList<String>();
		pets.add("Gizmo");
		pets.add("Spot");
		pets.add("Joe");
		pets.add("Moe");
		pets.add("Uno");
		pets.add("Doce");
		for (String s : pets)
		{
			System.out.println(s);
		}
		System.out.println("/////////////////////////////////");
		pets.remove(0);
		for (String s : pets)
		{
			System.out.println(s);
		}
		System.out.println("/////////////////////////////////");
		pets.remove(0);
		for (String s : pets)
		{
			System.out.println(s);
		}
	}

	@Ignore
	public void test()
	{
		// Object[] pets = new Object[] { new Pet[] { new Pet(), new Pet() },
		// new Pet(), new Mammal(), new Pet() };
		// System.out.println("My Pet:" + Arrays.toString((pets)));
		Pet[] pets = new Pet[] { new Reptile("Pedro", true, true, "Iguana", true, 3, false), new Pet("Spot"), new Pet(),
				new Reptile() };
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
