import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        PuzzleJava puzzle = new PuzzleJava();
        // puzzle.getTenRolls();
        ArrayList<Integer> rolls = puzzle.getTenRolls();
        System.out.println(rolls);
        String letter = puzzle.getRandomLetter();
        System.out.println(letter); 
        String password = puzzle.generatePassword();
        System.out.println(password);
        ArrayList<String> newPassword = puzzle.getNewPasswordSet(20);
        System.out.println(newPassword);
}
}
