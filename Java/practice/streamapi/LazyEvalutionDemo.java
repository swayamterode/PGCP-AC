package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvalutionDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Swayam", "Ravi", "Sham");
		Stream<String> stream = list.stream().filter(x -> {
			System.out.println("Filtering :" + x);
			return x.length() > 3;
		});

		System.out.println("Befor Terminal Operation");
		List<String> res = stream.collect(Collectors.toList());
		System.out.println("After terminal Operation!!");
		System.out.println(res);
	}
}

//Lazy evaluation means intermediate operations like filter do nothing
//until a terminal operation (.collect(), .count(), etc.) is called.
//                                                                        
//Proof from your output:                                                 
//Befor Terminal Operation       ← filter hasn't run yet                  
//Filtering :Swayam              ← filter runs only NOW (on collect)      
//Filtering :Ravi                                                   
//Filtering :Sham                                                         
//After terminal Operation!!                                              
//[Swayam, Ravi]                                                          
//                                                                        
//The filter lambda was defined on line 10 but only executed on line 14
//when .collect() triggered it.    