/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Lab Informatika
 */
public class FrontEnd extends Web{
    public FrontEnd(String nik, String name, double writing, double coding, double interview)
    {
        super(nik,name,writing,coding,interview);
    }
    public void passing()
    {
        double total=0.5*getWriting()+0.2*getCoding()+0.3*getInterview();
        if(total>=85)
        {
            System.out.println("\nThe applicant passed the test with final score of "+total+".");
        }
        else
        {
            System.out.println("\nThe applicant failed the test with final score of "+total+".");
        }
    }
}
