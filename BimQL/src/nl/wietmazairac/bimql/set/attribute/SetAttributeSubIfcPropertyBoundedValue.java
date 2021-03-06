package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcPropertyBoundedValue;

public class SetAttributeSubIfcPropertyBoundedValue {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcPropertyBoundedValue() {
	}

	public SetAttributeSubIfcPropertyBoundedValue(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Unit")) {
			//1NoEList
			 //1void
			 //1IfcUnit
		}
		else if (attributeName.equals("UpperBoundValue")) {
			//1NoEList
			 //1void
			 //1IfcValue
		}
		else if (attributeName.equals("LowerBoundValue")) {
			//1NoEList
			 //1void
			 //1IfcValue
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcPropertyBoundedValue) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcPropertyBoundedValue) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
