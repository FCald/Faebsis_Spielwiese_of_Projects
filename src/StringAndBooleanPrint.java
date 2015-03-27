public class StringAndBooleanPrint {

	public static void main(String[] args) {

		/*
		 * macht einen literal-Pool, dieser ist an einem speziellen Ort
		 * abgespeichert und wird immer zuerst überprüft. "new String" und
		 * ".substring" werden nicht beachtet (= geben immer ein neues Objekt)
		 */
		String str1 = "abc";
		String str2 = str1;

		System.out.println(str1 == str2);
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str1 = str2: " + str1 == str2);
		/*
		 * Verwirrt Eclipse/Java, kann String nicht mit Boolean verbinden (connectinaten),
		 * wenn etwas im println nicht so geht wie man es erwartet, mit Klammern versuchen
		 */
		System.out.println("str1 = str2: " + (str1 == str2));

	}

}
