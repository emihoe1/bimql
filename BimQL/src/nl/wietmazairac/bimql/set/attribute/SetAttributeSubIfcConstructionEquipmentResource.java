package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcConstructionEquipmentResource;

public class SetAttributeSubIfcConstructionEquipmentResource {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcConstructionEquipmentResource() {
	}

	public SetAttributeSubIfcConstructionEquipmentResource(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("ResourceIdentifier")) {
			//2NoEList
			((IfcConstructionEquipmentResource) object).setResourceIdentifier(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("ResourceConsumption")) {
			//2NoEList
			 //2void
			 //2IfcResourceConsumptionEnum
		}
		else if (attributeName.equals("ResourceGroup")) {
			//2NoEList
			((IfcConstructionEquipmentResource) object).setResourceGroup(attributeNewValue);
			 //2void
			 //2String
		}
		else if (attributeName.equals("BaseQuantity")) {
			//2NoEList
			 //2void
			 //2IfcMeasureWithUnit
		}
		else if (attributeName.equals("ObjectType")) {
			//5NoEList
			((IfcConstructionEquipmentResource) object).setObjectType(attributeNewValue);
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
			((IfcConstructionEquipmentResource) object).setName(attributeNewValue);
			 //5void
			 //5String
		}
		else if (attributeName.equals("Description")) {
			//5NoEList
			((IfcConstructionEquipmentResource) object).setDescription(attributeNewValue);
			 //5void
			 //5String
		}
		else {
		}
	}
}
