/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.util.Scanner;
/**
 *
 * @author Lab Informatika
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char option,edit;
        do
        {
            System.out.println("Menu");
            System.out.println("1. Android Development");
            System.out.println("2. Web Development");
            System.out.println("0. Exit");
            System.out.print("Choose : ");
            int menu=input.nextInt();
            if(menu==1)
            {
                System.out.println("\nAndroid Development\n");
                System.out.print("NIK       : ");
                String nik=input.next();
                System.out.print("Name      : ");
                String name=input.next();
                System.out.print("Writing   : ");
                double w=input.nextDouble();
                System.out.print("Coding    : ");
                double c=input.nextDouble();
                System.out.print("Interview : ");
                double i=input.nextDouble();
                Android x=new Android(nik,name,w,c,i);
                do
                {
                    System.out.print("\nEdit data? (y/n) : ");
                    edit=input.next().charAt(0);
                    if(edit=='y'||edit=='Y')
                    {
                        System.out.println("\nEdit Data");
                        System.out.println("1. Writing");
                        System.out.println("2. Coding");
                        System.out.println("3. Interview");
                        System.out.print("Choose : ");
                        menu=input.nextInt();
                        if(menu==1)
                        {
                            System.out.print("\nWriting   : ");
                            w=input.nextDouble();
                            x.setWriting(w);
                        }
                        else if(menu==2)
                        {
                            System.out.print("\nCoding    : ");
                            c=input.nextDouble();
                            x.setCoding(c);
                        }
                        else if(menu==3)
                        {
                            System.out.print("\nInterview : ");
                            i=input.nextDouble();
                            x.setInterview(i);
                        }
                        else
                        {
                            System.out.println("\nMenu doesn't exist!");
                        }
                    }
                }
                while(edit=='y'||edit=='Y');
                System.out.println("\nFinal Data");
                System.out.println("NIK       : "+x.nik);
                System.out.println("Name      : "+x.name);
                System.out.println("Writing   : "+x.getWriting());
                System.out.println("Coding    : "+x.getCoding());
                System.out.println("Interview : "+x.getInterview());
                x.passing();
            }
            else if(menu==2)
            {
                System.out.println("\nWeb Development");
                System.out.println("1. Front-End");
                System.out.println("2. Back-End");
                System.out.print("Choose : ");
                menu=input.nextInt();
                if(menu==1||menu==2)
                {
                    System.out.print("\nNIK       : ");
                    String nik=input.next();
                    System.out.print("Name      : ");
                    String name=input.next();
                    System.out.print("Writing   : ");
                    double w=input.nextDouble();
                    System.out.print("Coding    : ");
                    double c=input.nextDouble();
                    System.out.print("Interview : ");
                    double i=input.nextDouble();
                    if(menu==1)
                    {
                        FrontEnd y=new FrontEnd(nik,name,w,c,i);
                        do
                        {
                            System.out.print("\nEdit data? (y/n) : ");
                            edit=input.next().charAt(0);
                            if(edit=='y'||edit=='Y')
                            {
                                System.out.println("\nEdit Data");
                                System.out.println("1. Writing");
                                System.out.println("2. Coding");
                                System.out.println("3. Interview");
                                System.out.print("Choose : ");
                                menu=input.nextInt();
                                if(menu==1)
                                {
                                    System.out.print("\nWriting   : ");
                                    w=input.nextDouble();
                                    y.setWriting(w);
                                }
                                else if(menu==2)
                                {
                                    System.out.print("\nCoding    : ");
                                    c=input.nextDouble();
                                    y.setCoding(c);
                                }
                                else if(menu==3)
                                {
                                    System.out.print("\nInterview : ");
                                    i=input.nextDouble();
                                    y.setInterview(i);
                                }
                                else
                                {
                                    System.out.println("\nMenu doesn't exist!");
                                }
                            }
                        }
                        while(edit=='y'||edit=='Y');
                        System.out.println("\nFinal Data");
                        System.out.println("NIK       : "+y.nik);
                        System.out.println("Name      : "+y.name);
                        System.out.println("Writing   : "+y.getWriting());
                        System.out.println("Coding    : "+y.getCoding());
                        System.out.println("Interview : "+y.getInterview());
                        y.passing();
                    }
                    
                    else if(menu==2)
                    {
                        BackEnd z=new BackEnd(nik,name,w,c,i);
                        do
                        {
                            System.out.print("\nEdit data? (y/n) : ");
                            edit=input.next().charAt(0);
                            if(edit=='y'||edit=='Y')
                            {
                                System.out.println("\nEdit Data");
                                System.out.println("1. Writing");
                                System.out.println("2. Coding");
                                System.out.println("3. Interview");
                                System.out.print("Choose : ");
                                menu=input.nextInt();
                                if(menu==1)
                                {
                                    System.out.print("\nWriting   : ");
                                    w=input.nextDouble();
                                    z.setWriting(w);
                                }
                                else if(menu==2)
                                {
                                    System.out.print("\nCoding    : ");
                                    c=input.nextDouble();
                                    z.setCoding(c);
                                }
                                else if(menu==3)
                                {
                                    System.out.print("\nInterview : ");
                                    i=input.nextDouble();
                                    z.setInterview(i);
                                }
                                else
                                {
                                    System.out.println("\nMenu doesn't exist!");
                                }
                            }
                        }
                        while(edit=='y'||edit=='Y');
                        System.out.println("\nFinal Data");
                        System.out.println("NIK       : "+z.nik);
                        System.out.println("Name      : "+z.name);
                        System.out.println("Writing   : "+z.getWriting());
                        System.out.println("Coding    : "+z.getCoding());
                        System.out.println("Interview : "+z.getInterview());
                        z.passing();
                    }
                }
                else
                {
                    System.out.println("\nMenu doesn't exist!");
                }
            }
            else if(menu==0)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("\nMenu doesn't exist!");
            }
            System.out.print("\nBack to menu? (y/n) : ");
            option=input.next().charAt(0);
            System.out.println("\n====================================\n");
        }
        while(option=='y' || option=='Y');
    }
    
}
