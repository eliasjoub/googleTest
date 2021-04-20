package test;

import Data.PageDetails;
import org.testng.annotations.Test;

public class UserRestTests {

    @Test
    public void usersEmailsTest() throws Exception {
        int pageNumber = 1;
        PageDetails details = PageDetails.getSpecificPage(pageNumber);
        int totalPages = Integer.parseInt(details.getTotalPages());
        for (; pageNumber <= totalPages; pageNumber++) {
            details = PageDetails.getSpecificPage(pageNumber);
            details.printAllUsersMail();
        }
    }
}
