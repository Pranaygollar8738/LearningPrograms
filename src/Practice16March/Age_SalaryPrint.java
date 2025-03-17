package Practice16March;

public class Age_SalaryPrint {

    //Take a user input - Name, Age and Salary and print them in the end.
    public static void main(String[] args) {

        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);

        System.out.println(name +  " " +  age + " " + salary);

    }
}
