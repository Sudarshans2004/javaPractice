package collection;

    import java.util.Arrays;

    public class CustomArrayList<E> {

        private Object[] data = new Object[10];
        private int size = 0;

        // 1. Add element to end
        public void add(E element) {
            if (size == data.length)
                data = Arrays.copyOf(data, size * 2);
            data[size++] = element;
        }

        // 2. Get element by index

        public E get(int index) {
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            return (E) data[index];
        }

        // 3. Remove element by index
        public void remove(int index) {
            if (index < 0 || index >= size)
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            System.arraycopy(data, index + 1, data, index, size - index - 1);
            data[--size] = null;
        }

        // 4. Get current size
        public int size() {
            return size;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < size; i++) {
                sb.append(data[i]);
                if (i < size - 1) sb.append(", ");
            }
            return sb.append("]").toString();
        }

        public static void main(String[] args) {
            CustomArrayList<String> list = new CustomArrayList<>();
            list.add("apple");
            list.add("banana");
            list.add("cherry");
            System.out.println(list);
            System.out.println(list.get(1));
            list.remove(1);
            System.out.println(list);
            System.out.println(list.size());
        }

}
