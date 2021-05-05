package com.example.domain.enums;

public enum Educational {

	MidleSchool(12, 15),
	HighSchool(15,19),
	College(18,23),
	Society(15, 100);
	
	private int startAge;
	private int endAge;

	Educational(int s, int e) {
		this.startAge = s;
		this.endAge = e;
	}

	public int getStart() {
		return this.startAge;
	}
	
	public int getEnd() {
		return this.endAge;
	}
	
}
