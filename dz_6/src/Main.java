import java.util.*;

public class Main {
    public static void main(String[] args) {
    String [] line = new String[] { "tomato", "potato", "banana"};
    vegetables(line);

    }

    public static void vegetables (String [] words) {
        List<String> firstList = new ArrayList<>();

        for(String word : words) {
            char[] chars = word.toCharArray();

            Map<Character, Integer> firstMap = new HashMap<>();
            for(Character character: chars ){
                if(firstMap.containsKey(character)){
                    Integer value = firstMap.get(character) +1;
                    firstMap.put(character,value);
                } else{
                    firstMap.put(character,1);
                }
            }
                boolean isRight = true;
            for(Character key: firstMap.keySet()){
                if (firstMap.get(key) %2 !=0 ^ firstMap.containsValue("banana")){
                } isRight = false;

            }

            if (isRight){
                firstList.add(word);
            }

            }

        Set<Character> mySet = new HashSet<>();
        for(String word:firstList ) {
        for(Character character : word.toCharArray()){
            mySet.add(character);
        }

        }
        }
    }