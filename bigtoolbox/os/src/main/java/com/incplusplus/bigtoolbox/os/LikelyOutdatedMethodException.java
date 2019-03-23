package com.incplusplus.bigtoolbox.os;

public class LikelyOutdatedMethodException extends RuntimeException
{
	private static String cause = "A method that was called is in an unexpected state. \n" +
			"This is likely because the environment the method expects is outdated. \n" +
			"Further details: ";

	/**
	 * the methods that depend on very specific strings given from the OS may
	 * receive a different format than expected and would
	 * not know how to parse that string properly.
	 * This can and likely will be caused by the OS receiving an update that
	 * changes the expected string format.
	 * @param outdatedMethodLocation
	 */
	public LikelyOutdatedMethodException(String outdatedMethodLocation)
	{
		super(cause + outdatedMethodLocation);
	}
}