package com.uttara.spring;

public class Car {
	private String name;
	private int bhp;
	public void drive()
	{
		System.out.println("In drive method");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBhp() {
		return bhp;
	}
	public void setBhp(int bhp) {
		this.bhp = bhp;
	}
	public Car(String name, int bhp) {
		super();
		this.name = name;
		this.bhp = bhp;
		System.out.println("In parameterised const");
	}
	public Car() {
		super();
		System.out.println("In no arg const");
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", bhp=" + bhp + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bhp;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (bhp != other.bhp)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
		
	}
	
	
	

}
