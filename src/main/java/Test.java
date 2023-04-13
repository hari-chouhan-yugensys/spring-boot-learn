import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	
	public Test() {
		// TODO Auto-generated constructor stub
	}

	
	public int getValue(String name) {
		return 0;}
	
	public String getValue(int name) {
		return "";}
	
	
	public static void main(String[] args) {
		
		List<Integer> Llist = new LinkedList<Integer>();
	
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(3);
		list.add(10);
		list.add(5);
		list.add(120);
		
		
		//Sorting
		List<Integer> sort = list.stream().sorted().collect(Collectors.toList());
		
		// Get min/max by summary statics
		
		IntSummaryStatistics stats = list.stream().mapToInt(x->x).summaryStatistics();

		System.out.println("Lowest number in List : " + stats.getMin());
		
		
		// MAx with compare
		Optional<Integer> maxNumber = list.stream().max((i, j) -> i.compareTo(j));
		System.out.println(maxNumber.get());
		
		// Filter list
		List<Integer> sqrt = list.stream().filter(i -> (i*i)>=100).map(i->i*i).collect(Collectors.toList());
		
		// Grouping
		Map<Object, List<Integer>> sample = list.stream().collect(Collectors.groupingBy(i->i));
		
		Map<Integer, List<Integer>> empMap1 = list.stream().collect(Collectors.groupingBy(i->i, 
				Collectors.mapping(i->i*i, Collectors.toList())));
		
		
		Map<Object, Long> empMap11 = list.stream().collect(Collectors.groupingBy(i->i, 
				Collectors.counting()));
		
		// Parallel Stream
		
		list.stream().parallel();
		
		
		
		
		
		String opString = "hari_singh_chouhan_is_java_developer";
		
		char[] charArray = opString.toCharArray();
		
		Map<Object, Long> test = Stream.of(charArray)
									.collect(Collectors.groupingBy(c->c, Collectors.counting()));
		
		
		
		
		
		
		System.out.println("Hello ");
		
		
		

	}
	
	
	

}
