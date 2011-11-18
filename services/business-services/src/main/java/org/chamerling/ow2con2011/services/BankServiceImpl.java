/**
 * 
 */
package org.chamerling.ow2con2011.services;

import javax.jws.WebService;

/**
 * @author chamerling
 *
 */
@WebService(endpointInterface = "org.chamerling.ow2con2011.services.BankService")
public class BankServiceImpl implements BankService {
	
	public void pay() {
		System.out.println("Pay!");
	}

}
