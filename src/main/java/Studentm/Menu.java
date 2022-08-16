package Studentm;
import java.util.*;
public class Menu {
	public static void main(String[] args) {
    	//adding values to ArrayList
        List<Student> StudentList=new ArrayList<>();
        StudentList.add(new Student(1,"Shefali",20000,17));
        StudentList.add(new Student(2,"Bunny",40000,35));
        StudentList.add(new Student(3,"Mayank",60000,20));
        StudentList.add(new Student(4,"Dimple",40000,24));
        StudentList.add(new Student(5,"Rama",70000,29));
        StudentList.add(new Student(6,"Rajesh",180000,26));
        StudentList.add(new Student(7,"Giresh",30000,22));
        StudentList.add(new Student(8,"Heena",20000,28));
        StudentList.add(new Student(9,"Ishita",50000,21));
        StudentList.add(new Student(10,"Shilpa",120000,30));
        
        StudentList StudentList1 = new StudentList(StudentList);
        System.out.println("Enter key");
        Scanner s=new Scanner(System.in);
        int key=s.nextInt();
         //switch case
        switch (key){
            case 1: //Press 1 will display all the record
                
                StudentList1.sort();
                StudentList1.display();
                break;
            case 2: //Press 2 will update the Student if Id is present in record else it will pass the message inavlid id
                System.out.println("Enter Student id");
                int id = s.nextInt();
                System.out.println("Enter Student updated purchaseAmount");
                int purchaseAmount = s.nextInt();
                if(StudentList1.update(id,purchaseAmount)){
                    StudentList1.display();
                }
                else{
                    System.out.println("Invalid id provided");
                    
                }
                break;
            case 3:
                break;
        }
    }
}



