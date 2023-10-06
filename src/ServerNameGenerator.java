public class ServerNameGenerator {

    public static int getRandom(int max){return (int) (Math.random()*max); }

    public static String getRandomElement(String[] elementArray){
        int randomNum = getRandom(10);
        return elementArray[randomNum];
    }

    public static void main (String[] args){
        String[] adjective = {"Ashamed", "Adorable", "Attractive", "Beautiful", "Awful", "Aggressive", "Cruel", "Clever", "Tasty", "Jealous"};
        String[] noun = {"man", "woman", "teacher", "dog", "cat", "home", "office", "town", "countryside", "America"};

        String randomAdj = getRandomElement(adjective);
        String randomNoun = getRandomElement(noun);
        System.out.println("Here is your server name:");
        System.out.println(randomAdj + "-" + randomNoun);
    }
}
