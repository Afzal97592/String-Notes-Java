package com.afzal;

public class stringPractice {
    public static void main(String[] args) {
        String name = "Afzal";

        System.out.println(name.charAt(4));
        System.out.println(name.length());
        for(int i =0;i<name.length();i++){
            if(i%2==0){
                System.out.println(name.charAt(i));
            }
        }
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,4)); // second parameter is the length of string



        // java String Contains
        System.out.println(name.contains("al"));
        // Or
        boolean iscontain = name.contains("Afz");
        boolean iscontain2 = name.contains("afz");
        System.out.println(iscontain);
        System.out.println(iscontain2);



        // ## string>joinMethod()
        String name2 = String.join("-","Afzal","Ahmad","kamalpur");
        String name3 = String.join("/","12","06","2021");
        String name4 = String.join(":","12","10","50");
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name2);




        // check string equal or unequal
        String str1 = "Afzal";
        String str2 = "Afzal";
        String str3 = "Ahmad";
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));



        // string isEmpty()
        String str4 = "";
        String str5 = "Afzal";
        System.out.println(str4.isEmpty());
        System.out.println(str5.isEmpty());




        // string Concat
        String str6 = "Afzal";
        System.out.println(str6.concat(" Ahmad Kamalpur Fatehabad Kunderki Moreadaba "));



        // string.replace('a','b')
        // first parameter replace digit second what u want to give the replace place
        String S1 = "afzal ahmad";
        System.out.println(S1.replace('a','p'));




        // equalsIgnorcase()
     String s1 = "Afzal";
     String s2 = "AFZAL";
        System.out.println(s1.equalsIgnoreCase(s2));


        // string.split();

        String s3 = "java string split method by javatpoint";
        String[] words = s3.split("\\s"); // split the sring based on whitespace
      // using java for each loop to print element
        for(String w:words){
            System.out.println(w);
        }



        // string.intern();

        String s4 = new String("hello");
        String s5 = "hello";
        String s6 = s4.intern(); // return string from pool it will be same as s5
        System.out.println(s4==s5);//false bcz reference variable pointing to different instance
        System.out.println(s5==s6);// true bcz reference variable pointing to same instance



        // indexOf();
        String s9="this is index of example";
//passing substring
        int index1=s9.indexOf("is");//returns the index of is substring
        int index2=s9.indexOf("index");//returns the index of index substring
        System.out.println(index1+"  "+index2);//2 8

//passing substring with from index
        int index3=s9.indexOf("is",4);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is

//passing char value
        int index4=s9.indexOf('s');//returns the index of s char value
        System.out.println(index4);//3



        // string.toLowerCase();
        String afz = "AFZAL AHMAD";
        System.out.println(afz.toLowerCase());



        // string.toUpperCase();
        String afz1 = "afzal ahmad kamalpur";
        System.out.println(afz1.toUpperCase());


        // string.trim(); remove the white spaces
        String afz2 = " Afzal ";
        System.out.println(afz2+"Ahmad");
        System.out.println(afz2.trim()+"Ahmad");
    }
}
