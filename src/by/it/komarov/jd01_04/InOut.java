package by.it.komarov.jd01_04;

class InOut {

    static double[] getArray(String line){
        //line = line.trim(); // получаем строку
        String[] strArray = line.trim().split(" "); // split преобразование в строку
        // double[] array = new double[strArray.length]
        int sizeArray = strArray.length;
        double[] array = new double[sizeArray];

        for (int i = 0; i < strArray.length; i++) {
            array[i] = Double.parseDouble(strArray[i]); // присваиваю значение массива строк, в массив типа double
        }
        return array; //return null; stub - временная загушка.
    }

    static void printArray(double[] arr){
        for (double element : arr){
            System.out.println(element);
        }
        System.out.println();
    }

    static void printArray(double[] arr, String name, int columnCount){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-6.2f ", name, i, arr[i]);
            if((i+1)%columnCount==0 || i == arr.length){
                System.out.println();
            }
        }
    }
}
