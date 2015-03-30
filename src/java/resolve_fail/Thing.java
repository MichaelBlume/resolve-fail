package resolve_fail;

class Thing {
  public static void hello(String foo, String bar) {
    System.out.println("hello with String");
  }

  public static void hello(String foo, Number bar) {
    System.out.println("hello with Number");
  }
}
