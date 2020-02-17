
package Main;
import FormLetterWritter.FormLetterWritter;

public class Main {
    public static void main(String[]args){
        FormLetterWritter flw = new FormLetterWritter();
        System.out.println(flw.displaySalutation("Perez"));
        System.out.println(flw.displaySalutation("Jose", "Perez"));
    }
}
