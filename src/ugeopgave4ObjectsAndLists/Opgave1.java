package ugeopgave4ObjectsAndLists;

public class Opgave1 {

    //Opgave 1
    class Student {
        String name;
        int age;
        int studentID;

        Student(String name, int age, int studentID) {
            this.name = name;
            this.age = age;
            this.studentID = studentID;
        }

        void printInfo() {
            System.out.println("\nStudent name: " + name);
            System.out.println("Student age: " + age);
            System.out.println("Student ID: " + studentID);
        }
    }

    void main() {

        //Opgave 1
        Student student1 = new Student("Benny Jamz", 20, 1);
        Student student2 = new Student("Benny Branco", 27, 2);
        Student student3 = new Student("Henrik Jamal", 25, 3);

        Student[] allStudents = {student1, student2, student3};

        for (Student list : allStudents) {
            list.printInfo();
        }

        Student oldest = getOldestStudent(allStudents);
        System.out.println("\nThe oldest on the list is: ");
        oldest.printInfo();


        findStudentByID(allStudents, 3);
    }


    //Opgave 1
    Student getOldestStudent(Student[] studentList) {
        Student oldest = studentList[0];
        for (Student list : studentList) {

            if (list.age > oldest.age) {
                oldest = list;
            }

        }
        return oldest;
    }

    void findStudentByID(Student[] student, int id) {
        Student idMatch;

        for (Student list : student) {
            if (list.studentID == id) {
                idMatch = list;
                System.out.println("\nStudent found with ID: " + id);
                idMatch.printInfo();
            }
        }

    }
}

