package fakerJavaExamples;
import com.github.javafaker.Faker;

public class FakerExample {
    public static void main(String[] args) {
        Faker faker = new Faker();

        // Generate fake name
        String name = faker.name().fullName();
        System.out.println("Name: " + name);

        // Generate fake address
        String address = faker.address().fullAddress();
        System.out.println("Address: " + address);

        // Generate fake email
        String email = faker.internet().emailAddress();
        System.out.println("Email: " + email);

        // Generate fake phone number
        String phoneNumber = faker.phoneNumber().phoneNumber();
        System.out.println("Phone Number: " + phoneNumber);

        // Generate fake job title
        String jobTitle = faker.job().title();
        System.out.println("Job Title: " + jobTitle);
        
        System.out.println(faker.artist());
        String S1 = faker.animal().name();
        //.job().title();
        System.out.println("S1: " + S1);
        
        
       
    }
}
