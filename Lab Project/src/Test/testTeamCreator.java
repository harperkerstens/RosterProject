package Test;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;
import Data.teamCreator;

public class testTeamCreator {

    @Test
    public void testWriteAndGetTeamFromFile() {
        // Prepare test data
        String filePath = "C:\\University\\Year 3 Semester 2\\COSC 210\\LAB PROJECT\\Lab Project\\src\\Test\\test_team_data.txt";
        String content = "Player1: John, Forward, 23, 30\nPlayer2: Jane, Guard, 12, 25";

        // Create an instance of teamCreator
        
        teamCreator creator = new teamCreator();

        // Write test data to file
        creator.writeToFile(content);

        // Retrieve team information from file
        String teamInfo = creator.getTeamFromFile();

        // Assert that the retrieved team information matches the written content
        assertEquals(content + "\n", teamInfo);

        // Clean up: delete the test file
        deleteTestFile(filePath);
    }

    // Helper method to delete the test file after the test
    private void deleteTestFile(String filePath) {
        try {
            java.nio.file.Files.delete(java.nio.file.Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
