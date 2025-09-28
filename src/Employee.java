import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int salary;
    private String dept;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee(String name, int salary, String dept){
       this.name =name;
       this.salary =salary;
       this.dept = dept;
   }
    public static void main(String args[]){
        List<Employee> emplist =new ArrayList<Employee>();
        emplist.add(new Employee("charan",12000,"IT"));
        emplist.add(new Employee("vignesh",15000,"IT"));
        emplist.add(new Employee("charan",23000,"IT2"));
        emplist.add(new Employee("sunny",21000,"IT2"));

        Map<String, Optional<Employee>>map =emplist.stream().collect(
                Collectors.groupingBy((emp)->emp.getDept(),
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                        ));





        for(Map.Entry<String,Optional<Employee>> m: map.entrySet()){
            System.out.print(m.getKey()+ " "+m.getValue());
        }

    }
}
