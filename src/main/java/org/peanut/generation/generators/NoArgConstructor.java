package org.peanut.generation.generators;

@FunctionalInterface
public interface NoArgConstructor<I> extends Constructor<I>
{
	public I instantiate();
}
