package core;

import java.util.ArrayList;
import java.util.List;

public class TPLSet {
	private List<Value> set;
	
	public TPLSet() {
		this.set = new ArrayList<>();
	}
	
	public boolean in(Value value) {
		for (int i=0;i<set.size();i++) {
			if (set.get(i).isInteger() && value.isInteger() ||
				set.get(i).isString() && value.isString()	||
				set.get(i).isBoolean() && value.isBoolean() ||
				set.get(i).isList() && value.isList() ||
				set.get(i).isSet() && value.isSet()) {
					if (set.get(i).equals(value))
						return true;
				} else return false;		
		}
			
		return false;
	}
	
	public void add(Value value) {
		if (!in(value))
			this.set.add(value);
	}
	
	public TPLSet union(TPLSet second) {
		TPLSet result = new TPLSet();
		for (int i=0;i<this.set.size();i++)
			result.add(this.set.get(i));
		
		for (int i=0;i<second.set.size();i++)
			result.add(second.set.get(i));
		
		return result;
	}
	
	public TPLSet intersection(TPLSet second) {
		TPLSet result = new TPLSet();
		int sizeActual = this.size();
		int sizeSec = second.size();
		
		int n;
		n = (sizeActual < sizeSec)? sizeActual : sizeSec;
		for (int i=0;i<n;i++) {
			if (in(second.set.get(i)))
				result.add(second.set.get(i));
		}
		
		return result;
	}
	
	public TPLSet difference(TPLSet second) {
		TPLSet result = new TPLSet();
		
		for (Value element : this.set) {
			if (!second.in(element))
				result.add(element);
		}
		
		return result;
		
	}
	
	public Integer size() {
		return set.size();
	}
	
	public String toString() {
		StringBuilder b = new StringBuilder("{");
		for (int i= 0; i < set.size(); i++)
		{
			if (i > 0) b.append(", ");
			b.append(set.get(i));
		}
		b.append("}");
		return b.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		TPLSet out = (TPLSet) obj;
		
		return this.set.equals(out.set);
	}
}
