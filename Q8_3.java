/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sheet2;

import java.util.Arrays;
public class Q8_3 {
    public static void main(String[] args) {
        // Each row represents a student’s answers
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        // Key with correct answers
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Array to store student scores: [studentIndex, score]
        int[][] studentScores = new int[answers.length][2];

        // Grade each student
        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }
            studentScores[i][0] = i;          // student index
            studentScores[i][1] = correctCount; // score
        }

        // Sort by score (increasing order)
        Arrays.sort(studentScores, (a, b) -> Integer.compare(a[1], b[1]));

        // Display results
        System.out.println("Students sorted by their number of correct answers:");
        for (int i = 0; i < studentScores.length; i++) {
            System.out.println("Student " + studentScores[i][0] + 
                               "'s correct count is " + studentScores[i][1]);
        }
    }
}
