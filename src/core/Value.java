package core;

import java.util.List;

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
	
	
	public TPLList asList(){
		return (TPLList) value;
	}
	
	public boolean isList() {
		return value instanceof TPLList;
	}
	
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
