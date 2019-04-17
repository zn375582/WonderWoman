
import org.junit.runner.RunWith;
	import org.junit.runners.Suite;
	import org.junit.runner.JUnitCore;
	import org.junit.runner.Result;
	import org.junit.runner.notification.Failure;
	@RunWith(Suite.class)
	@Suite.SuiteClasses(
	{
	 CircleTest.class, // replace with all your test classes
	 DiamondTestOfficial.class, // replace with all your test classes
	 IsoscelesTriangleTest.class,
	 OvalTestOfficial.class,
	 PolygonTest.class,
	 PolyLineTest.class,
	 RectangleTest.class,
	 RightTriangleTest.class,
	 ShapeTest.class,
	 SinusoidTest.class,
	 SquareTest.class,
	 TriangleTest.class
	 
	})
	
	public class TestRunner
	{
	 public static void main(String[] args)
	 {
	 Result result = JUnitCore.runClasses(TestRunner.class);
	 for (Failure failure : result.getFailures())
	 {
	 System.out.println(failure.toString());
	 }
	 System.out.println(result.wasSuccessful());
	 }
}
