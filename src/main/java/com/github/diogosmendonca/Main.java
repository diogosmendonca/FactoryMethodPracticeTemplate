package com.github.diogosmendonca;

public class Main{

    private static String output = null;

    public static void main(String[] args) {

        if(args != null && args.length > 0 && args[0] != null){
            
            if(args[0].equals("A")){
                AppA app = new AppA();
                output = app.specificOperation();
                System.out.println(output);
            }else if(args[0].equals("B")){
                AppB app = new AppB();
                output = app.specificOperation();
                System.out.println(output);
            }

        }
    }
    
    public static String getOutput(){
        return output;
    }


}