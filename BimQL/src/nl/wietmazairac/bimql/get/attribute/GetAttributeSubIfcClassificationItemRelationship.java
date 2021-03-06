package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcClassificationItemRelationship;

public class GetAttributeSubIfcClassificationItemRelationship {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcClassificationItemRelationship(Object object, String string) {
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
		if (string.equals("RelatingItem")) {
			resultList.add(((IfcClassificationItemRelationship) object).getRelatingItem());
			 //1IfcClassificationItem
		}
		else if (string.equals("RelatedItems")) {
			//3xxx
			for (int i = 0; i < ((IfcClassificationItemRelationship) object).getRelatedItems().size(); i++) {
				resultList.add(((IfcClassificationItemRelationship) object).getRelatedItems().get(i));
			}
			 //1EList
		}
		return resultList;
	}
}
