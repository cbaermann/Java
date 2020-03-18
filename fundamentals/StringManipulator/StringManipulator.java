public class StringManipulator {
    public String trimAndConcat(String str1, String str2){
        String newStr = str1.trim() + str2.trim();
        return newStr;
    }

    public Integer getIndexOrNull(String someStr, char someChar) {
        Integer value = someStr.indexOf(someChar);
        return value;
    }

    public Integer getIndexOrNull(String str3, String str4) {
        Integer value = str3.indexOf(str4);
        return value;
    }

    public String concatSubstring(String mainString, int int1, int int2, String subString) {
        String newString = mainString.substring(int1, int2);
        String finalString = newString + subString;
        return finalString;

    }
}