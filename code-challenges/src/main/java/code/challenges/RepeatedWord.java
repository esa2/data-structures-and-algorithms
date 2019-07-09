package code.challenges;

public class RepeatedWord {

    int[] hashArray = new int[1024];

    public String didItCollide(String str) {
        String[] wordArray = str.split(" ");

        for (String ele : wordArray) {
            String word = ele.toLowerCase().replace(",", "").replace(".", "");
            int index = hash(word);

            if (hashArray[index] == 0) {
                hashArray[index] = 1;
            } else {
                return word;
            }
        }
        return "No repeated words found";
    }

    private int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();

        for (int i = 0; i < letters.length; i++) hashValue += letters[i];

        hashValue = (hashValue * 599) % hashArray.length;
        return hashValue;
    }
}
