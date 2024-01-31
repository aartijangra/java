import java.util.*;
public class Adult {

    void display(int n){
        if(n<18){
            System.out.println("you are under 18.");
        }
        else{
            System.out.println("you are Adult.");
        }

    }
    public static void main(String args[]){
        Adult a = new Adult();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age: ");
        int n = sc.nextInt();

        a.display(n);
    }
}
