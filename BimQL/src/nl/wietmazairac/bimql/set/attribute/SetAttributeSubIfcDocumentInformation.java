package nl.wietmazairac.bimql.set.attribute;

import org.bimserver.models.ifc2x3tc1.IfcDocumentInformation;

public class SetAttributeSubIfcDocumentInformation {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcDocumentInformation() {
	}

	public SetAttributeSubIfcDocumentInformation(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("CreationTime")) {
			//1NoEList
			 //1void
			 //1IfcDateAndTime
		}
		else if (attributeName.equals("Scope")) {
			//1NoEList
			((IfcDocumentInformation) object).setScope(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Revision")) {
			//1NoEList
			((IfcDocumentInformation) object).setRevision(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("ValidFrom")) {
			//1NoEList
			 //1void
			 //1IfcCalendarDate
		}
		else if (attributeName.equals("DocumentId")) {
			//1NoEList
			((IfcDocumentInformation) object).setDocumentId(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("IntendedUse")) {
			//1NoEList
			((IfcDocumentInformation) object).setIntendedUse(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("DocumentOwner")) {
			//1NoEList
			 //1void
			 //1IfcActorSelect
		}
		else if (attributeName.equals("LastRevisionTime")) {
			//1NoEList
			 //1void
			 //1IfcDateAndTime
		}
		else if (attributeName.equals("ElectronicFormat")) {
			//1NoEList
			 //1void
			 //1IfcDocumentElectronicFormat
		}
		else if (attributeName.equals("ValidUntil")) {
			//1NoEList
			 //1void
			 //1IfcCalendarDate
		}
		else if (attributeName.equals("Confidentiality")) {
			//1NoEList
			 //1void
			 //1IfcDocumentConfidentialityEnum
		}
		else if (attributeName.equals("Purpose")) {
			//1NoEList
			((IfcDocumentInformation) object).setPurpose(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Name")) {
			//1NoEList
			((IfcDocumentInformation) object).setName(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Description")) {
			//1NoEList
			((IfcDocumentInformation) object).setDescription(attributeNewValue);
			 //1void
			 //1String
		}
		else if (attributeName.equals("Status")) {
			//1NoEList
			 //1void
			 //1IfcDocumentStatusEnum
		}
	}
}
