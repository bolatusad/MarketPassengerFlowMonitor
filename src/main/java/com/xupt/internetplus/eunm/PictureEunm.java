package com.xupt.internetplus.eunm;

public enum PictureEunm {
	MALE(0, "男"),

	FAMALE(1, "女");

	private PictureEunm(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public static PictureEunm getEnum(Integer code) {
		for (PictureEunm enumValue : PictureEunm.values()) {
			if (enumValue.getCode().equals(code))
				return enumValue;
		}
		return null;
	}

	public static Integer[] getCodes() {
		PictureEunm[] values = PictureEunm.values();
		Integer[] result = new Integer[values.length];
		for (int i = 0; i < values.length; i++) {
			result[i] = values[i].getCode();
		}
		return result;
	}

	private Integer code = null;
	private String message = null;

	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
