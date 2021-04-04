/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os.pkg01;

/**
 *
 * @author MAGIC
 */
public abstract class Emp {
    
    String name,adress;
    int age;
    double salary;

    public Emp(String name, String adress, int age) {
        this.name = name;
        this.adress = adress;
        this.age = age;
    }
    public void showDetails()
    {
        System.out.println("name " + name);
    }
    
    public abstract double getSalary();
    
    
}
