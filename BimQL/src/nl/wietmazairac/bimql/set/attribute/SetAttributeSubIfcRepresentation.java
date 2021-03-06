package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcRepresentation;

public class SetAttributeSubIfcRepresentation {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcRepresentation() {
	}

	public SetAttributeSubIfcRepresentation(Object object, String attributeName, String attributeNewValue) {
		this.object = object;
		this.attributeName = attributeName;
		this.attributeNewValue = attributeNewValue;
	}

	// methods
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeNewValue() {
		return attributeNewValue;
	}

	public void setAttributeNewValue(String attributeNewValue) {
		this.attributeNewValue = attributeNewValue;
	}

	public void setAttribute() {
		if (attributeName.equals("ContextOfItems")) {
			//1NoEList
			 //1void
			 //1IfcRepresentationContext
		}
		else if (attributeName.equals("RepresentationIdentifier")) {
			//1NoEList
			((IfcRepresentation) object).setRepresentationIdentifier(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("RepresentationType")) {
			//1NoEList
			((IfcRepresentation) object).setRepresentationType(attributeNewValue);
			 //1void
			 //1String
		}
	}
}
