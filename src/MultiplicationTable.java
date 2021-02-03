public class MultiplicationTable {
    public void table(){
        for(int i = 1; i <= 10; i++){
            for(int j = 0; j <= 12; j++){
                int res = i * j;
                System.out.println(i + " * " + j + " = " + res);
            }
        }
    }
}
