public class CharacterArray {
    public static void main(String[] args) {
        char [] letters = new char[5];
        letters[0]='A';
        letters[1]='B';
        letters[2]='C';
        letters[3]='d';
        letters[4]='z';
        for(char val:letters){
            System.out.println(val);
        }
        for(int i=0;i<letters.length;i++){
            System.out.println("Character at index "+i+" is: "+letters[i]);
        }
    }
}
