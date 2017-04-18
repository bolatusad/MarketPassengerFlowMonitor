package com.xupt.internetplus.eunm;

public enum CameraEnum {

	ONE(0, "第一个摄像头"),

	TWO(1, "第二个摄像头"),

	THREE(2, "第三个摄像头");

	private CameraEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public static CameraEnum getEnum(Integer code) {
		for (CameraEnum enumValue : CameraEnum.values()) {
			if (enumValue.getCode().equals(code))
				return enumValue;
		}
		return null;
	}

	public static Integer[] getCodes() {
		CameraEnum[] values = CameraEnum.values();
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
