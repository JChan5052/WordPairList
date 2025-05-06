public class Main{
    public static void main(String[] args){
String[] list1={"Hello?","is","anyone","there?","Oh,","hi!","is","is"};
WordPairList test1=new WordPairList(list1);
System.out.println(test1);
System.out.println(test1.numMatches());
    }
}