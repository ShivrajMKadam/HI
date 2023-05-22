public class repeatcount {

        public static void main(String[] args) {
            int[] arr = {4, 5, 6, 4, 3, 5, 7};

            int repeatedCount = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        repeatedCount++;
                        break;  // Found a repeated element, no need to continue checking
                    }
                }
            }

            System.out.println("Number of repeated elements: " + repeatedCount);
        }
    }

