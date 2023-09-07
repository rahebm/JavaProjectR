package Class16;

public class T2 {


    String name;
    private double marks1;
    private double marks2;
    private  double marks3;
    T2 (String tName, double tMarks1, double tMarks2, double tMarks3){
    name=tName;
    marks1=tMarks1;
    marks2=tMarks2;
    marks3=tMarks3;

    }
public void printAvg(){
        double avg=0;
        avg=(marks1+marks2+marks3)/3;
    System.out.println(name+ " Got "+avg);
}

    public static void main(String[] args) {
        T2 t1 = new T2("Jamel", 84, 95, 92);
                t1.printAvg();
       T2 t2 = new T2("John", 74, 95, 98);
          t2.printAvg();
    }
}



