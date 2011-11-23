/**
 * 
 */
package org.chamerling.ow2con.airline.service;

import java.util.concurrent.atomic.AtomicLong;

import petals.ow2.org.demo.travelagency.airline.AirLineBook;
import petals.ow2.org.demo.travelagency.airline.BookingResponse;

/**
 * @author chamerling
 * 
 */
@javax.jws.WebService(serviceName = "AirLineBookService", portName = "AirLineBook", targetNamespace = "http://org.ow2.petals/demo/travelagency/airline/", endpointInterface = "petals.ow2.org.demo.travelagency.airline.AirLineBook")
public class AirLineBookService implements AirLineBook {

	private static final AtomicLong al = new AtomicLong(0);

	/*
	 * (non-Javadoc)
	 * 
	 * @see petals.ow2.org.demo.travelagency.airline.AirLineBook#cancel(long
	 * reservationId )*
	 */
	public java.lang.String cancel(long reservationId) {
		System.out.println("Executing operation cancel");
		System.out.println(reservationId);
		try {
			return "OK";
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * petals.ow2.org.demo.travelagency.airline.AirLineBook#bookFlight(petals
	 * .ow2.org.demo.travelagency.airline.BookingRequest request )*
	 */
	public petals.ow2.org.demo.travelagency.airline.BookingResponse bookFlight(
			petals.ow2.org.demo.travelagency.airline.BookingRequest request) {
		System.out.println("Executing operation bookFlight");
		System.out.println(request);
		try {
			petals.ow2.org.demo.travelagency.airline.BookingResponse result = new BookingResponse();
			result.setBooked(true);
			result.setReservationId(al.incrementAndGet());
			return result;
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}
}
