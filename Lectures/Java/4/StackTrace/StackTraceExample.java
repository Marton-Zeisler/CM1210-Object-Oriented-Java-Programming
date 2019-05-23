
public class StackTraceExample {

	public static void main( String[] args ) {
        System.out.println( "main about to call foo1" );
        foo1();
        System.out.println( "main finished" );
	}
	
	public static void foo1() {
	    System.out.println( "foo1 called" );
	    System.out.println( "foo1 about to call foo2" );
	    foo2();
	    System.out.println( "foo1 finished" );
    }
    
    public static void foo2() {
	    System.out.println( "foo2 called" );
	    
	    System.out.println( "foo2 about to call foobar" );
	    foobar();
	    
	    System.out.println( "foo2 about to call foobar (again)" );
	    foobar();
	    
	    System.out.println( "foo2 about to call foo3" );
	    foo3();
	    
	    System.out.println( "foo2 finished" );
    }
    
	public static void foo3() {
	    System.out.println( "foo3 called" );
	    System.out.println( "foo3 about to throw an exception" );
	    throw new RuntimeException( "Something went wrong in foo3!" );
    }
    
    public static void foobar() {
        System.out.println( "foobar called" );
        System.out.println( "foobar finished" );
    }
}
			