package org.peanut.generation.generators;

import java.util.Collection;

import org.peanut.generation.collection.CollectionGenerator;

class ThreeArgGenerator<A, B, C, I> implements ConstructorBasedGenerator
{
	ThreeArgConstructor<A, B, C, I> constructor;
	CollectionGenerator<?> collectionGenerator;

	public ThreeArgGenerator(ThreeArgConstructor<A, B, C, I> constructor)
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
		return collectionGenerator.generateContents(() -> constructor.instantiate(null, null, null));
	}

	public <V> Collection<?> generateContents(int size)
	{
		return collectionGenerator.generateContents(() -> constructor.instantiate(null, null, null), size);
	}
}
