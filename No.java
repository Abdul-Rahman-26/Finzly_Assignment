package Polymorphism;

public class No {
    void show(String s) {
    	System.out.print("String");
        }
    
    void show(Object obj) {
    	System.out.print("Object");
    }
    
    public static void main(String[] args) {
        No n = new No();
        n.show((Object)null);
}}