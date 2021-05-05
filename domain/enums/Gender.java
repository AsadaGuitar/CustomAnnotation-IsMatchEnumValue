package com.example.domain.enums;

public enum Gender {

	MAN("男性"),
	WOMAN("女性");
	
	private String value;
	
	public String getValue() {
		return this.value;
	}

	Gender(String string) {
		this.value = string;
	}
	
	
}
