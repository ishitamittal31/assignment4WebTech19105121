import java.util.Vector;

// Write a program that would print the information (name, year of joining, salary,
// address) of three employees by creating a class named Employee. The output should
// be as follows:


 class Employee{//made class employee
    
        String name;//three data variables
        int year;
        String address;
    
        Employee(String name, int year, String address){//parameterized constructor

            this.name = name;
            this.year = year;
            this.address = address;

        }
}

 class Q2a4 {
    public static void main(String args[]){

        Employee e1 = new Employee("Robert", 1994, "64C- WallsStreat");//making of objects with values
        Employee e2 = new Employee("Sam", 2000, "68D- WallsStreat");
        Employee e3 = new Employee("John", 1999, "26B- WallsStreat");
        
        System.out.println("Name    Year of joining     Address");
        
        System.out.println(e1.name + "  " + e1.year + "     " + e1.address);//display
        System.out.println(e2.name + "  " + e2.year + "     " + e2.address);
        System.out.println(e3.name + "  " + e3.year + "     " + e3.address);

    }
}
