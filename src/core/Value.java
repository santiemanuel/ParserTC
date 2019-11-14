package core;

public class Value {
	public static Value VOID = new Value(new Object());
	
	final Object value;
	
	public Value(Object value) {
		this.value = value;
	}
	
	public Integer asInteger() {
		return (Integer) value;
	}
	
	public boolean isInteger() {
		return value instanceof Integer;
	}
	
	public String asString() {
		return (String) value;
	}
	
	public boolean isString() {
		return value instanceof String;
	}
	
	public Boolean asBoolean() {
		return (Boolean) value;
	}
	
	public boolean isBoolean() {
		return value instanceof Boolean;
	}
	
	public TPLList asList(){
		return (TPLList) value;
	}
	
	
	public boolean isList() {
		return value instanceof TPLList;
	}
	
	public TPLSet asSet() {
		return (TPLSet) value;
	}
	
	public boolean isSet() {
		return value instanceof TPLSet;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		Value out=(Value) obj;
		
		return this.value.equals(out.value);
	}
	
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
