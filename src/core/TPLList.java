package core;

import java.util.ArrayList;
import java.util.List;

public class TPLList {
	private List<Value> list;
	
	public TPLList() {
		this.list = new ArrayList<>();
	}
	
	public void add(Value value) {
		this.list.add(value);
	}
	
	public Value get(int index) {
		return this.list.get(index);
	}
	
	public void addAll(TPLList list) {
		this.list.addAll(getList());
	}
	
	public List<Value> getList(){
		return this.list;
	}
	
	public Integer size() {
		return list.size();
	}
	
	public String toString() {
		return String.valueOf(list);
	}
}
