package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcTimeMeasure;

public class SetAttributeSubIfcTimeMeasure {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcTimeMeasure() {
	}

	public SetAttributeSubIfcTimeMeasure(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("WrappedValueAsString")) {
			//1NoEList
			((IfcTimeMeasure) object).setWrappedValueAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("WrappedValue")) {
			//1NoEList
			((IfcTimeMeasure) object).setWrappedValue(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
