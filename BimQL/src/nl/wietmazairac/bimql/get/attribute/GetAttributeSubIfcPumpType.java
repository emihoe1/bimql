package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcPumpType;

public class GetAttributeSubIfcPumpType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcPumpType(Object object, String string) {
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
		if (string.equals("PredefinedType")) {
			resultList.add(((IfcPumpType) object).getPredefinedType());
			 //1IfcPumpTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcPumpType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcPumpType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcPumpType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcPumpType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcPumpType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcPumpType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcPumpType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcPumpType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcPumpType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcPumpType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcPumpType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcPumpType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcPumpType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcPumpType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcPumpType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcPumpType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcPumpType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcPumpType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcPumpType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcPumpType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcPumpType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcPumpType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
