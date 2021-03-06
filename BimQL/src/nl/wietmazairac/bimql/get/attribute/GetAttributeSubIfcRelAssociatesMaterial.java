package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcRelAssociatesMaterial;

public class GetAttributeSubIfcRelAssociatesMaterial {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcRelAssociatesMaterial(Object object, String string) {
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
		if (string.equals("RelatingMaterial")) {
			resultList.add(((IfcRelAssociatesMaterial) object).getRelatingMaterial());
			 //1IfcMaterialSelect
		}
		else if (string.equals("RelatedObjects")) {
			//3xxx
			for (int i = 0; i < ((IfcRelAssociatesMaterial) object).getRelatedObjects().size(); i++) {
				resultList.add(((IfcRelAssociatesMaterial) object).getRelatedObjects().get(i));
			}
			 //2EList
		}
		else if (string.equals("OwnerHistory")) {
			resultList.add(((IfcRelAssociatesMaterial) object).getOwnerHistory());
			 //3IfcOwnerHistory
		}
		else if (string.equals("GlobalId")) {
			resultList.add(((IfcRelAssociatesMaterial) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("GlobalIdObject")) {
			resultList.add(((IfcRelAssociatesMaterial) object).getGlobalId());
			 //3IfcGloballyUniqueId
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcRelAssociatesMaterial) object).getName());
			 //3String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcRelAssociatesMaterial) object).getDescription());
			 //3String
		}
		else {
		}
		return resultList;
	}
}
