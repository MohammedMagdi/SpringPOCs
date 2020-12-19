package com.poc.demo.utils;

import org.springframework.stereotype.Component;

import com.poc.demo.constants.CodesAndKeys;
import com.poc.demo.responses.StatusResponse;

@Component
public class Utils {

	public static String generateUniqueSequence(String channel) {
		String uniqueSequence = channel + "_" + System.currentTimeMillis() + "." + (int) (Math.random() * 5000);
		return uniqueSequence;
	}

	public static boolean isNotEmpty(Object obj) {
		return obj != null;
	}

	public static Boolean isEmptyString(String str) {
		return str == null || str.equals("");
	}

	public static StatusResponse internalServerError(String message) {
		StatusResponse error = new StatusResponse(CodesAndKeys.INTERNAL_SERVER_ERROR_CODE,
				CodesAndKeys.INTERNAL_SERVER_ERROR_KEY, message);
		return buildErrorMessage(error);
	}

	public static StatusResponse buildErrorMessage(StatusResponse response) {
		response.setMessage(response.getMessage());
		return response;
	}

}