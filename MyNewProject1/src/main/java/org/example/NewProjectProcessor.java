package org.example;

public class NewProjectProcessor {
    public static void main(String[] args){
        for(int i = 0; i <= 100; i++){
            System.out.println(convert(i));
        }
    }
    public static String convert(int newNum){
        if(newNum % 15 == 0){
            return "NewProject";
        }
        if(newNum % 3 == 0){
            return "New";
        }
        if(newNum % 5 == 0){
            return "Project";
        }
        return String.valueOf(newNum);
    }
}
