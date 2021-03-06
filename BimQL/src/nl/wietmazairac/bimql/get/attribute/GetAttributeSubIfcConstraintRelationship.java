package nl.wietmazairac.bimql.get.attribute;

import java.util.ArrayList;

import org.bimserver.models.ifc2x3tc1.IfcConstraintRelationship;

public class GetAttributeSubIfcConstraintRelationship {
	// fields
	private Object object;
	private String string;

	// constructors
	public GetAttributeSubIfcConstraintRelationship(Object object, String string) {
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
		if (string.equals("RelatingConstraint")) {
			resultList.add(((IfcConstraintRelationship) object).getRelatingConstraint());
			 //1IfcConstraint
		}
		else if (string.equals("RelatedConstraints")) {
			//3xxx
			for (int i = 0; i < ((IfcConstraintRelationship) object).getRelatedConstraints().size(); i++) {
				resultList.add(((IfcConstraintRelationship) object).getRelatedConstraints().get(i));
			}
			 //1EList
		}
		else if (string.equals("Name")) {
			resultList.add(((IfcConstraintRelationship) object).getName());
			 //1String
		}
		else if (string.equals("Description")) {
			resultList.add(((IfcConstraintRelationship) object).getDescription());
			 //1String
		}
		return resultList;
	}
}
