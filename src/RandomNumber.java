import java.lang.Math;

public class RandomNumber {
    private double num;

    private void generateRandNum(){
        this.num = (int)(Math.random() * 100)+1;
    }

    private void generateRandNumTen(){
        this.num = (int)(Math.random()*10);
    }

    public void numChecker(int state){
        if(state == 100){
            this.generateRandNum();
            if(num%2 == 0){
                System.out.println("The number " + num + " is even.");
            }
            else{
                System.out.println("The number " + num + " is odd.");
            }
        }
        else if(state == 10){
            this.generateRandNumTen();
            switch((int)num){
                case 0:
                    System.out.println(num + " zero");
                    break;
                case 1:
                    System.out.println(num + " one");
                    break;
                case 2:
                    System.out.println(num + " two");
                    break;
                case 3:
                    System.out.println(num + " three");
                    break;
                case 4:
                    System.out.println(num + " four");
                    break;
                case 5:
                    System.out.println(num + " five");
                    break;
                case 6:
                    System.out.println(num + " six");
                    break;
                case 7:
                    System.out.println(num + " seven");
                    break;
                case 8:
                    System.out.println(num + " eight");
                    break;
                case 9:
                    System.out.println(num + " nine");
            }
        }
    }

    public void tempScale(){
        this.numChecker(100);
        if(num == 0)
        {
            System.out.println("frozen");
        }
        else if(num >= 1 && num <=14)
        {
            System.out.println("cold");
        }
        else if(num >= 15 && num <=24)
        {
            System.out.println("cool");
        }
        else if(num >= 25 && num <=40)
        {
            System.out.println("warm");
        }
        else if(num >= 41 && num <=60)
        {
            System.out.println("hot");
        }
        else if(num >= 61 && num <=80)
        {
            System.out.println("very hot");
        }
        else if(num >= 81 && num <=99)
        {
            System.out.println("extremely hot");
        }
        else
        {
            System.out.println("boiling");
        }
    }
}
