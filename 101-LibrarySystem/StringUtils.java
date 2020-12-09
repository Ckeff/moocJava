/*
 * @author ColeKeffel
 */
public class StringUtils {
	private String word, searched;

	public static boolean included(String word, String searched) {
		searched = searched.toLowerCase().trim();
		word = word.toLowerCase().trim();

		if(word == null || searched == null) {
			return false;
		} else if (word.contains(searched)) {
				return true;
		} else {
			return false;
		}
	}
}
