public class Arrays_of_Strings {
    public static void main (String[] args) {
        int [] array = new int[10];
                array [3] = 123;
        System.out.println(array[3]);
        System.out.println(array[5]);
        String [] arr = new String[10];
        arr[0] = "Привет";
        arr[1] = "Кодер";
        arr[2] = "Китай";
        arr[3] = "Финляндия";
        arr[4] = "ЮАР";
        arr[5] = "Россия";
        arr[6] = "Норвегия";

        System.out.println(arr[0] + " " + arr[1]);
for (int i=0; i<arr.length; i++) {
    System.out.println(arr[i]);
}

    }
}
