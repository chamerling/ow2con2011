/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.chamerling.ow2con.services.crisis;

import itemis.demo.turnstile.Turnstile;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.4.0 2011-11-23T09:34:41.034+01:00
 * Generated source version: 2.4.0
 * 
 */

@javax.jws.WebService(serviceName = "TurnstileService", portName = "TurnstilePort", targetNamespace = "http://demo.itemis/Turnstile", endpointInterface = "itemis.demo.turnstile.Turnstile")
public class TurnstileImpl implements Turnstile {

	private static final Logger LOG = Logger.getLogger(TurnstileImpl.class
			.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see itemis.demo.turnstile.Turnstile#close(*
	 */
	public void close() {
		System.out.println("Executing operation close");
		try {
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see itemis.demo.turnstile.Turnstile#open(*
	 */
	public void open() {
		System.out.println("Executing operation open");
		try {
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

}
