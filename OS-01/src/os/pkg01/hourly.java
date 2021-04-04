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
public class hourly extends Emp implements Rules{
   private double numOfHours,rate;

    public double getNumOfHours() {
        return numOfHours;
    }

    public void setNumOfHours(double numOfHours) {
        this.numOfHours = numOfHours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public hourly(String name, String adress, int age,double num_of_hours, double rate) {
        super(name, adress, age);
        numOfHours=num_of_hours;
        this.rate=rate;
    }

    @Override
    public void showDetails() {
        System.out.println("salary " + numOfHours+companyName);

   
    }

    @Override
    public double getSalary() {
        return numOfHours*rate;
    }

    @Override
    public void displayRule() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
