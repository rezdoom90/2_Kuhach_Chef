package by.epam.chef.test;

import by.epam.chef.exception.MissingFileException;
import by.epam.chef.reader.InputFileDataReader;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class InputFileReaderTest {
    @Test
    public void testGetFileData_FileDoesNotExist() {
        try {
            InputFileDataReader.getFileData("file.txt");
            fail();
        } catch (MissingFileException ex) {
            //Success
        }
    }

    @Test
    public void testGetFileData_FileHasData() {
        try {
            assertTrue (InputFileDataReader.getFileData("data/Input.txt").size() > 0);
        } catch (MissingFileException ex) {
            ex.printStackTrace();
            fail();
        }
    }

    @Test
    public void testGetFileData_DefaultFileDoesExist() {
        try {
            InputFileDataReader.getFileData("");
        } catch (MissingFileException ex) {
            ex.printStackTrace();
            fail();
        }
    }

    @Test
    public void testGetFileData_DefaultFileHasData() {
        try {
            assertTrue (InputFileDataReader.getFileData("").size() > 0);
        } catch (MissingFileException ex) {
            ex.printStackTrace();
            fail();
        }
    }
}
