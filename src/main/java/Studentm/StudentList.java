package Studentm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class StudentList {
	private List<Student> StudentList;                //Student class

    public StudentList(List<Student> StudentList) {
        this.StudentList = StudentList;
    }
        public void display(){
            int i=1;
            for(Student Student:this.StudentList){
                System.out.println("Student"+i+" ::: id: "+Student.getId()+" name: "+Student.getName()+" purchaseAmount: "+Student.getpurchaseAmount()+" age: "+Student.getAge());
                i++;
            }
        }
        //comparator
        public void sort(){
            Collections.sort(this.StudentList,new Comparator<Student>() { 
                @Override
                public int compare(Student Student1, Student Student2) {
                    return Student1.getName().compareTo(Student2.getName());
                }
            });
        }
       // to update the field using Id
        public boolean update(int id, int purchaseAmount) {
            boolean flag=false;
            for(Student Student:this.StudentList){
                if(Student.getId()==id){
                    flag=true;
                    Student.setpurchaseAmount(purchaseAmount);
                }
            }
            return flag;
        
    
    }

}


