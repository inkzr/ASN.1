package ink.jasn.ca.type.grammar;

import java.math.BigInteger;

// New Definition of Constraints
//*********************************************
// Definition of AsnConstraint
//*********************************************
public class AsnConstraint
{
	public boolean isSignedNumber;
	public boolean isDefinedValue;
	public boolean isColonValue;
	public boolean isElementSetSpecs;
	public boolean isExceptionSpec;
	public boolean isAdditionalElementSpec;
	public boolean isCommaDotDot;
	// public AsnSignedNumber signedNumber;
	public BigInteger signedNumber;
	public AsnDefinedValue definedValue;
	public AsnValue value;
	public Object type;
	public ElementSetSpec elemSetSpec, addElemSetSpec;

	// Default Constructor
	public AsnConstraint()
	{
	}

	// toString() method
	public String toString()
	{
		String ts = "";
		if (isElementSetSpecs)
			ts += elemSetSpec;
		else if (isAdditionalElementSpec)
			ts += addElemSetSpec;
		if (isExceptionSpec)
		{
			ts += " !";
			if (isSignedNumber)
				ts += signedNumber;
			else if (isDefinedValue)
				ts += definedValue;
			// ??????? Type to returned as string also ???????
			else if (isColonValue)
				ts += value;
		}
		return ts;
	}

	// Return the total intersection elements in the element
	// Spec list
	public int sz_elemSS_IntsectList()
	{
		return elemSetSpec.intersectionList.size();
	}

	// Return the first intersection element
	public Intersection get_elemSS_firstIntsectElem()
	{
		return (Intersection) elemSetSpec.intersectionList.get(0);
	}

	// Return the required intersection element
	public Intersection get_elemSS_IntsectElem(int i)
	{
		return (Intersection) elemSetSpec.intersectionList.get(i);
	}

	// Return if All Except Constraint Elements exists
	public boolean elemSS_isAllExcept()
	{
		if (elemSetSpec.isAllExcept)
			return true;
		else
			return false;
	}

	// Return AllExcept Constraint Elements
	public ConstraintElements elemSS_allExceptConstraintElem()
	{
		return elemSetSpec.allExceptCnselem;
	}

	// Returns first constraint Element in the first Intersection
	// List
	public ConstraintElements get_elemSS_firstConstraintElem()
	{
		Intersection intersect = get_elemSS_firstIntsectElem();
		return (ConstraintElements) intersect.cnsElemList.get(0);
	}

	// Returns Number of Constraint Elements in the
	// specified IntersectionList
	public int sz_elemSS_intersectionConstraintElems(int i)
	{
		Intersection intersect = get_elemSS_IntsectElem(i);
		if (intersect != null)
			return intersect.cnsElemList.size();
		else
			return -1;
	}

	// Returns specified Constraint Elements in the specified IntersectionList
	public ConstraintElements get_elemSS_intersectionConstraintElems(int intersectElem,
				int constraintElem)
	{
		Intersection intersect = get_elemSS_IntsectElem(intersectElem);
		return (ConstraintElements) intersect.cnsElemList.get(constraintElem);
	}

	// ---------For additionalElementSetSpecs
	// Return the total intersection elements in the add element
	// Spec list
	public int sz_addElemSS_IntsectList()
	{
		return addElemSetSpec.intersectionList.size();
	}

	// Return the first additional intersection element
	public Intersection get_addElemSS_firstIntsectElem()
	{
		return (Intersection) addElemSetSpec.intersectionList.get(0);
	}

	// Return the required additional intersection element
	public Intersection get_addElemSS_IntsectElem(int i)
	{
		return (Intersection) addElemSetSpec.intersectionList.get(i);
	}

	// Return if All Except additional Constraint Elements exists
	public boolean addElemSS_isAllExcept()
	{
		if (addElemSetSpec.isAllExcept)
			return true;
		else
			return false;
	}

	// Return AllExcept additional Constraint Elements
	public ConstraintElements addElemSS_allExceptConstraintElem()
	{
		return addElemSetSpec.allExceptCnselem;
	}

	// Returns first additional constraint Element in the first Intersection
	// List
	public ConstraintElements get_addElemSS_firstConstraintElem()
	{
		Intersection intersect = get_addElemSS_firstIntsectElem();
		return (ConstraintElements) intersect.cnsElemList.get(0);
	}

	// Returns Number of additional Constraint Elements in the
	// specified IntersectionList
	public int sz_addElemSS_intersectionConstraintElems(int i)
	{
		Intersection intersect = get_addElemSS_IntsectElem(i);
		if (intersect != null)
			return intersect.cnsElemList.size();
		else
			return -1;
	}

	// Returns specified additional Constraint Elements in the specified
	// IntersectionList
	public ConstraintElements get_addElemSS_intersectionConstraintElems(int intersectElem,
				int constraintElem)
	{
		Intersection intersect = get_addElemSS_IntsectElem(intersectElem);
		return (ConstraintElements) intersect.cnsElemList.get(constraintElem);
	}

} // End AsnConstraint
