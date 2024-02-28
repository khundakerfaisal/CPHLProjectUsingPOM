import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class autoIdGenerated {

    public static void main(String[] args) {
        Random random=new Random();
        String formattedYear = "2024";
        int formattedSequence = random.nextInt(200001);
        String autoNumber = "PI-" + formattedYear + "-" + formattedSequence;
        System.out.println(autoNumber);

        }

    }






