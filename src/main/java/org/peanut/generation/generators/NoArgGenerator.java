package org.peanut.generation.generators;

import java.util.Collection;

import org.peanut.generation.collection.CollectionGenerator;
import org.peanut.generation.collection.list.ListGenerator;

class NoArgGenerator<I> implements ConstructorBasedGenerator
{
	NoArgConstructor<I> constructor;
	CollectionGenerator<?> collectionGenerator;

	public NoArgGenerator(NoArgConstructor<I> constructor)
	{
		this.constructor = constructor;
	}

	@Override
	public ConstructorBasedGenerator generateResultsAsList()
	{
		collectionGenerator = ListGenerator.set();
		return this;
	}

	@Override
	public ConstructorBasedGenerator generateResultsAsSet()
	{
		return this;
	}

	@Override
	public ConstructorBasedGenerator generateResultsAsMap()
	{
		return this;
	}

	public <V> Collection<?> generateContents()
	{
		return collectionGenerator.generateContents(constructor::instantiate);
	}

	public <V> Collection<?> generateContents(int size)
	{
		return collectionGenerator.generateContents(constructor::instantiate, size);
	}
}
