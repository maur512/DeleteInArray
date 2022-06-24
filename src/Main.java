



class Main {

    public static void main (String[] args)
    {
        final int NUMBER_OF_ELEMENTS = 10;
        final int ELEMENT_FOR_DELETE = 5;
        int[] array = new int[NUMBER_OF_ELEMENTS];
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++)
        {
            array[i] =(int) (Math.random() * 10);
        }
        System.out.println("BEFORE:: \n " + java.util.Arrays.toString(array));
        array = deleteElement(array, ELEMENT_FOR_DELETE);
        System.out.println("AFTER:: \n " + java.util.Arrays.toString(array));
    }

    private static int[] deleteElement(int[] array, int el_del) {

        int result_ar = array.length;
        for (int i = 0; i < array.length; i++)
            if (array[i] == el_del) {
                for (int j = i; j < array.length -1; j++ )
                    array[j] = array[j+1];
                result_ar--;
            }
        return java.util.Arrays.copyOf(array,result_ar);
    }
}