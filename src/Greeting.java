public class Greeting {
    private String greeting = "";
    private String target = "";

    public void setGreetngs(String greeting){
        this.greeting = greeting;
    }
    public void setTarget(String target){
        this.target = target;
    }

    public String greet(){
        return greeting + " " + target;
    }

    public String greet(String whoToGreet){
        return greeting + " " + whoToGreet;
    }

}
