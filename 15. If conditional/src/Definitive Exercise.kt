/**
 * You are designing a grading system for school exams. The total for an exam is 100 points, and you need to convert that into a grade A to F.
Design a program that reads in a number that represents a student’s grade, from 1 to 100 and prints out a grade.

A -> 90 to 100
B -> 80 to 89
C -> 70 to 79
D -> 60 to 69
E -> 50 to 59
F -> everything else
 */

fun main() {

    println("Input the student's grade(0-100): ")
    var inputGrade = readLine()?:"0"
    var studentGrade = inputGrade.toInt()

    if(studentGrade > 100){
        println("Wrong number introduced")
    } else {
        var grade = if (studentGrade >= 90) {
            "A"
        } else if (studentGrade >= 80) {
            "B"
        } else if (studentGrade >= 70) {
            "C"
        } else if (studentGrade >= 60) {
            "D"
        } else if (studentGrade >= 50) {
            "E"
        } else {
            "F"
        }
        println("The student's grade on the new system is $grade")
    }


}