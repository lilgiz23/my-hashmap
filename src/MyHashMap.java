public class MyHashMap {

    private Node[] buckets = new Node[16];

    private static class Node {
        private String key;
        private String value;
        private Node next;

        private Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(String key, String value) {
        int index = Math.abs(key.hashCode()) % buckets.length;

        Node current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    public String get(String key) {
        int index = Math.abs(key.hashCode()) % buckets.length;

        Node current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }
    public String remove(String key) {
        int index = Math.abs(key.hashCode()) % buckets.length;

        Node current = buckets[index];
        Node previous = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    buckets[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                return current.value;
            }
            previous = current;
            current = current.next;
        }

        return null;
    }
}