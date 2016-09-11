package org.peanut.generation.collection.list;

import java.util.List;

import org.peanut.generation.collection.CollectionGenerator;

public interface ListGenerator extends CollectionGenerator<List<?>>
{
	public static ListGenerator set()
	{
		return new ArrayListGenerator();
	}
}
