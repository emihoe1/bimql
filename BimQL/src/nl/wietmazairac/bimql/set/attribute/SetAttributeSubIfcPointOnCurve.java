package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcPointOnCurve;

public class SetAttributeSubIfcPointOnCurve {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcPointOnCurve() {
	}

	public SetAttributeSubIfcPointOnCurve(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("Dim")) {
			//1NoEList
			 //1void
			 //1int
		}
		else if (attributeName.equals("PointParameterAsString")) {
			//1NoEList
			((IfcPointOnCurve) object).setPointParameterAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("BasisCurve")) {
			//1NoEList
			 //1void
			 //1IfcCurve
		}
		else if (attributeName.equals("PointParameter")) {
			//1NoEList
			((IfcPointOnCurve) object).setPointParameter(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
	}
}
