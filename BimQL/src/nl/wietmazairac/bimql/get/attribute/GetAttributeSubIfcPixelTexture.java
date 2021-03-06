package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPixelTexture;

public class GetAttributeSubIfcPixelTexture {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPixelTexture(Object object, String string) {
		this.object = object;
		this.string = string;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public ArrayList<Object> getResult() {
	ArrayList<Object> resultList = new ArrayList<Object>();
		if (string.equals("ColourComponents")) {
			resultList.add(((IfcPixelTexture) object).getColourComponents());
			 //1int
		}
		else if (string.equals("Height")) {
			resultList.add(((IfcPixelTexture) object).getHeight());
			 //1int
		}
		else if (string.equals("Width")) {
			resultList.add(((IfcPixelTexture) object).getWidth());
			 //1int
		}
		return resultList;
	}
}
