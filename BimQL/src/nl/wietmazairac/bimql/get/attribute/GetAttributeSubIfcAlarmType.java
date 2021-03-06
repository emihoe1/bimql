package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcAlarmType;

public class GetAttributeSubIfcAlarmType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcAlarmType(Object object, String string) {
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
			resultList.add(((IfcAlarmType) object).getPredefinedType());
			 //1IfcAlarmTypeEnum
		}
		else if (string.equals("ElementType")) {
			resultList.add(((IfcAlarmType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcAlarmType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcAlarmType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcAlarmType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcAlarmType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcAlarmType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcAlarmType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcAlarmType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcAlarmType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcAlarmType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcAlarmType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcAlarmType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcAlarmType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcAlarmType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcAlarmType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcAlarmType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcAlarmType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcAlarmType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcAlarmType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcAlarmType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcAlarmType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcAlarmType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
