public class Main {

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("Анна", 25);
        map.put("Иван", 40);
        map.put("Анна", 26);

        System.out.println(map.get("Анна"));     // 26
        System.out.println(map.remove("Иван"));  // 40
        System.out.println(map.get("Иван"));     // null
        System.out.println(map.get("Олег"));     // null

        map.put(null, 1);
        System.out.println(map.get(null));       // 1
    }
}