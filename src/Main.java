public class Main {

    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put("Анна", "25");
        map.put("Иван", "40");

        System.out.println(map.remove("Анна")); // 25
        System.out.println(map.get("Анна"));    // null
        System.out.println(map.get("Иван"));    // 40
        System.out.println(map.remove("Олег")); // null
    }
}