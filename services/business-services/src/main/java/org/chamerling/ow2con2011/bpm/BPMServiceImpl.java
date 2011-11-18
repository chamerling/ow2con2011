package org.chamerling.ow2con2011.bpm;

import javax.jws.WebService;

@WebService(endpointInterface = "org.chamerling.ow2con2011.bpm.BPMService")
public class BPMServiceImpl implements BPMService {

	public void process() {
		System.out.println("I am the BPM service....");
	}
}
