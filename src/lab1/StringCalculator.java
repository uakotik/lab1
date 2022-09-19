package lab1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringCalculator {
    String delimiter="\\r?\\n ,";
    int add(String numbers){
        int sum=0,a,b,indx;
        int[] ar={};
        if(numbers.substring(0,2).equals("//")) {
            indx=numbers.indexOf(']');
            delimiter=delimiter+numbers.substring(2,indx+1);
            updateDelimiters(delimiter);
            numbers=numbers.substring(indx+1);
            while(numbers.charAt(0)=='['){
                int indx2;
                indx2=numbers.indexOf(']');
                delimiter=delimiter+numbers.substring(0,indx2+1)+"|";
                updateDelimiters(delimiter);
                numbers=numbers.substring(indx2+1);
            }
        }
        StringTokenizer tokens=new StringTokenizer(numbers,delimiter);
        while(tokens.hasMoreTokens()){
            String tok=tokens.nextToken();
            if (tok.equals(""))  System.out.println(1);
            a = Integer.parseInt(tok);
            if (a==0) break;
            if(a<0){
                b=Integer.parseInt(tok);
                ar=addnumb(ar,b);
            } else if (a>1000) {
                sum+=0;
            }
            else{
                sum += a;
            }
        }
        if (ar.length>0) {
            System.out.print("Недозволені від'ємні числа: ");
            for (int i = 0; i < ar.length; i++) {
                System.out.print(ar[i] + " ");
            }
        }
        System.out.println("");
        return sum;
        }

        private void updateDelimiters(String str) {
        delimiter=str.replace("[","");
        delimiter=delimiter.replace("]","");
        }
        static int[] addnumb(int[] numb,int a){
            int[] addnum=new int[numb.length+1];
            for(int i=0;i<numb.length;i++){
                addnum[i]=numb[i];
            }
            addnum[addnum.length-1]=a;
            return addnum;
        }
}
