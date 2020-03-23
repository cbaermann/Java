public class PuzzlingTest {
    public static void main(String[] args) {
        Puzzling testData = new Puzzling();

        int[] testArr = {3,5,1,2,7,9,8,13,25,32};
        
        String[] testNames = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishiwaka"};

        String[] abcString = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        // testData.sumAndGreaterThan10(testArr);
        // testData.shuffleNames(testNames);
        testData.shuffleABC(abcString);
    }
}