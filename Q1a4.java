// Write a java code to create user define size vector and store some values till user
// wants or vector is not full and display vector elements.

// ishita mittal
// 19105121

import java.util.*;
public class Q1a4 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("enter the size for the vector");
        size = sc.nextInt();//ask size from user 

        Vector vec = new Vector(size);//user defined vector
        System.out.println("enter the numbers in vector. if you donot want to store the numbers anymore, hit -1");
        int firstNumber;
        int increment = 1;
        while(increment <=size){//add items upto size
            
            firstNumber = sc.nextInt();
            if(firstNumber == -1){//if it is -1 then stop on user's descretion
                break;
            }
            vec.addElement(firstNumber);
            increment+=1;
        }

        System.out.println("Contents of the vector are: ");
        for(int i=0; i<vec.size(); i++){//display elements
            System.out.println(vec.elementAt(i));
        }

    }
}
