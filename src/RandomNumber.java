import java.lang.Math;

public class RandomNumber {
    private double num;

    private void generateRandNum(){
        this.num = (int)(Math.random() * 100)+1;
    }

    public void numChecker(){
        generateRandNum();
        if(num%2 == 0){
            System.out.println("The number " + num + " is even.");
        }
        else{
            System.out.println("The number " + num + " is odd.");
        }
    }
}
