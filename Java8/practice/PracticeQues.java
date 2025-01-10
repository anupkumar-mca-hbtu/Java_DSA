package Java8.practice;

import com.sun.tools.javac.Main;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
   private int age;
    private String gender;
    private String department;
   private int yearOfJoining;
   private double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Employee(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }
}

public class PracticeQues {

    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
        employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
        employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
        employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
        employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
        employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
        employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
        employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
        employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
        employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
        employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
        employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));


     /*   ==============================================
        Set - 1 : Intermediate Operations (will return Stream)
==============================================
        Filters ----> filter ( )
        Mappings ----> map ( ) & flatMap ( )
        Slicing ----> distinct ( ) & limit () & skip ( )
                ==============================================
        Set - 2 : Terminal Operations (will return result)
==============================================
        Finding ---> findFirst ( ) & findAny ( )
        Matching ---> anyMatch ( ) & allMatch ( ) & noneMatch ( )
        Collecting ---> collect ( )
        */

        // Q1. 1. How many male and female employees are there in the organization ?
        Map<String, Long> map1 =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.counting()));
        System.out.println(map1);

        // 2. Print the name of all departments in the organization ?

        List<String>dept= employeeList.stream().map(Employee::getDepartment)
                                                     .distinct()
                                                     .collect(Collectors.toList());
        System.out.println( dept);

        // 3. What is the average age of male and female employees ?

       Map<String,Double> emp= employeeList.stream()
               .collect(Collectors
                       .groupingBy(Employee :: getGender , Collectors.averagingDouble(Employee::getAge)) );
             //  .forEach(emp.containsKey() +" " + emp.containsValue());

        System.out.println(emp);
//        logger.info(emp.toString());
//        try (FileWriter writer = new FileWriter("output.txt")) {
//            writer.write(emp.toString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // 4. Get the details of highest paid employee in the organization ?
       Optional<Employee> optional =employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary));

        Employee empl = optional.get();
        System.out.println(empl.toString());


        // 5. Get the names of all employees who have joined after 2015 ?

        employeeList.stream()
                .filter(e -> (e.getYearOfJoining()>2015))
                .map(Employee::getName)
                .forEach(System.out::println);

          // 6. Count the number of employees in each department ?

       Map<String,Long> mp= employeeList.stream().collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.counting()));
          System.out.println(mp);

          // 7. What is the average salary of each department ?


    }
}
