public class MaxMin {
        public static int Max(int [] array){
            int max;
            if (array.length != 0) {
                max = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > max)
                        max = array[i];
                }
                return max;
            }
            else
                return -1;
        }

        public static int Min(int [] array){
            int min;
            if (array.length != 0) {
                min = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < min)
                        min = array[i];
                }
                return min;
            }
            else
                return -1;
        }
}
