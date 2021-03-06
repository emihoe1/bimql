package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcServiceLife;

public class SetAttributeSubIfcServiceLife {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcServiceLife() {
	}

	public SetAttributeSubIfcServiceLife(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ServiceLifeDurationAsString")) {
			//1NoEList
			((IfcServiceLife) object).setServiceLifeDurationAsString(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ServiceLifeDuration")) {
			//1NoEList
			((IfcServiceLife) object).setServiceLifeDuration(Double.parseDouble(attributeNewValue));
			 //1void
			 //1double
		}
		else if (attributeName.equals("ServiceLifeType")) {
			//1NoEList
			 //1void
			 //1IfcServiceLifeTypeEnum
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcServiceLife) object).setObjectType(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("GlobalId")) {
			//5NoEList
			 //5void
			 //5IfcGloballyUniqueId
		}
		else if (attributeName.equals("OwnerHistory")) {
			//5NoEList
			 //5void
			 //5IfcOwnerHistory
		}
		else if (attributeName.equals("Name")) {
			//5NoEList
			((IfcServiceLife) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcServiceLife) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
