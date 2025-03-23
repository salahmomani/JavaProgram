package advance;

import com.sun.jdi.connect.spi.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) {

//
//
//    Collection<String> collection = new java.util.ArrayList<>(List.of("Apple", "Banana", "Cherry"));
//        Collection<String> collection2= new java.util.ArrayList<>(List.of("Apple", "Banana", "Cherry"));
//        collection.addAll(collection2);
//for (String item : collection) {
//        System.out.println(item);
//    }
//        final boolean apple = collection.contains("Apple");
//        System.out.println(apple);
//        List<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add(1,"D");
//        System.out.println(list.get(1));
//
//
//        Set<String> set = new LinkedHashSet<>();
//        set.add("X");
//        set.add("Y");
//        set.add("Z");
//        System.out.println(set);
//        System.out.println(set.size());
//
//
//
//
//
//        SortedSet<Integer> sortedSet = new TreeSet<>();
//        sortedSet.add(5);
//        sortedSet.add(1);
//        sortedSet.add(3);
//
//        System.out.println(sortedSet.first());
//        System.out.println(sortedSet.last());
//
//        Collection<String> strings = new ArrayList<>();
//        strings.add("one");
//        strings.add("two");
//        strings.add("three");
//
//        Collection<String> first = new ArrayList<>();
//        first.add("one");
//        first.add("four");
//
//        boolean hasChanged = strings.addAll(first);
//
//        System.out.println("Has strings changed? " + hasChanged);
//        System.out.println("strings = " + strings);
//
//        Collection<String> stringgs = List.of("one", "two", "three", "four");
//        for (Iterator<String> iterator = stringgs.iterator(); iterator.hasNext();) {
//            String element = iterator.next();
//            if (element.length() == 3) {
//                System.out.println(element);
//            }
//        }
//        LinkedList<Integer> list1=new LinkedList<>();
//        list1.add(5);
//        list1.add(6);
//        list1.add(7);
//        list1.add(8);
//        list1.add(9);
//        list1.add(9);
//        System.out.println(list1);
//        list1.remove();
//        System.out.println(list1);
//        list1.remove(2);
//        System.out.println(list1.offer(-5));
//        System.out.println(list1);
//        list1.pop();
//        System.out.println(list1);
//PriorityQueue<Integer> queue=new PriorityQueue<>();
//        queue.add(4);
//        queue.add(5);
//        queue.add(6);
//        queue.add(7);
//        queue.add(8);
//        queue.add(9);
//        queue.add(10);
//        System.out.println(queue);
//        System.out.println( queue.offer(11));
//        System.out.println(queue);
//        System.out.println(queue.contains(77));
//
//        System.out.println(queue.poll());

//
//
//        HashMap<String,Integer> map1=new HashMap<>();
//        map1.put("salah1",1);
//        map1.put("salah2",2);
//        map1.put("salah3",3);
//        map1.put("salah4",4);
//        System.out.println(map1);
//        System.out.println(map1.get("salah2"));
//        System.out.println(map1.keySet());
//        System.out.println(map1.values());
//        System.out.println(map1.entrySet());
//        map1.entrySet().forEach(System.out::println);

//        TreeMap<String,Integer> map1=new TreeMap<>();
//        map1.put("salah1",1);
//        map1.put("salah2",2);
//        map1.put("salah3",3);
//        map1.put("salah4",4);
//        System.out.println(map1);
//        System.out.println(map1.get("salah2"));
//        System.out.println(map1.keySet());
//        System.out.println(map1.values());
//        System.out.println(map1.entrySet());
//        map1.entrySet().forEach(System.out::println);
//        System.out.println(map1.higherEntry("salah1" ));
//        System.out.println(map1.lowerEntry("salah4" ));

//Set <Integer> set=new HashSet<>();
//        set.add(4);
//        set.add(5);
//        set.add(6);
//        set.add(7);
//        System.out.println(set);

//        List <Integer> list=new ArrayList<>();
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(4);
//        list.add(3);
//
//        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(Collections.binarySearch(list,7));
//        System.out.println(list);

//        List<String> strings = List.of("one","two","three","four");
//        Stream<String> str=strings.stream();
//        var map = strings.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
//        map.forEach((key, value) -> System.out.println(key + " :: " + value));
//        strings.forEach(n-> System.out.println(n));
//        str.forEach(n-> System.out.println(n));

//        record Sale(String product, LocalDate date, int amount) {
//            // this is a record
//        }
//
//        List<Sale> sales = List.of(
//                new Sale("Orange", LocalDate.of(2022, Month.JANUARY, 2), 4),
//                new Sale("Pumpkin", LocalDate.of(2022, Month.OCTOBER, 18), 12),
//                new Sale("Butternut", LocalDate.of(2022, Month.OCTOBER, 03), 6),
//                new Sale("Apple", LocalDate.of(2022, Month.JANUARY, 28), 3)
//        );
//
//        int amountSoldInOctober = 0;
//        for (Sale sale: sales) {
//            if (sale.date().getMonth() == Month.JANUARY) {
//                amountSoldInOctober += sale.amount();
//            }
//        }
//
//        System.out.println("Amount sold in October: " + amountSoldInOctober);
//        List<Integer> list=Arrays.asList(4,5,2,1);
//        list.stream().sorted().filter(n->n%2==0).map(n->n*3).forEach(n-> System.out.println(n));
//
//
//        record City(String name, int population) {}
//        record Country(String name, List<City> cities) {}
//
//        City newYork= new City("New York", 8_258);
//        City losAngeles = new City("Los Angeles", 3_821);
//        Country usa = new Country("USA", List.of(newYork, losAngeles));
//
//        City london = new City("London", 8_866);
//        City manchester = new City("Manchester", 568);
//        Country uk = new Country("United Kindgom", List.of(london, manchester));
//
//        City paris = new City("Paris", 2_103);
//        City marseille = new City("Marseille", 877);
//        Country france = new Country("France", List.of(paris, marseille));
//
//        List<Country> countries = List.of(usa, uk, france);
//
//        int totalPopulation =
//                countries.stream()
//                        .flatMap(country -> country.cities().stream())
//                        .mapToInt(City::population)
//                        .sum();
//        System.out.println("Total population = " + totalPopulation);
//
//
//        Function<String, Stream<Integer>> flatParser = s -> {
//            try {
//                return Stream.of(Integer.parseInt(s));
//            } catch (NumberFormatException e) {
//            }
//            return Stream.empty();
//        };
//
//        List<String> strings = List.of("1", " ", "2", "3 ", "", "3");
//
//        List<Integer> ints =
//                strings.stream()
//                        .flatMap(flatParser)
//                        .collect(Collectors.toList());
//        System.out.println("ints = " + ints);
//
//
//        List<Integer> intss = List.of(1, 4, 2, 1, 3, 3);
//
//        List<Integer>  distincts =
//                intss.stream()
//                        .distinct()
//                        .toList();
//        System.out.println("distinct ints: " + distincts);
//
//        Stream<String> iterated = Stream.iterate("+", s -> s + "+");
//        iterated.limit(3L).forEach(System.out::println);
//        Stream.Builder<String> builder = Stream.<String>builder();
//        builder.add("one")
//                .add("two")
//                .add("three")
//                .add("four");
//        Stream<String> stream = builder.build();
//
//        List<String> listt = stream.toList();
//        System.out.println("list = " + listt);
//
//        List<Integer> ints = List.of(3, 6, 2, 1);
//
//        int sum = ints.get(0);
//        for (int index = 1; index < ints.size(); index++) {
//            sum += ints.get(index);
//        }
//        System.out.println("sum = " + sum);

//
//        try (FileInputStream fis = new FileInputStream("data.txt")) {
//            int data;
//            while ((data = fis.read()) != -1) {
//                System.out.print((char) data);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//        try (FileOutputStream fos = new FileOutputStream("data2.txt")) {
//            String text = "Hello, Java I/O!";
//            fos.write(text.getBytes());
//            System.out.println("yes");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        File file = new File("newfile.txt");
//
//        try {
//            if (file.createNewFile()) {
//                System.out.println("creating");
//            } else {
//                System.out.println(" it is created ");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        String text = "Hello123";
//        String pattern = "[A-Za-z]+\\d+";
//
//        Pattern p = Pattern.compile(pattern);
//        Matcher m = p.matcher(text);
//        System.out.println(text.matches(pattern) ? "correct" : " failed");
//
//        if (m.matches()) {
//            System.out.println("النص متطابق!");
//        } else {
//            System.out.println("النص غير متطابق!");
//        }
//
//
//        String text1 = "  f1irst 135 s2econd 246 end3";
//        Pattern pp = Pattern.compile("\\d+");
//        Matcher mm = pp.matcher(text1);
//
//        while (mm.find()) {
//            System.out.println("found: " + mm.group());
//        }
//
//        String text = "Java is fun, Java is powerful!";
//        Pattern p = Pattern.compile("Java");
//        Matcher m = p.matcher(text);
//
//        int count = 0;
//        while (m.find()) {
//            count++;
//            System.out.println("find java in  " + m.end());
//        }
//        System.out.println("number of count: " + count);
//
//
//Thread thread=new Thread();
//thread.start();
//
//MyThread myThread=new MyThread();
//myThread.start();
//
//        Thread myThread2=new Thread(new MyThread2.myrRun());
//        myThread2.start();
//
        Runnable myRnu=new Runnable() {
            @Override
            public void run() {
                System.out.println("run tart");
                System.out.println("run finish");
            }
        };
        Runnable runnable=() -> {
            Thread thread3 = new Thread(myRnu);
            thread3.start();

        };
//        String threadName=Thread.currentThread().getName();
//        System.out.println(threadName+" is Running");
//        Thread thread4=new Thread(runnable,"thread 4");
//        thread4.start();
//
//        Thread thread5=new Thread(runnable,"thread 5");
//        thread5.start();

       // Thread vThread =Thread.ofVirtual().start(runnable);
//        try (Connection connection= DriverManager.getConnection("jdbc:h2:mem:"){
//            System.out.println("");
//        }
//catch (SQLException e)
//
//{e.printStackTrace();}
//        PreparedStatement Ps=conection.
//        String url      = "jdbc:h2:~/test";   //database specific url.
//        String user     = "sa";
//        String password = "";
//
//        Connection connection =
//                DriverManager.getConnection(url, user, password);
    }
    }