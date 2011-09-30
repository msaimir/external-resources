/**
 * MediaMosa API
 *
 * A partial implementation of the MediaMosa API in Java.
 *
 * Copyright 2010 Universiteit van Amsterdam
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package nl.uva.mediamosa.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChallengeUtil {

	/**
	 * @param dbus
	 * @return challenge, String used to calculate response used in authentication mechanism
	 */
	public static String getChallenge(String dbus){
		String pattern = "<dbus>DATA vpx 0 ([a-z0-9]{32})</dbus>";
		String text = dbus;
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		if (m.find()){
			return m.group(1);
		} else {
			return null;	
		}
	}
	
}


