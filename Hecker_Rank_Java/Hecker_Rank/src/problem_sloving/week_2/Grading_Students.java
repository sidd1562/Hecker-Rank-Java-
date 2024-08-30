package problem_sloving.week_2;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grading_Students {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        int rem;

        for (int i=0; i<grades.size(); i++){
            if (grades.get(i) % 5 != 0) {
                rem = grades.get(i) % 5;
                if (5-rem <3 && grades.get(i) > 37)
                    grades.set(i, grades.get(i) + (5-rem));
            }
        }

        return grades;

                                 // or
// List<Integer> arr = new ArrayList<>();

        // for(int i = 0; i<grades.size(); i++){

        //     int x = grades.get(i);
        //     int rem = x%5;

        //     if(x>37 && ((x+5)-rem)-x<3 ){

        //         arr.add((x+5)-rem);
        //     }else{
        //         arr.add(x);
        //     }

        // }

        // return arr;

    }

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int nSiswa;

        nSiswa = input.nextInt();
        List<Integer> nilaiSiswa = new ArrayList<Integer>(nSiswa);

        for (int i=0; i<nSiswa; i++){
            int nilai;
            nilai = input.nextInt();
            nilaiSiswa.add(nilai);
        }


        List<Integer> hasil = new ArrayList<Integer>(nSiswa);
        hasil = gradingStudents(nilaiSiswa);

        for (int i=0; i<hasil.size(); i++){
            System.out.println(hasil.get(i));
        }
    }
}