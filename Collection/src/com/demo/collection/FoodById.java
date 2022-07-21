package com.demo.collection;

// this class will used in tree set class in this package

public class FoodById implements Comparable<FoodById> {
	int FoodId2;
	String foodName2;

	public FoodById(int foodId2, String foodName2) {
		super();
		FoodId2 = foodId2;
		this.foodName2 = foodName2;
	}

	@Override
	public String toString() {
		return "\n" + FoodId2 + " " + foodName2 + " ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + FoodId2;
		result = prime * result + ((foodName2 == null) ? 0 : foodName2.hashCode());
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
		FoodById other = (FoodById) obj;
		if (FoodId2 != other.FoodId2)
			return false;
		if (foodName2 == null) {
			if (other.foodName2 != null)
				return false;
		} else if (!foodName2.equals(other.foodName2))
			return false;
		return true;
	}

	@Override
	public int compareTo(FoodById o) {
		// TODO Auto-generated method stub
		if (FoodId2 > o.FoodId2) {
			return +1;
		} else if (FoodId2 < o.FoodId2) {
			return -1;
		}
		return 0;
	}

}
