package org.peanut.generation.generators;

@FunctionalInterface
public interface ThreeArgConstructor<A, B, C, I> extends Constructor<I>
{
	public I instantiate(A argument1, B argument2, C argument3);
}
