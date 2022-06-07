package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class SortNumber {

	@Test
	public void test()
	{
		//int[]number= {1,2,3,4,5,6,7,3,1};
		
		List<Integer>value=Arrays.asList(1,2,3,4,5,6,7,3,1);
				
		List<Integer>li=value.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li);
	}
}
