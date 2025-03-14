public class GradingSystem {

//    A: 90-100
//    B: 80-89
//    C: 70-79
//    D: 60-69
//    F: 0-59
public static void main(String[] args) {
    int x = 85;
    if (x>=90 && x<=100) {
        System.out.println("Candidate passed with grade A");
    }
    else if (x>=80 && x<=89) {
        System.out.println("Candidate passed with grade B");
    }
    else if (x>=70 && x<=79) {
        System.out.println("Candidate passed with grade C");
    }
    else if (x>=60 && x<=69) {
        System.out.println("Candidate passed with grade D");
    } else {
        System.out.println("Candidate passed with grade F");
    }

}

}
