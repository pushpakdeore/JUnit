package org.example;

public class Service {
    public String getName(int num){
        if(num<0){
            return "a";
        } else if (num==0) {
            return "c";
        }else {
            return "b";
        }
    }
}
