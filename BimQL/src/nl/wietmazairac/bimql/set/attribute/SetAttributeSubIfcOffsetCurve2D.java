package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcOffsetCurve2D;

public class SetAttributeSubIfcOffsetCurve2D {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcOffsetCurve2D() {
	}

	public SetAttributeSubIfcOffsetCurve2D(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("SelfIntersect")) {
			//1NoEList
			((IfcOffsetCurve2D) object).setSelfIntersect(Boolean.parseBoolean(attributeNewValue));
			 //1void
			 //1boolean
		}
		else if (attributeName.equals("Distance")) {
			//1NoEList
			((IfcOffsetCurve2D) object).setDistance(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("BasisCurve")) {
			//1NoEList
			 //1void
			 //1IfcCurve
		}
		else if (attributeName.equals("DistanceAsString")) {
			//1NoEList
			((IfcOffsetCurve2D) object).setDistanceAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Dim")) {
			//2NoEList
			 //2void
			 //2int
		}
		else {
		}
	}
}
