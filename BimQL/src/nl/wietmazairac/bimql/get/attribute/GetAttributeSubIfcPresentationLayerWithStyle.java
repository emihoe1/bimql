package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPresentationLayerWithStyle;

public class GetAttributeSubIfcPresentationLayerWithStyle {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPresentationLayerWithStyle(Object object, String string) {
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
		if (string.equals("LayerStyles")) {
			//3xxx
			for (int i = 0; i < ((IfcPresentationLayerWithStyle) object).getLayerStyles().size(); i++) {
				resultList.add(((IfcPresentationLayerWithStyle) object).getLayerStyles().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
