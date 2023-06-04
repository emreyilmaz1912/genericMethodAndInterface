public class Main {
    public static void main(String[] args) {
        //Generic Method
        String[] a = {"Java", "102", "Patika","Dev"};
        Integer[] b = {1,2,3,4};
        Character[] c = {'J','A','V','A'};

        Print.printArray(c,a,b);


        //Generic Interface
        Student<String> stu = new Student<>();
        stu.insert("ABC");
    }
}