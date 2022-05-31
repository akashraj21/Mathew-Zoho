import java.io.*;
import java.util.*;
import java.util.Scanner;

public class resultparthi {
    static void copy() throws IOException {
//        File RT=new File("D:RM1.txt");
//        RT.createNewFile();
//        BufferedWriter WR=new BufferedWriter(new FileWriter("D:RM1.txt",true));
//        BufferedReader RR=new BufferedReader(new FileReader("D:temp1.txt"));
//        int j;
//        String Str="";
//        while((j=RR.read())!=-1){
//            if(j!=10) {
//                Str = Str + (char) j;
//            }else{
//                WR.append(Str+"\n");
//            }
//        }
//        RR.close();
//        WR.close();
        File Ft=new File("D:Temp.txt");
        File Rt=new File("D:RM.txt");
        boolean i=Rt.renameTo(Ft);
        System.out.println(i);
    }
    static void add() throws IOException {
        BufferedWriter Wr = new BufferedWriter(new FileWriter("D:RM.txt",true));
        int size;
        System.out.print("\nEnter the Number Of Students : ");
        Scanner input=new Scanner(System.in);
        size=input.nextInt();
        int i=0;
        Scanner in=new Scanner(System.in);
        while(i<size){
            String Name;
            String R_No;
            String MArk1;
            String MArk2;
            String MArk3;
            System.out.print("\nEnter the Student NAme : ");
            Name=in.nextLine();
            System.out.print("\nENter the Roll Number : ");
            R_No=in.nextLine();
            System.out.print("\nEnter the MArk1 : ");
            MArk1=in.nextLine();
            System.out.print("\nEnter the MArk2 : ");
            MArk2=in.nextLine();
            System.out.print("\nEnter the MArk3 : ");
            MArk3=in.nextLine();
            String S=Name+" "+R_No+" "+MArk1+" "+MArk2+" "+MArk3+"\n";
            Wr.append(S);
            i=i+1;
        }
        Wr.close();
        System.out.println("Added SuccessFully");
    }
    static void Display() throws IOException {
        BufferedReader Rr=new BufferedReader(new FileReader("D:RM.txt"));
        int i;
        String S="";
        while((i=(Rr.read()))!=-1){
            if(i!=10) {
                S = S + (char) i;
            }
            else{
                System.out.println(S);
                S="";
            }
        }
        Rr.close();
    }
    static void update() throws IOException {
        File Tf=new File("Temp.txt");
        Tf.createNewFile();
        BufferedWriter Wr=new BufferedWriter(new FileWriter("D:Temp.txt",true));
        BufferedReader Rr=new BufferedReader(new FileReader("D:RM.txt"));
        int i;
        String S="";
        String R_No;
        Scanner in=new Scanner(System.in);
        System.out.print("\nENter the Roll Number : ");
        R_No=in.nextLine();
        int check=0;
        while((i=Rr.read())!=-1){
            if(i!=10) {
                S = S + (char) i;
            }
            else{
                String[] arr=S.split(" ");
                if(arr[0].equals(R_No)){
                    check=check+1;
                    int n;
                    Scanner in1=new Scanner(System.in);
                    System.out.print("\nEnter the Subject You Want Update : ");
                    n=in1.nextInt();
                    System.out.print("\nENter the Mark : ");
                    arr[1+n]=in.nextLine();
                    String S1=arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+"\n";
                    Wr.append(S1);
                    S="";
                }
                else{
                    Wr.append(S+"\n");
                    S="";
                }
            }
        }
        Wr.close();
        Rr.close();
        if(check==0){
            File Ft=new File("D:Temp.txt");
            Ft.deleteOnExit();
            System.out.println("\nData Not Found");
        }
        else{
            File Ft=new File("D:RM.txt");
            Ft.deleteOnExit();
            copy();
            System.out.println("\nUpdated Successfully");
        }
    }
    public static void main(String[] args) throws IOException {
//        copy();
        update();
//        File Tf=new File("D:temp1.txt");
//        Tf.createNewFile();
//        BufferedWriter Wr=new BufferedWriter(new FileWriter("D:temp1.txt",true));
//        BufferedReader Rr=new BufferedReader(new FileReader("D:RM.txt"));
//        int i;
//        String S="";
//        String R_No;
//        Scanner in=new Scanner(System.in);
//        System.out.print("\nENter the Roll Number : ");
//        R_No=in.nextLine();
//        int check=0;
//        while((i=Rr.read())!=-1){
//            if(i!=10) {
//                S = S + (char) i;
//            }
//            else{
//                String[] arr=S.split(" ");
//                if(!(arr[0].equals(R_No))){
//                    check=check+1;
//                    Wr.append(S+"\n");
//                }
//                S="";
//            }
//
//        }
//        Wr.close();
//        Rr.close();
//        if(check==0){
//            File f=new File("D:temp1.txt");
//            f.deleteOnExit();
//            System.out.println("\nData Not Found");
//        }
//        else{
//            File f=new File("D:temp1.txt");
//            File t=new File("D:RM.txt");
//            File T=new File("D:RM.txt");
//            t.deleteOnExit();
//            f.renameTo(T);
//            System.out.println("\nDeleted Successfully");
//        }
    }
}