public class Test {
    public int addNumber(int a,int b){
        return a+b;

    }
    public static void main(String[]args){
        Test t=new Test();
        int result=t.addNumber(5,3);
        System.out.println(result);
    }
}
