package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcFlowTerminalType;

public class GetAttributeSubIfcFlowTerminalType {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcFlowTerminalType(Object object, String string) {
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
		if (string.equals("ElementType")) {
			resultList.add(((IfcFlowTerminalType) object).getElementType());
			 //3String
		}
		else if (string.equals("RepresentationMaps")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminalType) object).getRepresentationMaps().size(); i++) {
				resultList.add(((IfcFlowTerminalType) object).getRepresentationMaps().get(i));
			}
			 //3EList
		}
		else if (string.equals("Tag")) {
			resultList.add(((IfcFlowTerminalType) object).getTag());
			 //3String
		}
		else if (string.equals("ApplicableOccurrence")) {
			resultList.add(((IfcFlowTerminalType) object).getApplicableOccurrence());
			 //3String
		}
		else if (string.equals("ObjectTypeOf")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminalType) object).getObjectTypeOf().size(); i++) {
				resultList.add(((IfcFlowTerminalType) object).getObjectTypeOf().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasPropertySets")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminalType) object).getHasPropertySets().size(); i++) {
				resultList.add(((IfcFlowTerminalType) object).getHasPropertySets().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssignments")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminalType) object).getHasAssignments().size(); i++) {
				resultList.add(((IfcFlowTerminalType) object).getHasAssignments().get(i));
			}
			 //3EList
		}
		else if (string.equals("IsDecomposedBy")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminalType) object).getIsDecomposedBy().size(); i++) {
				resultList.add(((IfcFlowTerminalType) object).getIsDecomposedBy().get(i));
			}
			 //3EList
		}
		else if (string.equals("Decomposes")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminalType) object).getDecomposes().size(); i++) {
				resultList.add(((IfcFlowTerminalType) object).getDecomposes().get(i));
			}
			 //3EList
		}
		else if (string.equals("HasAssociations")) {
			//3xxx
			for (int i = 0; i < ((IfcFlowTerminalType) object).getHasAssociations().size(); i++) {
				resultList.add(((IfcFlowTerminalType) object).getHasAssociations().get(i));
			}
			 //3EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcFlowTerminalType) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcFlowTerminalType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcFlowTerminalType) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcFlowTerminalType) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcFlowTerminalType) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
