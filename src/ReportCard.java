public class ReportCard {

    String studentName;

    /**
     * Description of a method
     */

    public static char convertGrades(int testResult) {

        char grade;

        if(testResult >= 90) {
            grade = 'A';
        } else if (testResult >= 80 && testResult < 90) {
            grade = 'B';
        } else if (testResult >= 70 && testResult < 80) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        //method has to return
        return grade;
    }


    public void printSalutation(char grade) {
        String salutation;

        switch(grade) {
            case 'A':
              salutation = "Excellent job";
              break;
            case 'B':
                salutation = "Good job";
                break;
            case 'C':
                salutation = "Need to work more";
                break;
            case 'D':
                salutation = "Change your attitude!";
                break;
            default:
                salutation = "Don't even know what to say";
                break;
        }

        System.out.println(salutation);
    }

    public static void main(String[] args) {
        ReportCard rc = new ReportCard();

        char yourGrade = rc.convertGrades(88);
        //char yourGrade = ReportCard.convertGrades(88);
        System.out.println("Your first grade is " + yourGrade);
        rc.printSalutation(yourGrade);

        yourGrade = rc.convertGrades(79);
        System.out.println("Your second grade is " + yourGrade);
        rc.printSalutation(yourGrade);
    }
}
