import java.util.*;

public class NameMatchingLogic{
	public static List<String> createGuthValues(String input) {
		List<String> guthValues = new ArrayList<>();
		input = input.toLowerCase();
		int strlen = input.length();
		strlen = strlen - 3;

		for (int i = 0; i <= strlen; i++)
		    guthValues.add(input.substring(i, i + 3));

		return guthValues;
	}

    	public static int calculateGuthMatch(List<String> source, List<String> target) {
		int matchCount = 0;
		int totalCount = (source.size() > target.size()) ? source.size() : target.size();
		for (String sourceText : source) {
		    if (target.contains(sourceText)) {
		        matchCount++;
		    }
		}
		return (matchCount * 100) / totalCount;
	}

	public static void main(String args[]){
		System.out.println(calculateGuthMatch(createGuthValues("vijay"), createGuthValues("vijayan")));
	}
}
