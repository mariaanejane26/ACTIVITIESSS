package mariaane.ganda;

import java.util.Arrays;

public Week5 {
  punlic static void main(String[] args) {
       System.out.println("===FAVORITE THINGS ARRAY===");
        String[] favThings = {"GAMING", "GUITAR", "SLEEPING", "READING", "SINGING"};

   for (int i = 0; i < favThings.length; i++) {
            System.out.println((i + 1) + ". " + favThings[i]);
        }

   System.out.println("\n=== CLASS STATISTICS CALCULATOR ===");
        int[] studentScores = {91, 76, 84, 69, 98, 87, 73, 89};
        int sum = 0;
        int high = studentScores[0];
        int low = studentScores[0];

        for (int a = 0; a < studentScores.length; a++) {
            sum += studentScores[a];

            if (studentScores[a] > high) {
                high = studentScores[a];
            }

            if (studentScores[a] < low) {
                low = studentScores[a];
            }
        }

        double average = (double) sum / studentScores.length;

        System.out.println("=== SUMMARY ===");
        System.out.println("SUM OF SCORES: " + sum);
        System.out.printf("AVERAGE: %.2f%n", average);
        System.out.println("HIGHEST SCORE: " + high);
        System.out.println("LOWEST SCORE: " + low);
        System.out.println("===");


        System.out.println("\n=== LINEAR SEARCH ===");
        int target = 84;
        int foundIndex = -1;

        for (int i = 0; i < studentScores.length; i++) {
            if (studentScores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println(
                "Target " + target +
                " was found at index: " + foundIndex
            );
        } else {
            System.out.println(
                "Target " + target +
                " was not found in the array."
            );
        }


        /*
         * A copy is sorted so the original scores
         * remain in their original order.
         */
  
        int[] sortedScores =
                Arrays.copyOf(studentScores, studentScores.length);

        Arrays.sort(sortedScores);

        System.out.println("\n=== SORTED SCORES ===");
        System.out.println(
                "Original scores: " +
                Arrays.toString(studentScores)
        );
        System.out.println(
                "Sorted scores:   " +
                Arrays.toString(sortedScores)
        );


        System.out.println("\n=== CLASS RANKING SYSTEM ===");

        String[] studentNames = {
            "Kevin", "Sophia", "Marcus", "Angela", "Ryan"
        };

        int[][] rawQuizData = {
            {85, 90, 88, 92},
            {95, 93, 96, 94},
            {78, 82, 80, 85},
            {88, 86, 90, 87},
            {92, 89, 91, 90}
        };

        Student[] students = new Student[studentNames.length];

        for (int i = 0; i < students.length; i++) {
            students[i] =
                    new Student(studentNames[i], rawQuizData[i]);
        }


        // Sort students according to their average
        for (int i = 0; i < students.length - 1; i++) {

            for (int j = 0;
                 j < students.length - 1 - i;
                 j++) {

                if (students[j].getAverage()
                        < students[j + 1].getAverage()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }


        // Assign ranks
        students[0].rank = 1;

        for (int i = 1; i < students.length; i++) {

            if (students[i].getAverage()
                    == students[i - 1].getAverage()) {

                students[i].rank =
                        students[i - 1].rank;

            } else {

                students[i].rank = i + 1;
            }
        }


        // Display class ranking
        System.out.println("=========================================" );

        System.out.printf(
                "%-6s | %-12s | %-10s | %s%n",
                "Rank",
                "Name",
                "Average",
                "Quizzes"
        );

        System.out.println("=======================================");

        for (Student s : students) {

            System.out.printf(
                    "%-6d | %-12s | %-10.2f | %s%n",
                    s.rank,
                    s.name,
                    s.getAverage(),
                    Arrays.toString(s.quizzes)
            );
        }

        System.out.println("=======================================");


        // Search for a student
        String searchTargetName = "Angela";

        int studentRank =
                studentRank(students, searchTargetName);

        if (studentRank != -1) {

            System.out.println(
                    "Search Result: " +
                    searchTargetName +
                    " is ranked #" +
                    studentRank
            );

        } else {

            System.out.println(
                    "Search Result: Student \"" +
                    searchTargetName +
                    "\" not found."
            );
        }
    }


    public static int studentRank(
            Student[] list,
            String targetName) {

        for (int i = 0; i < list.length; i++) {

            if (list[i].name.equalsIgnoreCase(targetName)) {
                return list[i].rank;
            }
        }

        return -1;
    }
}


class Student {

    String name;
    int[] quizzes;
    int rank;


    public Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
    }


    public double getAverage() {

        int sum = 0;

        for (int score : quizzes) {
            sum += score;
        }

        return (double) sum / quizzes.length;
    }
}

