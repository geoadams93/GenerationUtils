package org.peanut.generation.generators;

@FunctionalInterface
public interface OneArgConstructor<A, I> extends Constructor<I>
{
	public I instantiate(A argument);
}
