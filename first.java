
// every java programe inside the class
// class name should be same as file name
import java.lang.*; // lang is package = language package

// public = means we can access outside of the class
// we can not use class without creating object 
//  if we want to use class without creating object
//  then we have specify "static" {eg : java first}
// we cannot make static then jvm cannot find main then it can give error 
//  String args[] = command line arguments 
public class first {
    public static void main(String arg[]) {
        // println is method
        // System = class , out = object
        System.out.println("Hello World");
        // we have to pass command arg to print
        System.out.println(arg[0] + " " + arg[1]);
    }
}