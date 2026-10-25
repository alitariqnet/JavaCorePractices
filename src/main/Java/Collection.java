package Java;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class Collection {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList();
        ll.add("hello");
        ll.add(null);
        ll.add(" world");
        ll.add(1, null);
//		ll.forEach());
        System.out.println(ll.size() + " " + ll.toString());
        String s = ll.pop();
        System.out.println(ll.size() + " " + ll.toString());
        String s2 = ll.remove();
        System.out.println(ll.size() + " " + s + " " + s2 + " " + ll.toString());

        System.out.println("stack practice");
        Stack st = new Stack();
        st.add(1);
        st.add("my");
        st.add(true);
        st.pop();
        System.out.println(st);

        System.out.println("Queue practice");
        Queue queue = new PriorityQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.remove();
        System.out.println(queue);

        ArrayList al = new ArrayList();
        al.add("abc");

        // Set is interface that extends Collection
        /**
         * Constructs a new, empty set; the backing <tt>HashMap</tt> instance has
         * default initial capacity (16) and load factor (0.75).
         */
        System.out.println("Set practice");
        Set set = new HashSet();
        // A set is the representation of the mathematical set
        set.add(0);
        // A Set can contain a null value
        set.add(null);
        set.add("Ali");
        set.add('c');
        System.out.print(set.contains('c'));
        System.out.println("");

        // Order of elements remains the same
        set.stream().forEach(System.out::println);
        set.remove(null);
        set.size();
        /*
         * We need to iterate through all the elements of the set
         * we can't get an element by index
         */

        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("");
        System.out.println(set.toString());

        // HashTable synchronized collections
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>(10);
//		ht.put("Umar", 1);
//		ht.put("Ali", 2);
//		ht.put("Hassan", 3);

        // Vector synchronized
        Vector v = new Vector(10);
        v.add('a');
        v.add(1);
        v.add("hello");
        v.add(null);
        v.add(1);
        v.remove(1);
        System.out.println(v.toString());

        Map m = new HashMap(10);
        m.put('1', "100");
        m.put('2', "200");
        m.put('3', "300");
        m.put('4', "400");
        m.put('5', "500");
        m.put('6', "600");
        m.put('7', "700");
        m.put('8', "800");
        m.put('9', "900");
        m.put('1', "1000");
        m.put('1', "1100");
        System.out.println(m);

        System.out.println("Calculate table size for 100 -> "+tableSizeFor(100));
        // Does not maintain order of insertion
        Set<String> hs = null;
        System.out.println(hs);
        hs = new HashSet<>();
        hs.add("S");
        hs.add("Z");
        hs.add("F");
        hs.add("A");
        hs.add("D");
        hs.add("C");
        hs.add("B");
        hs.parallelStream().forEach((e)->{System.out.println("Element "+ e +" processed by: "+Thread.currentThread().getName());});
        System.out.println("----");
        hs.stream().forEach((e)->{System.out.println("Element "+ e +" processed by: "+Thread.currentThread().getName());});
        // Does maintain order of insertion
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(7);
        lhs.add(6);
        lhs.add(9);
        lhs.add(3);
        lhs.add(5);
//        lhs.iterator()
//        System.out.println(hs);
        System.out.println(lhs);
        /*
        Output:
        C:\Users\alibaba\.jdks\openjdk-23\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.3\lib\idea_rt.jar=49746:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\alibaba\Downloads\demo\demo\target\classes;C:\Users\alibaba\.m2\repository\org\springframework\boot\spring-boot-starter-data-jpa\3.3.4\spring-boot-starter-data-jpa-3.3.4.jar;C:\Users\alibaba\.m2\repository\org\springframework\boot\spring-boot-starter-aop\3.3.4\spring-boot-starter-aop-3.3.4.jar;C:\Users\alibaba\.m2\repository\org\springframework\spring-aop\6.1.13\spring-aop-6.1.13.jar;C:\Users\alibaba\.m2\repository\org\aspectj\aspectjweaver\1.9.22.1\aspectjweaver-1.9.22.1.jar;C:\Users\alibaba\.m2\repository\org\springframework\boot\spring-boot-starter-jdbc\3.3.4\spring-boot-starter-jdbc-3.3.4.jar;C:\Users\alibaba\.m2\repository\com\zaxxer\HikariCP\5.1.0\HikariCP-5.1.0.jar;C:\Users\alibaba\.m2\repository\org\springframework\spring-jdbc\6.1.13\spring-jdbc-6.1.13.jar;C:\Users\alibaba\.m2\repository\org\hibernate\orm\hibernate-core\6.5.3.Final\hibernate-core-6.5.3.Final.jar;C:\Users\alibaba\.m2\repository\jakarta\persistence\jakarta.persistence-api\3.1.0\jakarta.persistence-api-3.1.0.jar;C:\Users\alibaba\.m2\repository\jakarta\transaction\jakarta.transaction-api\2.0.1\jakarta.transaction-api-2.0.1.jar;C:\Users\alibaba\.m2\repository\org\jboss\logging\jboss-logging\3.5.3.Final\jboss-logging-3.5.3.Final.jar;C:\Users\alibaba\.m2\repository\org\hibernate\common\hibernate-commons-annotations\6.0.6.Final\hibernate-commons-annotations-6.0.6.Final.jar;C:\Users\alibaba\.m2\repository\io\smallrye\jandex\3.1.2\jandex-3.1.2.jar;C:\Users\alibaba\.m2\repository\com\fasterxml\classmate\1.7.0\classmate-1.7.0.jar;C:\Users\alibaba\.m2\repository\net\bytebuddy\byte-buddy\1.14.19\byte-buddy-1.14.19.jar;C:\Users\alibaba\.m2\repository\org\glassfish\jaxb\jaxb-runtime\4.0.5\jaxb-runtime-4.0.5.jar;C:\Users\alibaba\.m2\repository\org\glassfish\jaxb\jaxb-core\4.0.5\jaxb-core-4.0.5.jar;C:\Users\alibaba\.m2\repository\org\eclipse\angus\angus-activation\2.0.2\angus-activation-2.0.2.jar;C:\Users\alibaba\.m2\repository\org\glassfish\jaxb\txw2\4.0.5\txw2-4.0.5.jar;C:\Users\alibaba\.m2\repository\com\sun\istack\istack-commons-runtime\4.1.2\istack-commons-runtime-4.1.2.jar;C:\Users\alibaba\.m2\repository\jakarta\inject\jakarta.inject-api\2.0.1\jakarta.inject-api-2.0.1.jar;C:\Users\alibaba\.m2\repository\org\antlr\antlr4-runtime\4.13.0\antlr4-runtime-4.13.0.jar;C:\Users\alibaba\.m2\repository\org\springframework\data\spring-data-jpa\3.3.4\spring-data-jpa-3.3.4.jar;C:\Users\alibaba\.m2\repository\org\springframework\data\spring-data-commons\3.3.4\spring-data-commons-3.3.4.jar;C:\Users\alibaba\.m2\repository\org\springframework\spring-orm\6.1.13\spring-orm-6.1.13.jar;C:\Users\alibaba\.m2\repository\org\springframework\spring-context\6.1.13\spring-context-6.1.13.jar;C:\Users\alibaba\.m2\repository\org\springframework\spring-tx\6.1.13\spring-tx-6.1.13.jar;C:\Users\alibaba\.m2\repository\org\springframework\spring-beans\6.1.13\spring-beans-6.1.13.jar;C:\Users\alibaba\.m2\repository\jakarta\annotation\jakarta.annotation-api\2.1.1\jakarta.annotation-api-2.1.1.jar;C:\Users\alibaba\.m2\repository\org\slf4j\slf4j-api\2.0.16\slf4j-api-2.0.16.jar;C:\Users\alibaba\.m2\repository\org\springframework\spring-aspects\6.1.13\spring-aspects-6.1.13.jar;C:\Users\alibaba\.m2\repository\org\springframework\boot\spring-boot-starter-web\3.3.4\spring-boot-starter-web-3.3.4.jar;C:\Users\alibaba\.m2\repository\org\springframework\boot\spring-boot-starter\3.3.4\spring-boot-starter-3.3.4.jar;C:\Users\alibaba\.m2\repository\org\springframework\boot\spring-boot-starter-logging\3.3.4\spring-boot-starter-logging-3.3.4.jar;C:\Users\alibaba\.m2\repository\ch\qos\logback\logback-classic\1.5.8\logback-classic-1.5.8.jar;C:\Users\alibaba\.m2\repository\ch\qos\logback\logback-core\1.5.8\logback-core-1.5.8.jar;C:\Users\alibaba\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.23.1\log4j-to-slf4j-2.23.1.jar;C:\Users\alibaba\.m2\repository\org\apache\logging\log4j\log4j-api\2.23.1\log4j-api-2.23.1.jar;C:\Users\alibaba\.m2\repository\org\slf4j\jul-to-slf4j\2.0.16\jul-to-slf4j-2.0.16.jar;C:\Users\alibaba\.m2\repository\org\yaml\snakeyaml\2.2\snakeyaml-2.2.jar;C:\Users\alibaba\.m2\repository\org\springframework\boot\spring-boot-starter-json\3.3.4\spring-boot-starter-json-3.3.4.jar;C:\Users\alibaba\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.17.2\jackson-databind-2.17.2.jar;C:\Users\alibaba\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.17.2\jackson-annotations-2.17.2.jar;C:\Users\alibaba\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.17.2\jackson-core-2.17.2.jar;C:\Users\alibaba\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.17.2\jackson-datatype-jdk8-2.17.2.jar;C:\Users\alibaba\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.17.2\jackson-datatype-jsr310-2.17.2.jar;C:\Users\alibaba\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.17.2\jackson-module-parameter-names-2.17.2.jar;C:\Users\alibaba\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\3.3.4\spring-boot-starter-tomcat-3.3.4.jar;C:\Users\alibaba\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\10.1.30\tomcat-embed-core-10.1.30.jar;C:\Users\alibaba\.m2\repository\org\apache\tomcat\embed\tomcat-embed-el\10.1.30\tomcat-embed-el-10.1.30.jar;C:\Users\alibaba\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\10.1.30\tomcat-embed-websocket-10.1.30.jar;C:\Users\alibaba\.m2\repository\org\springframework\spring-web\6.1.13\spring-web-6.1.13.jar;C:\Users\alibaba\.m2\repository\io\micrometer\micrometer-observation\1.13.4\micrometer-observation-1.13.4.jar;C:\Users\alibaba\.m2\repository\io\micrometer\micrometer-commons\1.13.4\micrometer-commons-1.13.4.jar;C:\Users\alibaba\.m2\repository\org\springframework\spring-webmvc\6.1.13\spring-webmvc-6.1.13.jar;C:\Users\alibaba\.m2\repository\org\springframework\spring-expression\6.1.13\spring-expression-6.1.13.jar;C:\Users\alibaba\.m2\repository\org\springframework\boot\spring-boot-devtools\3.3.4\spring-boot-devtools-3.3.4.jar;C:\Users\alibaba\.m2\repository\org\springframework\boot\spring-boot\3.3.4\spring-boot-3.3.4.jar;C:\Users\alibaba\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\3.3.4\spring-boot-autoconfigure-3.3.4.jar;C:\Users\alibaba\.m2\repository\org\postgresql\postgresql\42.7.4\postgresql-42.7.4.jar;C:\Users\alibaba\.m2\repository\org\checkerframework\checker-qual\3.42.0\checker-qual-3.42.0.jar;C:\Users\alibaba\.m2\repository\org\projectlombok\lombok\1.18.34\lombok-1.18.34.jar;C:\Users\alibaba\.m2\repository\jakarta\xml\bind\jakarta.xml.bind-api\4.0.2\jakarta.xml.bind-api-4.0.2.jar;C:\Users\alibaba\.m2\repository\jakarta\activation\jakarta.activation-api\2.1.3\jakarta.activation-api-2.1.3.jar;C:\Users\alibaba\.m2\repository\org\springframework\spring-core\6.1.13\spring-core-6.1.13.jar;C:\Users\alibaba\.m2\repository\org\springframework\spring-jcl\6.1.13\spring-jcl-6.1.13.jar com.example.demo.CollectionsDemo
        Element D processed by: ForkJoinPool.commonPool-worker-1
        Element F processed by: ForkJoinPool.commonPool-worker-1
        Element A processed by: ForkJoinPool.commonPool-worker-2
        Element B processed by: ForkJoinPool.commonPool-worker-2
        Element S processed by: ForkJoinPool.commonPool-worker-2
        Element C processed by: ForkJoinPool.commonPool-worker-2
        Element Z processed by: main
        ----
        Element A processed by: main
        Element B processed by: main
        Element S processed by: main
        Element C processed by: main
        Element D processed by: main
        Element F processed by: main
        Element Z processed by: main
        [7, 6, 9, 3, 5]
         */

        List list = Collections.synchronizedList(new LinkedList());
        list.add("abc");
        list.add("def");
        list.add("ghi");
        list.add("jkl");
        list.add("mno");
        list.add("pqr");
        list.add("stu");
        list.add("vwx");
        list.add("yz");
        System.out.println(list);

        Iterator<String> ite;

        Number number;
        number = 10;
        System.out.println(number);

        Optional<String> opstr = Optional.empty();
        System.out.println(opstr);
        System.out.println(opstr.isPresent());
        String str = null;
//        System.out.println(str.toLowerCase(Locale.ROOT));  // NPE
    }
    static final int MAXIMUM_CAPACITY = 1 << 30;

    static final int tableSizeFor(int cap) {
        int n = -1 >>> Integer.numberOfLeadingZeros(cap - 1);
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
