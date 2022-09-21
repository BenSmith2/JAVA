import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava{

        Random randMachine = new Random();
        public ArrayList<Integer> getTenRolls(){
            int i = 0;
            ArrayList<Integer> rolls = new ArrayList<Integer>();
            while(i < 10){
                rolls.add(randMachine.nextInt(20)+1);
                i++;
            }
            return rolls;
            // System.out.println(rolls);
        }
        public String getRandomLetter(){
            String[] alphabet = {"A", "B", "C", "D", "E", "F"};
            Integer i = randMachine.nextInt(6);
            return alphabet[i];
        }
        public String generatePassword(){
            String password = "";
            for (int i = 0; i < 8; i++){
                password = password + getRandomLetter();
            }
            return password;
        }
        public ArrayList<String> getNewPasswordSet(int length){
            ArrayList<String> passwordSet = new ArrayList<String>();
            for(int i = 0; i < length; i++){
                passwordSet.add(generatePassword());
            }
            return passwordSet;
    }
}