package nl.wietmazairac.bimql.set.attribute;


public class SetAttributeSubIfcCsgSolid {
	// fields
	private Object object;
	private String attributeName;
	private String attributeNewValue;

	// constructors
	public SetAttributeSubIfcCsgSolid() {
	}

	public SetAttributeSubIfcCsgSolid(Object object, String attributeName, String attributeNewValue) {
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
		if (attributeName.equals("TreeRootExpression")) {
			//1NoEList
			 //1void
			 //1IfcCsgSelect
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
