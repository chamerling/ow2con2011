/**
 * 
 */
package org.chamerling.ow2con2011.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author chamerling
 *
 */
@WebService
public interface RentalService {
	
	@WebMethod
	void rentCar();

}
