package org.sturrock;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
class PingResponse {

	@XmlElement
	private String text;
	
	public PingResponse() {
		text = "Hello World";
	}
}