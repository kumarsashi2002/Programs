public class MadhuTM {
    public static void main(String args[]){
        char c='D';
        int key=3;
        int ascii=c;
        char ans;
        int diff;
        if(ascii>=65 && ascii<=90){
            ascii=ascii+key;
            if(ascii>90){
                diff=ascii-90;
                ascii=65+diff-1;
            }
            ans=(char)ascii;
            System.out.println(ans);
        }
        if(ascii>=97 && ascii<=122){
            ascii=c;
            ascii=ascii+key;
            if(ascii>122){
                diff=ascii-122;
                ascii=97+diff-1;
            }
            ans=(char)ascii;
            System.out.println(ans);
        }
         
    }
}
