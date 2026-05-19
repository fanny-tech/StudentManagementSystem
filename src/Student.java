public class Student{
    String name;
    int marks;

    void showDetails(){
        System.out.println("NAME:"+ name);
        System.out.println("MARKS:"+marks);

    }
    public static void main(String[]args){
        Student s1=new Student();
        s1.name="fanny";
        s1.marks=56;

        s1.showDetails();

    }
}