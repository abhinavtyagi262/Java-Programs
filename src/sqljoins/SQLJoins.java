package sqljoins;

public class SQLJoins {

	public static void main(String[] args) {

        // Table1 name: student
        // Table1 column names: student_id, student_name, student_dob, course_id

        // Table2 name: course
        // Table2 column names: course_id, course_name

        // INNER JOIN (Query)
        System.out.println(
                "SELECT s.student_id, s.student_name, s.student_dob, c.course_name FROM student AS s \n" + // "s" is the alias of "student" table
                "INNER JOIN course AS c \n" + // "c" is the alias of "course" table
                "ON s.course_id = c.course_id;"
        );
        
        // LEFT JOIN/LEFT OUTER JOIN (Query)
        System.out.println(
                "SELECT s.student_id, s.student_name, s.student_dob, c.course_name FROM student AS s \n" +
                "LEFT JOIN course AS c \n" +
                "ON s.course_id = c.course_id;"
        );
        
        // RIGHT JOIN/RIGHT OUTER JOIN (Query)
        System.out.println(
                "SELECT s.student_id, s.student_name, s.student_dob, c.course_name FROM student AS s \n" +
                "RIGHT JOIN course AS c \n" +
                "ON s.course_id = c.course_id;"
        );
        
        // FULL JOIN/FULL OUTER JOIN (Query)
        System.out.println(
                "SELECT s.student_id, s.student_name, s.student_dob, c.course_name FROM student AS s \n" +
                "FULL JOIN course AS c \n" +
                "ON s.course_id = c.course_id;"
        );

	}

}
