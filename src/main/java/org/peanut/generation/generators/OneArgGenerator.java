package org.peanut.generation.generators;

import java.util.Collection;

import org.peanut.generation.collection.CollectionGenerator;

class OneArgGenerator<A, I> implements ConstructorBasedGenerator
{
	OneArgConstructor<A, I> constructor;
	CollectionGenerator<?> collectionGenerator;

	public OneArgGenerator(OneArgConstructor<A, I> constructor)
	{
		this.constructor = constructor;
	}

	@Override
	public ConstructorBasedGenerator generateResultsAsList()
	{
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
		return collectionGenerator.generateContents(() -> constructor.instantiate(null));
	}

	public <V> Collection<?> generateContents(int size)
	{
		return collectionGenerator.generateContents(() -> constructor.instantiate(null), size);
	}
}
