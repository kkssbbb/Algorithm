import java.util.*;

public class Main{


    public static void main(String[] args){
        List<Student> students = Arrays.asList(
        new Student("cim", 90), new Student("dee", 90), new Student("aark", 80)
        );
        
        students.sort((o1,o2)->{
            if(o1.name != o2.name){return o1.name.compareTo(o2.name);}
            return o2.score - o1.score; 
        });

        for(Student s : students){
            System.out.println(s);
        }
    }
    

    static class Student {
        //Comparable 객체를 정렬할때 정렬 기준을 정할 수 있게 해주는 인터페이스
        //compareTo() 두 객체 비교
        //점수 내림차순, 이름 오름차순
        String name; int score;
        Student(String n, int s){this.name = n;this.score = s;}

        @Override
        public String toString() {
            return "name:" + this.name + ", score:" + this.score;
        }
    }


}