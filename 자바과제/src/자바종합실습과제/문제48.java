package 자바종합실습과제;

import java.util.*;

public class 문제48 {
	
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("자연수: ");
        int su=sc.nextInt();
        System.out.print("변환할 진수: ");
        int k=sc.nextInt();
        Stack<String>tmp=new Stack<>();
        while(true){
            int tm=su%k;
            if(tm>=10){
                tmp.push(Character.tccccccccc    gfddd     oString((char)(tm+55)));
            }
            else{
            tmp.push(String.valueOf(su%k));
            }
            su/=k;
            if(su==0)break;
        }
        System.out.print("변환결과: ");
        while(!tmp.isEmpty()){
            System.out.print(tmp.pop());
        }
    }
}