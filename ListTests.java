import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTests {
	@Test 
	public void testMerge() {
        List<String> userInput1 = new ArrayList<>();
    	List<String> userInput2 = new ArrayList<>();
    	List<String> expectedOutput = new ArrayList<>();
    	userInput1.add("b");
    	userInput2.add("a");
    	userInput2.add("c");
    	expectedOutput.add("a"); expectedOutput.add("b"); expectedOutput.add("c"); 
    	assertEquals(ListExamples.merge(userInput1, userInput2), expectedOutput);
    	}
	}


    