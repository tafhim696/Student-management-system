
package oop;


class Student{
    
    String name,id,section,address;
    
     void read(){
           System.out.println("He is reading");
       }  
     void display(){
               
         System.out.println("Name:"+ name);
         System.out.println("ID:"+id);
         System.out.println("SECTION:"+section);
         System.out.println("ADDRESS:"+address);
     }
         
     }

public class OOP {

    public static void main(String[] args) {
        
        Student student1=new Student();
        student1.name="tafhim";
                 student1.id="338";
                          student1.section="69I";
                                   student1.address="MIRPUR";
       
          student1.read();
          student1.display();
          
           Student student2=new Student();
        student2.name="Nowshad";
                 student2.id="706";
                          student2.section="69I";
                                   student2.address="Puran dhaka";
       
          student2.read();
          student2.display();
          
          section i69= new section();
          i69.showinfo();
                
       
          
    }
    
}
