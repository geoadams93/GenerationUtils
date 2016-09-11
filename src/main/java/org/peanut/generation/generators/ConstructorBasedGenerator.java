package org.peanut.generation.generators;

import java.util.Collection;

public interface ConstructorBasedGenerator
{
	public static <I> ConstructorBasedGenerator defineConstructor(NoArgConstructor<I> constructor)
	{
		return new NoArgGenerator<I>(constructor);
	}

	public static <A, I> ConstructorBasedGenerator defineConstructor(OneArgConstructor<A, I> constructor)
	{
		return new OneArgGenerator<A, I>(constructor);
	}

	public static <A, B, I> ConstructorBasedGenerator defineConstructor(TwoArgConstructor<A, B, I> constructor)
	{
		return new TwoArgGenerator<A, B, I>(constructor);
	}

	public static <A, B, C, I> ConstructorBasedGenerator defineConstructor(ThreeArgConstructor<A, B, C, I> constructor)
	{
		return new ThreeArgGenerator<A, B, C, I>(constructor);
	}

	public ConstructorBasedGenerator generateResultsAsList();

	public ConstructorBasedGenerator generateResultsAsSet();

	public ConstructorBasedGenerator generateResultsAsMap();

	public <V> Collection<?> generateContents();

	public <V> Collection<?> generateContents(int size);
}
