package com.lti;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/circle")
public class CircleService {
	
	@GET
	@Path("/area/{radius}")
	public String getArea(@PathParam(value = "radius") double radius) {
		double area=Math.PI*radius*radius;
		return String.valueOf(area);
	}
	
	@GET
	@Path("/perimeter/{radius}")
	public String getPerimeter(@PathParam("radius") double radius) {
		double peri = 2*Math.PI*radius;
		return String.valueOf(peri);
	}
}
