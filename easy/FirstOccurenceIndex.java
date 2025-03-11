public class FirstOccurenceIndex {

    static int getFirstOrrurenceIndex(String haystack, String needle) {
        int index = -1;
        int counter = haystack.length() - needle.length();
        int i = 0;
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        while (i <= counter) {
            index = num;
            for (int num = i; num <= i + needleArray.length - 1; num++) {
                if (haystackArray[num] != needleArray[num]) {
                    i = num;
                    break;
                } else {

                }
            }

        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println("first occurence is  : " + getFirstOrrurenceIndex("leetcodeoleet", "leet"));
    }
}
