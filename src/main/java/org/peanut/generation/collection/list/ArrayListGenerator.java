package org.peanut.generation.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ArrayListGenerator implements ListGenerator
{
	ArrayListGenerator()
	{
	}

	@Override
	public <V> List<V> generateContents(Supplier<V> generationSupplier)
	{
		List<V> resultingList = new ArrayList<>();
		for (int index = 0; index < 10; index++)
		{
			resultingList.add(generationSupplier.get());
		}
		return resultingList;
	}

	@Override
	public <V> List<V> generateContents(Supplier<V> generationSupplier, int size)
	{
		List<V> resultingList = new ArrayList<>(size);
		for (int index = 0; index < size; index++)
		{
			resultingList.add(generationSupplier.get());
		}
		return resultingList;
	}
}
