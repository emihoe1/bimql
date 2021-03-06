package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcLinearDimension;

public class GetAttributeSubIfcLinearDimension {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcLinearDimension(Object object, String string) {
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
		if (string.equals("IsRelatedFromCallout")) {
			//3xxx
			for (int i = 0; i < ((IfcLinearDimension) object).getIsRelatedFromCallout().size(); i++) {
				resultList.add(((IfcLinearDimension) object).getIsRelatedFromCallout().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsRelatedToCallout")) {
			//3xxx
			for (int i = 0; i < ((IfcLinearDimension) object).getIsRelatedToCallout().size(); i++) {
				resultList.add(((IfcLinearDimension) object).getIsRelatedToCallout().get(i));
			}
			 //3EList
		}
		else if (string.equals("Contents")) {
			//3xxx
			for (int i = 0; i < ((IfcLinearDimension) object).getContents().size(); i++) {
				resultList.add(((IfcLinearDimension) object).getContents().get(i));
			}
			 //3EList
		}
		else if (string.equals("StyledByItem")) {
			//3xxx
			for (int i = 0; i < ((IfcLinearDimension) object).getStyledByItem().size(); i++) {
				resultList.add(((IfcLinearDimension) object).getStyledByItem().get(i));
			}
			 //3EList
		}
		else if (string.equals("LayerAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcLinearDimension) object).getLayerAssignments().size(); i++) {
				resultList.add(((IfcLinearDimension) object).getLayerAssignments().get(i));
			}
			 //3EList
		}
		else {
		}
		return resultList;
	}
}
