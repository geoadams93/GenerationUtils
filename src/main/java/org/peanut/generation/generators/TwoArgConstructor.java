package org.peanut.generation.generators;

@FunctionalInterface
public interface TwoArgConstructor<A, B, I> extends Constructor<I>
{
	public I instantiate(A argument1, B argument2);
}
