package fr.dawan.cfa2022.tools;

import java.util.HashMap;
import java.util.Map;

public class TokenSaver {

	// email/token
	public static Map<String, String> tokensByEmail;

	static {
		tokensByEmail = new HashMap<String, String>();
	}
}