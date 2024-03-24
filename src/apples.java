
//inputs are number of apples and number of childrens
//to find how many appples will be left in the basket is they are evenly disrtibutes


import java.util.*;
public class apples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ap=sc.nextInt();
        System.out.println(ap%n);
    }
}


