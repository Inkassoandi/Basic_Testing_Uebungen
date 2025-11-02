package Test_Basics;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class StudentTest {

    // wir erstellen einen Student der für und die Methode add zum Testen ausführen soll
    Student student = new Student();


    // ein Test wird erstellt, in dem wir dann die Methode "testAdd" erstellen und Testen

    @Test
    public void testAdd(){

        int sum = student.add(2,2); // wir erstellen die Variable "sum" deren Wert ist das Ergebnis der "add" Methode
        assertEquals(4,sum);    // hir überprüfen wir ob "4" der Inhalt der Variable "sum" ist

        int sum2 = student.add(3,10);
        assertEquals(13,sum2);

        int sum3 = student.add(1,1);
        assertEquals(2,sum3);
    }

  
}