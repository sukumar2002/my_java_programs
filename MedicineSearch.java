public class MedicineSearch {
    static class Medicine {
        int id;
        String name;

        Medicine(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static int binarySearch(Medicine[] meds, int key) {
        int low = 0, high = meds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (meds[mid].id == key)
                return mid;
            else if (meds[mid].id < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Medicine[] stock = {
                new Medicine(101, "Paracetamol"),
                new Medicine(103, "Aspirin"),
                new Medicine(105, "Cough Syrup")
        };

        int result = binarySearch(stock, 103);
        if (result != -1)
            System.out.println("Medicine Found: " + stock[result].name);
        else
            System.out.println("Medicine Not Found");
    }
}
