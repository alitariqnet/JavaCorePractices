package Java;

// Outer class must be declared public
public class NestedClasses {

    public String publicMemberOuterClass = "I am public member of outer class.";
    private String privateMemberOuterClass = "I am private member of outer class.";

    class InnerClass {

        public String publicMemberInnerClass = "I am public member of inner class.";
        private String privateMemberInnerClass = "I am private member of inner class.";

        public static void main(String[] args) {

        }
    }
    static class StaticNestedClass {

        public String publicMemberStaticNestedClass = "I am public member of static nested class.";
        private String privateMemberStaticNestedClass = "I am private member of static nested class.";

        public static void main(String[] args) {

        }
    }

    public static void main(String[] args) {


    }

}
