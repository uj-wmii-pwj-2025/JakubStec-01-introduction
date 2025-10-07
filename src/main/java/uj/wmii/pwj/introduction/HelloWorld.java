package uj.wmii.pwj.introduction;

public class HelloWorld {
    public static void main(String[] args) {
        if(args.length > 0) {
            for(String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No input parameters provided");
        }
    }
}
