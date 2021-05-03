package com.sapient.trg.rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestBody {
	@XmlElement String fromLoc;
	@XmlElement String toLoc;
	@XmlElement String departDate;
	

}
